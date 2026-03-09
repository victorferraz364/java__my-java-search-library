package exceptions.pratica1;


import java.util.Scanner;

import collections.ExceptionCustom.ProdutoException;
import collections.ExceptionCustom.ProdutoInativoException;
import collections.ExceptionCustom.ProdutoSemEstoqueException;

/**
 * Simula o fluxo de compra de um produto, tratando diferentes tipos de exceções
 * de negócio (produto inativo, sem estoque, etc.).
 */
public class App2 {

	public static void main(String[] args) {
		Produto produto = new Produto("Apple Watch");
		// produto.ativar();
		produto.setQtd(20);

		comprar(produto);
	}

	/**
	 * Laço que solicita continuamente a quantidade desejada até que a compra
	 * seja realizada com sucesso ou até que o usuário opte por não ativar o produto.
	 */
	private static void comprar(Produto produto) {
		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.print("Quantidade: ");
				int quantidade = sc.nextInt();

				efetuarBaixaEstoque(produto, quantidade);
				System.out.println("Compra realizada");

				break; 
			} catch (ProdutoSemEstoqueException e) {
				System.out.printf("--Erro na compra-- \n%s \nEstoque disponivel: %d \nEstoque necessario"
						+ ": %d%n", e.getMessage(), e.getEstoqueDisponivel(), e.getEstoqueNecessaro());
			} catch (ProdutoInativoException e) {
				System.out.println("Erro na compra: " + e.getMessage());

				System.out.print("Deseja ativar o produto? ");

				if (sc.nextBoolean()) {
					produto.ativar();
					System.out.println("Ok. Produto já foi ativado");
				} else {
					System.out.println("Ok. Compra não pode ser realizada");
					break;
				} 
			}
			catch (ProdutoException e) {
				System.out.println((e.getClass().getName()));
				System.out.println("Erro na compra: " + e.getMessage());
			}
		} while (true);
		sc.close();
	}

	/**
	 * Efetua a baixa no estoque, delegando a validação de quantidade e status
	 * do produto para o próprio objeto {@link Produto}.
	 */
	private static void efetuarBaixaEstoque(Produto produto, int quantidade)
			throws ProdutoSemEstoqueException, ProdutoInativoException {
		produto.removeQtd(quantidade);
		System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
				quantidade, produto.getQtd());
	}

}