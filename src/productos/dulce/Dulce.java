package productos.dulce;

import productos.Producto;

public abstract class Dulce extends Producto {
    /**
     * Asigna identificador del Dulce
     *
     * @param serie Identificador del Dulce
     */
    public Dulce(int serie) {
        super(serie);
    }
}