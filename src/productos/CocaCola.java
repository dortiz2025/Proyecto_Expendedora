package productos;

public class CocaCola extends Bebida {
    /**
     * Asigna identificador de la bebida
     *
     * @param serie Identificador de la Bebida
     */
    public CocaCola(int serie) {
        super(serie);
    };

    @Override
    public String consumir(){
        return "CocaCola";
    }
}