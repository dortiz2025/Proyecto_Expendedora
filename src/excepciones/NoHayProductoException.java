package excepciones;

public class NoHayProductoException extends RuntimeException {
    public NoHayProductoException(String mensaje) {

        super(mensaje);
    }
}
