package logica;

import productos.*;
import productos.bebida.*;
import productos.dulce.*;
import monedas.*;
import enumeraciones.*;
import excepciones.*;

import java.util.Scanner;

public class MainInteractivo {
    public static void main(String[] args) {
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
            System.out.print("Ingrese el número del producto que desea comprar: ");

            //Se asume que el input es entero
            int opcion = sc.nextInt();

            //Si el usuario desea salir...
            if (opcion == 0) {
                System.out.println("Saliendo del Expendedor Interactivo");
                break; //Termina el programa.
            }

            // Verificamos que el número esté dentro del rango
            if (opcion < 1 || opcion > productos.length) {
                System.out.println("Opción inválida. Intente de nuevo.");
                continue; // Vuelve al inicio del bucle
            }

            System.out.println();//Estética
            System.out.println("Seleccione la moneda con la que va a pagar:");
            System.out.println("1. Moneda de $100");
            System.out.println("2. Moneda de $500");
            System.out.println("3. Moneda de $1000");
            System.out.println("4. Moneda de $1500");
            System.out.println("5. Moneda falsa");
            System.out.print("\nIngrese su opción de pago: ");

            //Recibe input de moneda elegida
            int opcionMoneda = sc.nextInt();

            Moneda monedaDePago; // Inicia como null por defecto

            // Asignamos la instancia correspondiente según la opción
            switch(opcionMoneda) {
                case 1:
                    monedaDePago = new Moneda100();
                    break;
                case 2:
                    monedaDePago = new Moneda500();
                    break;
                case 3:
                    monedaDePago = new Moneda1000();
                    break;
                case 4:
                    monedaDePago = new Moneda1500();
                    break;
                case 5:
                    monedaDePago = null; //Se puede intentar comprar sin moneda
                    break;
                default:
                    System.out.println("Opción de moneda no válida. No hay moneda.");
                    monedaDePago = null;
                    break;
            }

            try {
                // Transformamos el input a TipoProducto (uso de enums)
                TipoProducto productoElegido = productos[opcion - 1];

                //Intentamos hacer una compra
                Comprador comprador = new Comprador(monedaDePago, productoElegido, expendedor);

                //Si se hace la compra mostramos que se consumió y si sobro vuelto;
                System.out.println("¡Compra exitosa!\n");
                System.out.println("Consumiste: " + comprador.queConsumiste());
                System.out.println("Tu vuelto es: $" + comprador.cuantoVuelto() + "\n");

            }
            //Si hay una excepción, se reporta al usuario
            catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e) {
                System.out.println("\nProblema con la compra: " + e.getMessage() + "\n");
            }
            finally{

            }
        }
    }
}