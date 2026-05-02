package logica;

import enumeraciones.TipoProducto;
import monedas.*;
import excepciones.*;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase Main que contiene las pruebas para la expendedora
 * Se compran de productos, maneja el vuelto, y se ven la generación
 * de excepciones y el ordenamiento de monedas
 */
public class Main {

    /**
     * Método principal
     *
     * @param args Argumentos de la línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        System.out.println("--- Pruebas expendedora ---");

        //Un expendedor con solo 1 unidad por producto para que se quede sin stock
        Expendedor maquina = new Expendedor(1);

        System.out.println("\n--- Caso 1: COMPRA EXITOSA (BEBIDAS Y DULCES) ---");
        try {
            //prueba con CocaCola
            Comprador c1 = new Comprador(new Moneda1500(), TipoProducto.COCACOLA, maquina);
            System.out.println("Comprado: " + c1.queConsumiste() + " | Vuelto: " + c1.cuantoVuelto());

            //prueba con los dulces
            Comprador c2 = new Comprador(new Moneda1000(), TipoProducto.SUPER8, maquina);
            System.out.println("Comprado: " + c2.queConsumiste() + " | Vuelto: " + c2.cuantoVuelto());

            Comprador c3 = new Comprador(new Moneda1000(), TipoProducto.OREO, maquina);
            System.out.println("Comprado: " + c3.queConsumiste() + " | Vuelto: " + c3.cuantoVuelto());

            Comprador c4 = new Comprador(new Moneda1000(), TipoProducto.LOOP, maquina);
            System.out.println("Comprado: " + c4.queConsumiste() + " | Vuelto: " + c4.cuantoVuelto());

        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }

        System.out.println("\n--- Caso 2: EXCEPCIÓN PAGO INSUFICIENTE ---");
        try {
            //Fanta cuesta 1300 pesos e intentamos comprar con 1000 pesos
            //por lo que debería lanzar error de pago insuficiente
            Comprador c3 = new Comprador(new Moneda1000(), TipoProducto.FANTA, maquina);
        } catch (PagoInsuficienteException e) {
            System.out.println("Error esperado: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error incorrecto: " + e.getMessage());
        }

        System.out.println("\n--- Caso 3: EXCEPCIÓN PAGO INCORRECTO (NULL) ---");
        try {
            Comprador c4 = new Comprador(null, TipoProducto.SPRITE, maquina);
        } catch (PagoIncorrectoException e) {
            System.out.println("Error esperado: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error incorrecto: " + e.getMessage());
        }

        System.out.println("\n--- Caso 4: EXCEPCIÓN NO HAY PRODUCTO ---");
        try {
            //ya no quedan CocaColas, por lo que debería lanzar error de falta de stock
            Comprador c5 = new Comprador(new Moneda1500(), TipoProducto.COCACOLA, maquina);
        } catch (NoHayProductoException e) {
            System.out.println("Error esperado: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error incorrecto: " + e.getMessage());
        }

        System.out.println("\n--- ORDENAMIENTO DE MONEDAS ---");
        ArrayList<Moneda> listaMonedas = new ArrayList<>();
        listaMonedas.add(new Moneda500());
        listaMonedas.add(new Moneda1500());
        listaMonedas.add(new Moneda100());
        listaMonedas.add(new Moneda1000());

        System.out.println("Lista original:");
        for (Moneda m : listaMonedas)
            System.out.println(m);

        Collections.sort(listaMonedas);

        System.out.println("Lista ordenada:");
        for (Moneda m : listaMonedas)
            System.out.println(m);
    }
}