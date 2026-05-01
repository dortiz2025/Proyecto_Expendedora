package logica;

import java.util.ArrayList;

public class Deposito <T> {
    private ArrayList<T> lista;

    public Deposito() {
        this.lista = new ArrayList<>();
    }
    public void add(T elemento) {
        this.lista.add(elemento);
    }
    public T get() {
        if (lista.isEmpty()) {
            return null;
        }
        return lista.remove(0);
    }

}
