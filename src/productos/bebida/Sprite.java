package productos.bebida;

public class Sprite extends Bebida {
    /**
     * Asigna identificador de la bebida
     *
     * @param serie Identificador de la Bebida
     */
    public Sprite(int serie) {
        super(serie);
    };

    @Override
    public String consumir(){
        return "Sprite";
    }
}