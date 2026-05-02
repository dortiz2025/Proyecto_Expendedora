package logica;

import productos.*;
import productos.bebida.*;
import productos.dulce.*;
import monedas.*;
import enumeraciones.*;
import excepciones.*;

import java.util.Scanner;

public class MainInteractivo {
    static void main() {
        //Saludo de bienvenida
        System.out.println("Bienvenido al Expendedor Interactivo");
        System.out.println();//Estética

        //Inicializamos expendedor con 3 productos de cada tipo
        System.out.println("Hoy tenemos un stock de 3 unidades por producto");
        Expendedor expendedor = new Expendedor(3);

        //Buffer que recibe input
        Scanner sc = new Scanner(System.in);

        //Lista con nuestros productos enumerados
        TipoProducto[] productos = TipoProducto.values();

        while(true) {

            //Se imprime la lista de productos
            System.out.println("A continuación nuestro catalogo:");
            System.out.println();
            for (int i = 0; i < productos.length; i++) {
                System.out.println(i + 1 + ". " + productos[i] + " ---- $" + productos[i].getPrecio());
            }
            System.out.println();

            //Se pide el input
            System.out.println("0. Salir");
            System.out.println("Ingrese el número del producto que desea comprar.");

            //Se asume que el input es entero
            int opcion = sc.nextInt();

            //Si el usuario desea salir...
            if (opcion == 0) {
                System.out.println("Saliendo del Expendedor Interactivo");
                break; //Termina el programa.
            }
            try {
                // Verificamos que el número esté dentro del rango
                if (opcion < 1 || opcion > productos.length) {
                    System.out.println("Opción inválida. Intente de nuevo.");
                    continue; // Vuelve al inicio del bucle
                }

                // Transformamos el input a TipoProducto (uso de enums)
                TipoProducto productoElegido = productos[opcion - 1];



                //Compramos
                Comprador comprador = new Comprador(monedaDePago, productoElegido, expendedor);

                System.out.println("¡Compra exitosa!");
                System.out.println("Consumiste: " + comprador.queConsumiste());
                System.out.println("Tu vuelto es: $" + comprador.cuantoVuelto());

            } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e) {
                System.out.println("Problema con la compra: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }
    }
}