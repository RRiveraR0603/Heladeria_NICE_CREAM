/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.heladeria_nice_cream;
import java.util.Scanner;

/**
 *
 * @author RICHARD RIVERA
 * @author Sahhendry Carreño
 * @author Edgar Ruiz
 */
public class Heladeria_Nice_Cream {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        final String[] HELADOS = {"Chocolate", "Mantecado", "Fresa", "Mora", "Kiwi", "Parchita"};
        final String[] TOPPINGS = {"Sirope de Chocolate", "Sirope de fresa", "Sirope de caramelo", "Arequipe", "Nutella", "Cereales", "Galletas"};
        final int MAXHELADOS = 3;
        final int MAXTOPPINGS = 2;  
        ListaInv invHelados = new ListaInv();
        ListaInv invToppings = new ListaInv();
        invHelados = ListaInv.llenarLista(HELADOS);
        invToppings = ListaInv.llenarLista(TOPPINGS);
        
        Cola_Clientes<Cliente> colaClientes = new Cola_Clientes();
        colaClientes = Archivos.hacerColaClientes();
        
        
        Barquilla actualBarquilla;
        boolean salir = false;
        int nPedido = 0;
        int op = 0;
        
        do{
            Mostrar.menuPrincipal();
            op = Leer.opcion(3, "Elija la opcion a realizar: ");
            switch (op) {
                case 1:
                    while (!colaClientes.isEmpty()) {
                        int contarHelados = 0;
                        int contarToppings = 0;
                        actualBarquilla = new Barquilla();
                        boolean terminada = false;
                        do {
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
                                            invHelados.getValor(op -  1).setCantVentas();
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
                                            invToppings.getValor(op -  1).setCantVentas();
                                            Mostrar.agregado("topping");
                                            contarToppings++;
                                        }
                                    } else {
                                        Mostrar.noagregado("topping");
                                    }
                                    break;
                                case 3:
                                     Cliente actualCliente = colaClientes.dequeue();
                                    if (actualBarquilla.getCosto() > 0) {
                                        nPedido++;
                                        String factura = actualBarquilla.toString();
                                        Mostrar.factura(nPedido, factura, actualCliente);
                                        Archivos.guardarFactura(nPedido, factura, actualCliente);
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
                        }while(!terminada); 
                    }
                    if (colaClientes.isEmpty()) {
                        Mostrar.sinCola();
                    }
                    break;
                case 2:
                    // aqui generar el inventario
                    if (colaClientes.isEmpty()) {
                        ListaInv listaInvHelados = ListaInv.ordenar(invHelados);
                        ListaInv listaInvToppings = ListaInv.ordenar(invToppings);
                        String invFinalHelados = listaInvHelados.toString();
                        String invFinalToppings = listaInvToppings.toString();
                        Mostrar.inventario(invFinalHelados, "helados");
                        Mostrar.inventario(invFinalToppings, "toppings");
                        Archivos.guardarInventario(invFinalHelados, "helados");
                        Archivos.guardarInventario(invFinalToppings, "toppings");
                    } else {
                        Mostrar.conCola();
                    }
                    break;
                case 3: 
                    //Salida 
                    Mostrar.salida(); 
                    salir = true;
                    break;
                default:
                    if (op != -1) {
                        Mostrar.error("La opcion no es valida.");
                    }
            }
        }while(!salir); //Culminar.
    }
}
