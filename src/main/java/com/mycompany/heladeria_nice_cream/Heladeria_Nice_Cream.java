/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.heladeria_nice_cream;
import java.util.Scanner;

/**
 *
 * @author RICHARD RIVERA
 */
public class Heladeria_Nice_Cream {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        final String[] HELADOS = {"Chocolate", "Mantecado", "Fresa", "Mora", "Kiwi", "Parchita"};
        final String[] TOPPINGS = {"Sirope de Chocolate", "Sirope de fresa", "Sirope de caramelo", "Arequipe", "Nutella", "Cereales", "Galletas"};
        final int MAXHELADOS = 3;
        final int MAXTOPPINGS = 2;
        Cola_Clientes<Cliente> colaClientes = new Cola_Clientes();
        
        //Esto es para probar el menu, se tiene que insertar los datos del archivo txt
        Cliente cliente1 = new Cliente("Sahhendry", "Carreño", "0416-0000000");
        Cliente cliente2 = new Cliente("Richard", "Riveras", "0412-0000000");
        colaClientes.enqueue(cliente1);
        colaClientes.enqueue(cliente2);
        
        Barquilla actualBarquilla;
        boolean salir = false;
        int nPedido = 0;
        int op = 0;
        
        while(!salir){
            Mostrar.menuPrincipal();
            op = Leer.opcion(2, "Elija la opcion a realizar: ");
            switch (op) {
                case 1:
                    while (!colaClientes.isEmpty()) {
                        int contarHelados = 0;
                        int contarToppings = 0;
                        actualBarquilla = new Barquilla();
                        boolean terminada = false;
                        while(!terminada) {
                            Mostrar.menuCompra();
                            op = Leer.opcion(3, "Elija la opcion a realizar: ");
                        
                            switch (op) {
                                case 1:
                                    // Apartado donde el usuario seleccionara el sabor 
                                    // de helado de su eleccion y se añadira a la factura
                                    if (contarHelados < MAXHELADOS) {
                                        Mostrar.elegirHelado();
                                        op = Leer.opcion(6, "Que sabor quiere? ");
                                        if (op != -1) {
                                            Helado saborElegido = new Helado(HELADOS[op - 1]);
                                            actualBarquilla.agregarHelado(saborElegido);
                                            Mostrar.agregado("helado");
                                            contarHelados++;
                                        }
                                    } else {
                                        Mostrar.noagregado("helado");
                                    }
                                    break;
                                case 2:
                                    // Apartado donde el usuario seleccionara el sabor
                                    // de Topping de su eleccion y se añadira a la factura
                                    if (contarToppings < MAXTOPPINGS) {
                                        Mostrar.elegirTopping();
                                        op = Leer.opcion(7, "Que sabor quiere? ");
                                        if (op != -1) {
                                            Topping saborElegido = new Topping(TOPPINGS[op - 1]);
                                            actualBarquilla.agregarTopping(saborElegido);
                                            Mostrar.agregado("topping");
                                            contarToppings++;
                                        }
                                    } else {
                                        Mostrar.noagregado("topping");
                                    }
                                    break;
                                case 3:
                                    if (actualBarquilla.getCosto() > 0) {
                                        nPedido++;
                                        Cliente actualCliente = colaClientes.dequeue();
                                        String factura = actualBarquilla.toString();
                                        Mostrar.factura(nPedido, factura, actualCliente);
                                        // guardarFactura(nPedido, factura, actualCliente); // todavia no esta listo
                                        terminada = true;
                                    } else {
                                        Mostrar.cancelar();
                                        op = Leer.opcion(2, "Elija la opcion a realizar: ");
                                        if (op == 1) {
                                            terminada = true;
                                        }
                                    }
                                    break;
                                default:
                                if (op != -1) {
                                    Mostrar.error("La opcion no es valida.");
                                }
                            }
                        } 
                    }
                    if (colaClientes.isEmpty()) {
                        Mostrar.sinCola();
                    }
                    break;
                case 2:
                    // aqui generar el inventario
                    if (colaClientes.isEmpty()) {
                        // genero inventario
                    } else {
                        Mostrar.hayCola();
                    }
                    break;
                case 3: 
                    //Se sale y ya jaja
                    Mostrar.salida(); 
                    salir = true;
                    break;
                default:
                    if (op != -1) {
                        Mostrar.error("La opcion no es valida.");
                    }
            }
        }
    }
}
