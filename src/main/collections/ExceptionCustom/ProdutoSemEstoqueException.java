package collections.ExceptionCustom;

/**
 * Exceção específica para situações em que não há estoque suficiente
 * para atender à quantidade solicitada.
 */
public class ProdutoSemEstoqueException extends ProdutoException{

	private static final long serialVersionUID = 1L;

	/** Quantidade atualmente disponível em estoque. */
	private final int estoqueDisponivel;
	/** Quantidade solicitada/necessária para a operação. */
	private final int estoqueNecessaro;
	
	public ProdutoSemEstoqueException(String message, int estoqueDisponivel, int estoqueNecessaro) {
		super(message);
		this.estoqueDisponivel = estoqueDisponivel;
		this.estoqueNecessaro = estoqueNecessaro;
	}

	public int getEstoqueDisponivel() {
		return estoqueDisponivel;
	}

	public int getEstoqueNecessaro() {
		return estoqueNecessaro;
	}

	

}
