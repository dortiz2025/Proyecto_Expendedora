package enumeraciones;

public enum TiposProductos {
    COCACOLA(1300),
    SPRITE(1300),
    FANTA(1000),
    SNICKERS(1500),
    SUPER8(500),
    DULCE(400),
    LOOP(900),
    OREO(600);



    private final int precio;

    TiposProductos(int precio){
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}
