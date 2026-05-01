package productos.bebida;

import productos.Producto;

public abstract class Bebida extends Producto {
    /**
     * Asigna identificador de la bebida
     *
     * @param serie Identificador de la Bebida
     */
    public Bebida(int serie){
        super(serie);
    }
}