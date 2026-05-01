package excepciones;

public class PagoInsuficienteException extends RuntimeException {
    public PagoInsuficienteException(String message) {
        super("Pago insuficiente");
    }
}
