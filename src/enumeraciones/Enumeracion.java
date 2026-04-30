package enumeraciones;

public enum Enumeracion {
    COCACOLA(1300),
    SPRITE(1300),
    FANTA(1000),
    SNICKERS(800),
    SUPER8(500),
    ;

    private final int precio;

    Enumeracion(int precio){
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}
