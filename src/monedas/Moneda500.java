package monedas;

/**
 * clase de moneda de 500, hereda de Moneda
 */
public class Moneda500 extends Moneda{

    /**
     * constructor de la clase Moneda500
     * inicializa la moneda de 500 llamando a la clase padre Moneda
     */
    public Moneda500(){
        super();
    }

    /**
     * obtiene valor de la moneda
     *
     * @return valor de la moneda(500)
     */
    @Override
    public int getValor(){
        return 500;
    }
}
