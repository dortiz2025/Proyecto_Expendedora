package monedas;

/**
 * clase de moneda de 1000, hereda de Moneda
 */
public class Moneda1000 extends Moneda{

    /**
     * constructor de la clase Moneda1000
     * inicializa la moneda de 1000 llamando a la clase padre Moneda
     */
    public Moneda1000(){
        super();
    }

    /**
     * obtiene valor de la moneda
     *
     * @return valor de la moneda(1000)
     */
    @Override
    public int getValor(){
        return 1000;
    }
}