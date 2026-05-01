package productos;

public class Oreo extends Producto {
    /**
     * Asigna identificador del Dulce
     *
     * @param serie Identificador del Dulce
     */
    public Oreo(int serie){
        super(serie);
    }

    @Override
    public String consumir(){
        return "Oreo";
    }
}