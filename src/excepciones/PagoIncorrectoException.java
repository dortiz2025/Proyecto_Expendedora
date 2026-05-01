package excepciones;

/**
 * Excepción al intentar pagar sin dinero o dinero inválido (Moneda Null)
 */
public class PagoIncorrectoException extends Exception {

    public PagoIncorrectoException(String mensaje) {
        super(mensaje);
    }
}

