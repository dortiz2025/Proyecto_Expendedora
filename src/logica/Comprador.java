package logica;

import excepciones.*;
import productos.*;
import productos.bebida.*;
import productos.dulce.*;
import monedas.*;
import enumeraciones.*;


public class Comprador {

    // Almacena nombre del producto consumido
    private String productoConsumido;

    // Almacena vuelto de la compra
    private int vueltoCompra = 0;

    public Comprador(Moneda moneda, TipoProducto producto, Expendedor expendedor) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {

        // Variable que almacena el producto comprado.
        // Puede ser null si hubo una excepción.
        Producto productoComprado;

        // Se hace la compra del producto seleccionado.
        // Se guarda en la variable.
        productoComprado = expendedor.comprarProducto(moneda, producto);

        // Variable que almacena el vuelto.
        // Moneda a moneda.
        Moneda vueltoMoneda;

        // Se pide vuelto
        // Mientras no sea null -> Se sigue pidiendo
        vueltoMoneda = expendedor.getVuelto();
        while(vueltoMoneda != null){
            //Se suma al vuelto total de la compra
            vueltoCompra += vueltoMoneda.getValor();
            vueltoMoneda = expendedor.getVuelto();
        }

        // Si existe un producto comprado, se guarda su nombre
        // Sino, queda null
        if(productoComprado != null) productoConsumido = productoComprado.consumir();
        else productoConsumido = null;
    }

    /**
     * Metodo que simula ver el vuelto recibido
     *
     * @return Devuelve el vuelto recibido
     */
    public int cuantoVuelto() {
        return vueltoCompra; }

    /**
     * Metodo que simula preguntar que producto se ha consumido
     *
     * @return Entrega el nombre del producto consumido
     */
    public String queConsumiste() {
        return productoConsumido; }
}