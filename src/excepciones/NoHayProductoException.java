package excepciones;

public class NoHayProductoException extends RuntimeException {
    public NoHayProductoException(String message) {
        super("Producto sin stock.");
    }
}
