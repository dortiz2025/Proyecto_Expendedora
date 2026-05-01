package productos.dulce;

/**
 * Clase de un Producto de tipo Loop
 * Hereda de su padre Dulce
 */
public class Loop extends Dulce {
    /**
     * Constructor del Loop
     * Asigna identificador del Dulce
     *
     * @param serie Identificador del Dulce
     */
    public Loop(int serie){
        super(serie);
    }

    /**
     * Simula comerse un Loop
     *
     * @return Un String con el nombre del dulce ("Loop)
     */
    @Override
    public String consumir(){
        return "Loop";
    }
}