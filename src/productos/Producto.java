package productos;

public abstract class Producto {
    /**
     * Identificador del Producto
     */
    private int serie;

    /**
     * Asigna identificador
     *
     * @param serie Identificador del Producto
     */
    public Producto(int serie){
        this.serie = serie;
    }

    /**
     * Simula consumo del producto
     *
     * @return Nombre del producto consumido
     */
    public abstract String consumir();
}