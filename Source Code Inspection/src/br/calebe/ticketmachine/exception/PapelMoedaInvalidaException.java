package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {

    public PapelMoedaInvalidaException() {
        this("Papel moeda inválida!");
    }
    
    public PapelMoedaInvalidaException(String message) {
        super(message);
    }    
    
}
