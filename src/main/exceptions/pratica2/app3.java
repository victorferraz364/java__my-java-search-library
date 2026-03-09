package exceptions.pratica2;

import exceptions.pratica1.ContaInativaException;
import exceptions.pratica1.SaldoInsuficienteException;

/**
 * Exemplo de transferência com falta de saldo, demonstrando o uso de
 * {@link SaldoInsuficienteException} e demais exceções relacionadas.
 */
public class app3 {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente("123");
		ContaCorrente conta2 = new ContaCorrente("987");

		conta1.ativar();
		conta2.ativar();


		try {
			conta1.depositar(1000);
			conta1.transferir(conta2, 1001);
		}
		catch (IllegalArgumentException e) {
			System.out.println("--Erro ao transferir--\n" + e.getMessage());
		}
		catch(ContaInativaException e) {
			System.out.println("--Erro ao transferir--\n" + e.getMessage());
		}
		catch(SaldoInsuficienteException e) {
			System.out.println("--Erro ao tranferir--\n" + e.getMessage());
		}
		
		
		

		System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
		System.out.printf("Saldo da conta 2: %.2f%n", conta2.getSaldo());
	}

}
