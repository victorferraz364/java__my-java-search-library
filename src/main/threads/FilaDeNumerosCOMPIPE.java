package threads;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Demonstra o uso de {@link java.util.concurrent.LinkedBlockingQueue} como
 * "pipeline" entre threads produtoras e uma thread consumidora (montador).
 * <p>
 * Também ilustra o uso de {@link Thread#join(long)} e interrupção de threads
 * para controlar tempo de execução de tarefas pesadas.
 */
public class FilaDeNumerosCOMPIPE {

    public static void main(String[] args) {

    	// As duas esteiras que trazem as peças
        LinkedBlockingQueue<Integer> filaPos = new LinkedBlockingQueue<>(5);
        LinkedBlockingQueue<Integer> filaNeg = new LinkedBlockingQueue<>(5);

        // THREAD 1: Gerador de Positivos
        new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("➕ Gerando Positivo: " + i);
                    filaPos.put(i);
                    Thread.sleep(500); // Simulando tempo de processamento
                }
            } catch (InterruptedException e) {}
        }).start();

        // THREAD 2: Gerador de Negativos
        new Thread(() -> {
            try {
                for (int i = 1; i <= 9; i++) {
                    System.out.println("➖ Gerando Negativo: " + (-i));
                    filaNeg.put(-i);
                    Thread.sleep(100); // Thread Negativa é BEM mais lenta
                }
            } catch (InterruptedException e) {}
        }).start();

        // THREAD 3: O MONTADOR (A "IA" que une os dados)
      Thread montador =  new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    // O take() trava aqui até que AMBAS as filas tenham pelo menos um item
                    int p = filaPos.take(); 
                    int n = filaNeg.take(); 

                    int[] matrizFinal = {p, n};
                    System.out.println("🧱 MONTADOR criou a matriz: [" + matrizFinal[0] + ", " + matrizFinal[1] + "]");
                }
                System.out.println("🏁 Processamento concluído com sucesso!");
            } catch (InterruptedException e) {}
        });
montador.start();
        
        Thread tarefaPesada = new Thread(() -> {
            try {
                System.out.println("⏳ Tarefa: Comecei algo que leva 10 segundos...");
                Thread.sleep(10000); 
                System.out.println("⏳ Tarefa: Concluí com sucesso!");
            } catch (InterruptedException e) {
                System.out.println("🛑 Tarefa: Fui interrompida por demora!");
            }
        });

        tarefaPesada.start();

       
        try {
            tarefaPesada.join(10000); 
            if (montador.isAlive()) {
                System.out.println("⏰ SISTEMA: Demorou demais! Interrompendo...");
                tarefaPesada.interrupt(); // Manda o sinal de parada
            }
        } catch (InterruptedException e) {}
    }
    
    
}
