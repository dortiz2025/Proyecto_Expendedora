package logica;

import productos.*;
import productos.bebida.*;
import productos.dulce.*;
import monedas.*;
import enumeraciones.*;


public class Comprador {
    private String consumido;
    private int vuelto = 0;

    public Comprador(Moneda m, TipoProducto producto, Expendedor exp) {
    }

    public int cuantoVuelto() {
        return vuelto; }
    public String queBebiste() {
        return consumido; }
}



