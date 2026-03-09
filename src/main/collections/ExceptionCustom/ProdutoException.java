package collections.ExceptionCustom;

/**
 * Exceção base genérica para erros relacionados a operações com produtos.
 */
public class ProdutoException extends Exception{

	private static final long serialVersionUID = 1L;

	public ProdutoException(String message) {
		super(message);
	}
	
}
