package productos;

public class Fanta extends Bebida {
    /**
     * Asigna identificador de la bebida
     *
     * @param serie Identificador de la Bebida
     */
    public Fanta(int serie) {
        super(serie);
    };

    @Override
    public String consumir() {
        return "Fanta";
    }
}