package excepciones;

/**
 * Excepción al intentar comprar con menos dinero del necesario
 */
public class PagoInsuficienteException extends Exception {
    public PagoInsuficienteException() {
        super();
    }
}
