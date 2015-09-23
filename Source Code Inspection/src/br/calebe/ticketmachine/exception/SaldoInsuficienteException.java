package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {
        this("Saldo insuficiente");
    }

    public SaldoInsuficienteException(String message) {
        super(message);
    }
       
}
