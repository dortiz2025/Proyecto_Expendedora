package excepciones;

public class PagoInsuficienteException extends RuntimeException {
    public PagoInsuficienteException(String mensaje) {

        super(mensaje);
    }
}
