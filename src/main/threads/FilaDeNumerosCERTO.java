package threads;

/**
 * Versão correta/sincronizada do exemplo de numeração em pares
 * positivo/negativo, utilizando {@code synchronized}, {@code wait()}
 * e {@code notifyAll()} para coordenar as threads.
 */
public class FilaDeNumerosCERTO {

	private static int[] matriz = {0, 0};
    private static boolean positivoPronto = false;
    private static final Object cadeado = new Object();

    public static void main(String[] args) {

        // THREAD POSITIVA
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                synchronized (cadeado) {
                    matriz[0] = i;
                    positivoPronto = true;
                    System.out.println("➕ Positivo escreveu: " + i);
                    
                    cadeado.notifyAll(); // Acorda a thread Negativa
                    
                    try {
                        // Espera a Negativa terminar o par dela antes de ir para o próximo 'i'
                        while (positivoPronto) { cadeado.wait(); }
                    } catch (InterruptedException e) {}
                }
            }
        }).start();

        // THREAD NEGATIVA
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                synchronized (cadeado) {
                    try {
                        // Espera o positivo escrever primeiro
                        while (!positivoPronto) { cadeado.wait(); }
                    } catch (InterruptedException e) {}

                    matriz[1] = -i;
                    System.out.println("➖ Negativo escreveu: " + (-i));
                    System.out.println("✅ PAR FORMADO: [" + matriz[0] + ", " + matriz[1] + "]");
                    
                    positivoPronto = false;
                    cadeado.notifyAll(); // Avisa que terminou para a Positiva seguir
                }
            }
        }).start();
    }
}
