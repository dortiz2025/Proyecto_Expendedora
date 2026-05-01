package excepciones;

/**
 * Excepción al intentar comprar un producto que no existe o no tiene stock
 */
public class NoHayProductoException extends Exception {

    public NoHayProductoException(String mensaje) {
        super(mensaje);
    }
}
