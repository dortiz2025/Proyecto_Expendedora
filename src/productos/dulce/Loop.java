package productos.dulce;

public class Loop extends Dulce {
    /**
     * Asigna identificador del Dulce
     *
     * @param serie Identificador del Dulce
     */
    public Loop(int serie){
        super(serie);
    }

    @Override
    public String consumir(){
        return "Loop";
    }
}