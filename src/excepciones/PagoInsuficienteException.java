package excepciones;

/**
 * Excepción al intentar comprar con menos dinero del necesario
 */
public class PagoInsuficienteException extends Exception {
    /**
     * @param mensaje Entrega razón de la excepción
     */
    public PagoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
