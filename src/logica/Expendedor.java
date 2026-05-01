package logica;
import enumeraciones.TiposProductos;
import excepciones.NoHayProductoException;
import excepciones.PagoIncorrectoException;
import excepciones.PagoInsuficienteException;
import monedas.Moneda;
import productos.*;

public class Expendedor {
    private Deposito<CocaCola> depCoca;
    private Deposito<Sprite> depSprite;
    private Deposito<Fanta> depFanta;
    private Deposito<Snickers> depSnickers;
    private Deposito<Super8> depSuper8;
    private Deposito<Oreo> depOreo;
    private Deposito<Loop> depLoop;
    private Deposito<Moneda> monVu;

    public void comprarProducto(Moneda moneda, TiposProductos tipo) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        if (moneda == null) {
             throw new PagoIncorrectoException("Pago incorrecto");
        }

        Producto productoComprado = null;
        switch (tipo) {
            case COCACOLA:
                productoComprado = depCoca.get();
                break;
            case SPRITE:
                productoComprado = depSprite.get();
                break;
            case FANTA:
                productoComprado = depFanta.get();
                break;
            case SNICKERS:
                productoComprado = depSnickers.get();
                break;
            case SUPER8:
                productoComprado = depSuper8.get();
                break;
            case OREO:
                productoComprado = depOreo.get();
                break;
            case LOOP:
                productoComprado = depLoop.get();
                break;
            default:
                monVu.add(moneda);
                throw new NoHayProductoException("Numero de deposito no valido");
        }
        if (productoComprado == null){
            throw new NoHayProductoException("Sin stock");

        }
        if (moneda.getValor() < tipo.getPrecio()) {
            monVu.add(moneda); // Devolvemos la moneda que intentó usar
            throw new PagoInsuficienteException("Dinero insuficiente.");

        }
    }


}
