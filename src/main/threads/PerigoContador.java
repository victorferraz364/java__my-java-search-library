package threads;

/**
 * Demonstra um contador compartilhado entre duas threads sem qualquer
 * forma de sincronização, evidenciando condições de corrida.
 */
public class PerigoContador {
	private static int contador = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable tarefa = () -> {
            for (int i = 0; i < 10000; i++) {
                contador++; // Isso não é seguro entre threads!
            }
        };

        Thread t1 = new Thread(tarefa);
        Thread t2 = new Thread(tarefa);

        t1.start();
        t2.start();

        t1.join(); // Espera a t1 terminar
        t2.join(); // Espera a t2 terminar

        System.out.println("Valor final: " + contador);
        System.out.println("Deveria ser: 20000");
    }
}
