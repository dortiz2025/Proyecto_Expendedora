package monedas;

/**
 * clase de moneda de 100, hereda de Moneda
 */
public class Moneda100 extends Moneda{

    /**
     * constructor de la clase Moneda100
     * inicializa la moneda de 100 llamando a la clase padre Moneda
     */
    public Moneda100(){
        super();
    }

    /**
     * obtiene valor de la moneda
     *
     * @return valor de la moneda(100)
     */
    @Override
    public int getValor(){
        return 100;
    }
}
