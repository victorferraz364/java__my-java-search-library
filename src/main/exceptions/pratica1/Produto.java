package exceptions.pratica1;

import collections.ExceptionCustom.ProdutoInativoException;
import collections.ExceptionCustom.ProdutoSemEstoqueException;

/**
 * Entidade simples de produto utilizada para exemplos de tratamento
 * de exceções de negócio (estoque, status ativo/inativo).
 */
public class Produto {

	private String name;
	private int qtd;
	private boolean ativo;

	public Produto(String name) {
		this.name = name;
	}
	
	public Produto(String name, int qtd) {
		this.name = name;
		this.qtd = qtd;
	}
	
	public Produto(String name, int qtd, boolean ativo) {
		this.name = name;
		this.qtd = qtd;
		this.ativo = ativo;
	}

	public String getName() {
		return name;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	/**
	 * Remove a quantidade informada do estoque, validando:
	 * <ul>
	 *     <li>se a quantidade é positiva;</li>
	 *     <li>se há estoque suficiente;</li>
	 *     <li>se o produto está ativo.</li>
	 * </ul>
	 *
	 * @throws ProdutoSemEstoqueException se não houver estoque suficiente
	 * @throws ProdutoInativoException se o produto estiver inativo
	 */
	public void removeQtd(int qtd) throws ProdutoSemEstoqueException, ProdutoInativoException {
		
		if (qtd < 0 || qtd > this.qtd) {
			throw new ProdutoSemEstoqueException("Estoque insuficiente: ", this.qtd, qtd);
		}
		else if (!getAtivo()) {
			throw new ProdutoInativoException("Produto inativo, retirada invalida");
		}
		this.qtd -= qtd;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public boolean getAtivo() {
		return ativo;
	}
	
	public void ativar() {
		this.ativo = true;
	}

	@Override
	public String toString() {
		if (!isAtivo())  {
			return "[Inativo] Produto name= " + name + ", qtd=" + qtd;
		}
		else {
			return "Produto name= " + name + ", qtd=" + qtd;
		}
	}
}
