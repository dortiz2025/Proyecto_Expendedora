package logica;

import productos.Producto;
import productos.bebida.*;
import productos.dulce.*;
import monedas.*;
import excepciones.*;
import enumeraciones.*;

public class Expendedor {
    private Deposito<CocaCola> depCoca;
    private Deposito<Sprite> depSprite;
    private Deposito<Fanta> depFanta;
    private Deposito<Super8> depSuper8;
    private Deposito<Oreo> depOreo;
    private Deposito<Loop> depLoop;
    private Deposito<Moneda> depMoneda;

    public Expendedor(){};

    public void comprarProducto(Moneda moneda, TipoProducto tipo) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {

        if (moneda == null) {
             throw new PagoIncorrectoException("Pago incorrecto");
        }

        Producto productoComprado = null;
        switch (tipo) {
            case COCACOLA:
                productoComprado = depCoca.get();
                break;
            case FANTA:
                productoComprado = depFanta.get();
                break;
            case SPRITE:
                productoComprado = depSprite.get();
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
                depMoneda.add(moneda);
                throw new NoHayProductoException("Numero de deposito no valido");
        }
        if (productoComprado == null){
            throw new NoHayProductoException("Sin stock");

        }
        if (moneda.getValor() < tipo.getPrecio()) {
            depMoneda.add(moneda); // Devolvemos la moneda que intentó usar
            throw new PagoInsuficienteException("Dinero insuficiente.");

        }
    }

}
