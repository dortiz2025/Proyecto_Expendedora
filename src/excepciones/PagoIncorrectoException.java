package excepciones;

public class PagoIncorrectoException extends RuntimeException {
    public PagoIncorrectoException(String message) {
        super(message);
    }
}

