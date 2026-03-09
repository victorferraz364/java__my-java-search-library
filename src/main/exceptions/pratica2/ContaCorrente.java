package exceptions.pratica2;

import java.util.Objects;

import exceptions.pratica1.ContaInativaException;
import exceptions.pratica1.SaldoInsuficienteException;

/**
 * Modelo simples de conta corrente utilizado para demonstrar
 * validação de regras de negócio com exceções.
 */
public class ContaCorrente {

    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    /**
     * Realiza um saque, verificando valor, saldo disponível e se a conta está ativa.
     */
    public void sacar(double valor) {
    	
        if (valor <= 0) {
           throw new IllegalArgumentException("Valor de saque deve ser maior que 0");
        }

        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Conta com saldo insuficiente");
        }

        if (isInativa()) {
            throw new ContaInativaException("Conta alvo esta inativa.");
        }

        this.saldo -= valor;
    }

    /**
     * Realiza um depósito, garantindo que a conta está ativa e que
     * o valor informado é positivo.
     */
    public void depositar(double valor) {
    	
        if (valor <= 0) {
        	throw new IllegalArgumentException("Valor de deposito menor que 0");
        }

        if (isInativa()) {
        	 throw new ContaInativaException("Conta alvo esta inativa.");
        }

        this.saldo += valor;
    }

    /**
     * Transfere um valor desta conta para a conta de destino, utilizando
     * as validações de saque e depósito.
     */
    public void transferir(ContaCorrente contaDestino, double valor) {
    	
    	Objects.requireNonNull(contaDestino);
        
    	if (contaDestino.isInativa()) {
    		 throw new ContaInativaException("Conta alvo esta inativa.");
        }

    	sacar(valor);
        contaDestino.depositar(valor);
    }
	
}
