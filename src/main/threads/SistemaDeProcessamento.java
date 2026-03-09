package threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Simula um sistema de processamento assíncrono, em que arquivos são
 * enfileirados em uma {@link BlockingQueue} e processados por uma
 * thread consumidora que representa uma "IA".
 */
public class SistemaDeProcessamento {
	public static void main(String[] args) {
        // A fila é o "correio" entre as threads
        BlockingQueue<String> filaDeArquivos = new LinkedBlockingQueue<>(3);

        // THREAD CONSUMIDORA (Simula a IA)
        Thread iaThread = new Thread(() -> {
            try {
                while (true) {
                    String arquivo = filaDeArquivos.take(); // Fica parado aqui se a fila estiver vazia
                    System.out.println("🤖 IA: Começando a processar " + arquivo);
                    Thread.sleep(3000); // IA demora 3 segundos
                    System.out.println("✅ IA: Finalizado " + arquivo);
                }
            } catch (InterruptedException e) { e.printStackTrace(); }
        });

        iaThread.start();

        // MAIN THREAD (Simula você enviando arquivos)
        try {
            String[] arquivos = {"audio1.wav", "audio2.wav", "audio3.wav", "audio4.wav", "audio5.wav"};
            for (String arq : arquivos) {
                System.out.println("📂 Sistema: Enviando " + arq + " para a fila...");
                filaDeArquivos.put(arq); // Se a fila estiver cheia (3 itens), ele trava aqui até a IA liberar espaço
                System.out.println("📩 Sistema: " + arq + " entrou na fila.");
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
