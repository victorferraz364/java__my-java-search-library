package exceptions.pratica2;

/**
 * Exemplo de transferência entre duas contas correntes, tratando
 * {@link IllegalStateException} e {@link IllegalArgumentException}.
 */
public class app2 {

	public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("123");
        ContaCorrente conta2 = new ContaCorrente("987");

        conta1.ativar();
        conta2.ativar();
        conta1.depositar(1000);
        
        try {
        	conta1.transferir(conta2, 0.1);
        }
        catch (IllegalStateException e) {
        	System.out.println("--Erro ao tranferir--\n" + e.getMessage());
        }
        catch(IllegalArgumentException e) {
        	System.out.println("--Erro ao transferir--\n" + e.getMessage());
        }
   
        
       

        

        System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
        System.out.printf("Saldo da conta 2: %.2f%n", conta2.getSaldo());
    }
	
}
