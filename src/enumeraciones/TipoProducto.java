package enumeraciones;

/**
 * Enum de tipo de producto
 */
public enum TipoProducto {
    /**
     * Productos con su precio respectivo
     */
    COCACOLA(1300),
    FANTA(1300),
    SPRITE(1300),
    SUPER8(500),
    OREO(800),
    LOOP(800);

    /**
     * Precio Constante
     * No se modifica
     */
    private final int precio;

    /**
     * Asigna precio a cada producto
     *
     * @param precio Precio del producto
     */
    TipoProducto(int precio){
        this.precio = precio;
    }

    /**
     * getter de Precio del producto
     *
     * @return Devuelve precio del producto
     */
    public int getPrecio() {
        return precio;
    }

}