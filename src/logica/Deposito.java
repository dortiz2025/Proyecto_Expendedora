package logica;

import java.util.ArrayList;

public class Deposito <T> {
    private ArrayList<T> deposito;

    public Deposito() {
        this.deposito = new ArrayList<>();
    }
    public void add(T elemento) {
        this.deposito.add(elemento);
    }
    public T get() {
        if (deposito.isEmpty()) {
            return null;
        }
        return deposito.remove(0);
    }
}