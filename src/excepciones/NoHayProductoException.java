package excepciones;

/**
 * Excepción al intentar comprar un producto que no existe o no tiene stock
 */
public class NoHayProductoException extends Exception {
    /**
     * @param mensaje Entrega razón de la excepción
     */
    public NoHayProductoException(String mensaje) {
        super(mensaje);
    }
}
