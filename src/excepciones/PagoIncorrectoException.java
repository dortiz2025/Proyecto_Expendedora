package excepciones;

/**
 * Excepción al intentar pagar sin dinero o dinero inválido (Moneda Null)
 */
public class PagoIncorrectoException extends Exception {
    /**
     * @param mensaje Entrega razón de la excepción
     */
    public PagoIncorrectoException(String mensaje) {
        super(mensaje);
    }
}

