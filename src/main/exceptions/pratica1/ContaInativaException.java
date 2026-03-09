package exceptions.pratica1;

/**
 * Exceção de domínio lançada quando se tenta realizar uma operação em uma
 * conta bancária que está inativa.
 */
public class ContaInativaException extends OperacaoBancariaException{

	private static final long serialVersionUID = 1L;

	public ContaInativaException(String message) {
        super(message);
    }

    public ContaInativaException(String message, Throwable cause) {
        super(message, cause);
    }
	
}
