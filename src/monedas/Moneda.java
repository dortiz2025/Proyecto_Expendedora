package monedas;

/**
 * clase abstracta "Moneda" para poder comprar en la expendedora
 * implementa la interfaz Comparable para poder ordenar las monedas segun
 * su valor
 */
public abstract class Moneda implements Comparable<Moneda>{

    /**
     * constructor de clase Moneda
     */
    public Moneda() {}

    /**
     * se ocupa el hashcode de la moneda como su numero de serie
     *
     * @return hashcode de la moneda (numero de serie)
     */
    public int getSerie() {
        return this.hashCode(); }

    /**
     * metodo abstracto para que cada moneda retorne su respectivo valor
     *
     * @return valor de moneda
     */
    public abstract int getValor();

    /**
     * metodo para poder comparar las monedas segun su valor, permitiendo que sean
     * ordenadas
     *
     * @param otraMoneda para comparar
     * @return -1 si la moneda tiene menor valor, 1 si es mayor, 0 si son iguales
     */
    @Override
    public int compareTo(Moneda otraMoneda) {
        if (this.getValor() < otraMoneda.getValor()) {
            return -1;
        } else if (this.getValor() > otraMoneda.getValor()) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * String que una "moneda" representa
     *
     * @return string con el valor y el numero de serie (hashcode) de la moneda
     */
    @Override
    public String toString() {
        return "Moneda de: " + this.getValor() + ", serie: " + this.hashCode();
    }
}
