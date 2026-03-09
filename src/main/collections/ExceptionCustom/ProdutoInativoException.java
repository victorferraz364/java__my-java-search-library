package collections.ExceptionCustom;

/**
 * Exceção lançada quando é realizada alguma operação em um produto que
 * está marcado como inativo.
 */
public class ProdutoInativoException extends ProdutoException {

	private static final long serialVersionUID = 1L;

	public ProdutoInativoException(String message) {
		super(message);
	}
	
}
