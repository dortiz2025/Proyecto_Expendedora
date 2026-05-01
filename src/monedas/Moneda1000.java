package monedas;

/**
 * clase de moneda de 1000, hereda de Moneda
 */
public class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }

    /**
     * constructor de la clase Moneda1000
     * inicializa la moneda de 1000 llamando a la clase padre Moneda
     */
    @Override
    public int getValor(){
        return 1000;
    }
}