package productos.dulce;

public class Super8 extends Dulce {
    /**
     * Asigna identificador del Dulce
     *
     * @param serie Identificador del Dulce
     */
    public Super8(int serie){
        super(serie);
    }

    @Override
    public String consumir(){
        return "Super8";
    }
}