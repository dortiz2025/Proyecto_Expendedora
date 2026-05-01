package comprador;
import logica.Deposito;
import monedas.Moneda;
import logica.Expendedor;
import monedas.Moneda100;
import productos.Bebida;

import static enumeraciones.TiposProductos.SPRITE;

public class Comprador {
    private String sonido;
    private int vuelto = 0;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        Bebida b = exp.comprarBebida(m, cualBebida);
        if (b != null) {
            this.sonido = b.consumir();
        } else {
            this.sonido = null;
        }
        Moneda mv;
        while ((mv = exp.getVuelto()) != null) {
            this.vuelto += mv.getValor();
        }
    }

    public int cuantoVuelto() {
        return vuelto; }
    public String queBebiste() {
        return sonido; }

}


public Moneda getVuelto() {
    Deposito<Object> monVu = null;
    return monVu.get();
}
