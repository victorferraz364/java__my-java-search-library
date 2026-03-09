package exceptions.pratica1;

/**
 * Exceção lançada quando o saldo disponível em conta não é suficiente
 * para concluir uma determinada operação.
 */
public class SaldoInsuficienteException extends OperacaoBancariaException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(String message) {
        super(message);
    }

    public SaldoInsuficienteException(String message, Throwable cause) {
        super(message, cause);
    }
	
}
