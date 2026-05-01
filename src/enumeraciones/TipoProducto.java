package enumeraciones;

/**
 * Enum de tipo de producto
 */
public enum TipoProducto {

    COCACOLA(1300),
    FANTA(1300),
    SPRITE(1300),
    SUPER8(500),
    OREO(800),
    LOOP(800);


    private final int precio;

    TipoProducto(int precio){
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

}