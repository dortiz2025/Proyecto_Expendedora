package logica;
import excepciones.NoHayProductoException;
import excepciones.PagoIncorrectoException;
import excepciones.PagoInsuficienteException;
import monedas.Moneda;

public class Expendedora {

    public void comprarProducto(Moneda moneda, nu) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        if (moneda == null) {
             throw new PagoIncorrectoException("Pago incorrecto");
        }
        if (numdep incorrecto) {

            throw new NoHayProductoException("Numero de deposito no valido");

        }
        if (no hay stock){

            throw new NoHayProductoException("Sin stock");

        }
        if (dinero insuficiente){

            throw new PagoInsuficienteException("Dinero insuficiente");

        }
    }


}
