package threads;

/**
 * Exemplo propositalmente incorreto de acesso concorrente a um dado
 * compartilhado entre múltiplas threads, sem qualquer mecanismo de
 * sincronização.
 * <p>
 * Usa um array global de inteiros para representar um par de números
 * positivo/negativo e uma terceira thread que fiscaliza a consistência
 * dos valores, evidenciando problemas de condição de corrida (race condition).
 */
public class FilaDeNumerosERRADO {


	// Dado Global: [0] é o positivo, [1] é o negativo
    private static int[] matrizGlobal = {0, 0};

    public static void main(String[] args) {
        System.out.println("🚀 Iniciando Motor de Consistência...");

        // THREAD 1: Cuida apenas da parte POSITIVA
        Thread tPositiva = new Thread(() -> {
            for (int i = 1; i <= 20; i++) {
                matrizGlobal[0] = i; 
                System.out.println("➕ Thread Positiva definiu: " + i);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });

        // THREAD 2: Cuida apenas da parte NEGATIVA
        Thread tNegativa = new Thread(() -> {
            for (int i = 1; i <= 20; i++) {
                matrizGlobal[1] = -i; 
                System.out.println("➖ Thread Negativa definiu: " + (-i));
                try { Thread.sleep(700); } catch (InterruptedException e) {}
            }
        });

        // THREAD 3: O FISCAL (Lê o tempo todo para ver se estão em sincronia)
        Thread tFiscal = new Thread(() -> {
            while (true) {
                int p = matrizGlobal[0];
                int n = matrizGlobal[1];
                
                System.out.print("🔎 FISCAL ANALISANDO: [" + p + " | " + n + "]");
                
                if (p + n == 0 && p != 0) {
                    System.out.println(" -> ✅ CONSISTENTE");
                } else {
                    System.out.println(" -> ❌ INCONSISTENTE!");
                }
                
                try { Thread.sleep(300); } catch (InterruptedException e) {}
                
                // Para o loop quando chegar no fim do teste
                if (p == 20 && n == -20) break;
            }
        });

        tFiscal.start();
        tPositiva.start();
        tNegativa.start();
    }
}
