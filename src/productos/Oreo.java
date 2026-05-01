package productos;

<<<<<<< HEAD
public class Oreo extends Producto {
    /**
     * Asigna identificador del Dulce
     *
     * @param serie Identificador del Dulce
     */
    public Oreo(int serie){
        super(serie);
    }

=======
public class Oreo extends Dulce {
    public Oreo(){};
>>>>>>> avance-benja
    @Override
    public String consumir(){
        return "Oreo";
    }
}