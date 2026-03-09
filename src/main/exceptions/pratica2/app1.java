package exceptions.pratica2;

import exceptions.pratica1.ContaInativaException;

/**
 * Cenário de teste simples para depósito e saque em {@link ContaCorrente},
 * focado em validar o tratamento de {@link ContaInativaException}
 * e {@link IllegalArgumentException}.
 */
public class app1 {

	  public static void main(String[] args) {
	        ContaCorrente conta1 = new ContaCorrente("123");
	        conta1.ativar();
	        try {
	        	 conta1.depositar(100);
	        	 conta1.sacar(2);
	        }
	        catch(ContaInativaException e) {
	        	System.out.println("--Erro ao depositar--\n" + e.getMessage());
	        }
	        catch(IllegalArgumentException e) {
	        	System.out.println("--Erro ao depositar--\n" + e.getMessage());
	        }

	        System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
	    }
	
}
