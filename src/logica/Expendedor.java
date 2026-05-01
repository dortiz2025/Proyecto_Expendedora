package logica;

import productos.Producto;
import productos.bebida.*;
import productos.dulce.*;
import monedas.*;
import excepciones.*;
import enumeraciones.*;

public class Expendedor {
    private Deposito<Bebida> depCoca;
    private Deposito<Bebida> depSprite;
    private Deposito<Bebida> depFanta;
    private Deposito<Dulce> depSuper8;
    private Deposito<Dulce> depOreo;
    private Deposito<Dulce> depLoop;
    private Deposito<Moneda> depMoneda;

    public Expendedor(int cantidad) {
        depCoca = new Deposito<>();
        depSprite = new Deposito<>();
        depFanta = new Deposito<>();
        depSuper8 = new Deposito<>();
        depOreo = new Deposito<>();
        depLoop = new Deposito<>();
        depMoneda = new Deposito<>();

        for (int i = 0; i < cantidad; i++) {
            depCoca.add(new CocaCola(i));
            depSprite.add(new Sprite(i));
            depFanta.add(new Fanta(i));
            depSuper8.add(new Super8(i));
            depOreo.add(new Oreo(i));
            depLoop.add(new Loop(i));
        }
    }

    public Producto comprarProducto(Moneda moneda, TipoProducto tipo) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {

        if (moneda == null) {
             throw new PagoIncorrectoException("Pago incorrecto");
        }

        if (moneda.getValor() < tipo.getPrecio()) {
            depMoneda.add(moneda);
            throw new PagoInsuficienteException("Dinero insuficiente.");
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
            depMoneda.add(moneda);
            throw new NoHayProductoException("Sin stock");
        }

        int vuelto = moneda.getValor() - tipo.getPrecio();
        int cantidadMonedas100 = (vuelto/100);

        for (int i = 0; i < cantidadMonedas100; i++) {
            depMoneda.add(new Moneda100());
        }

        return productoComprado;
    }
    public Moneda getVuelto() {
        return depMoneda.get();
    }
}
