package threads;

import java.util.concurrent.LinkedBlockingQueue;

public class FilaDeNumerosCOMPIPEMAP {

	private static int[] matriz = {0, 0};
    private static boolean positivoPronto = false;
    private static final Object cadeado = new Object();

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
                    Thread.sleep(300); // Simulando tempo de processamento
                }
            } catch (InterruptedException e) {}
        }).start();

        // THREAD 2: Gerador de Negativos
        new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("➖ Gerando Negativo: " + (-i));
                    filaNeg.put(-i);
                    Thread.sleep(800); // Thread Negativa é BEM mais lenta
                }
            } catch (InterruptedException e) {}
        }).start();

        // THREAD 3: O MONTADOR (A "IA" que une os dados)
        new Thread(() -> {
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
        }).start();
    }
}
