/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;

/**
 *
 * @author RICHARD RIVERA
 */
public class Mostrar {
    
    public static void menuPrincipal() {
        System.out.println("\n\tSistema de Compra de Barquillas\n");
        System.out.println("\t1. Iniciar compra");
        System.out.println("\t2. Imprimir Inventario");
        System.out.println("\t3. Salir del sistema");
    }
    
    public static void menuCompra() {
        System.out.println("\n\t***** Bienvenido *****\n");
        System.out.println("\t1. Agregar helado (Max 3)");
        System.out.println("\t2. Agregar topping (Max 2)");
        System.out.println("\t3. Imprimir factura (termina la compra)");
    }
    
    public static void elegirHelado() {
        System.out.println("\n\tElija el sabor de helado");
        System.out.println("\t1. Chocolate");
        System.out.println("\t2. Mantecado");
        System.out.println("\t3. Fresa");
        System.out.println("\t4. Mora");
        System.out.println("\t5. Kiwi");
        System.out.println("\t6. Parchita");
    }
    
    public static void elegirTopping() {
        System.out.println("\n\tElija el sabor de Toppings");
        System.out.println("\t1. Sirope de Chocolate");
        System.out.println("\t2. Sirope de fresa");
        System.out.println("\t3. Sirope de caramelo");
        System.out.println("\t4. Arequipe");
        System.out.println("\t5. Nutella");
        System.out.println("\t6. Cereales");
        System.out.println("\t7. Galletas");
    }
    
    public static void agregado(String msj) {
        System.out.println("\n\tEl sabor de " + msj + " se agrego correctamente");
    }
    
    public static void noagregado(String msj) {
        System.out.println("\n\tNo puede agregrar mas " + msj + " excede la cantidad maxima");
    }
    
    public static void error(String msj) {
        System.out.println("\n\tError: " + msj);
    }
    
    public static void cancelar() {
        System.out.println("\n\tDesea cancelar la compra?");
        System.out.println("\n\t1. Si \t 2. No");
    }
    
    public static void sinCola() {
        System.out.println("\n\tNo hay clientes en cola");
        System.out.println("\tPor favor, presione \"3\" para salir del sistema");
    }
    
    public static void conCola() {
        System.out.println("\n\tHay clientes en cola");
        System.out.println("\tPor favor, atiende a los clientes antes de hacer inventario");
    }
    
    public static void factura(int nPedido, String factura, Cliente cliente) {
        System.out.println("\n\t******************************");
        System.out.println("\t\t  Factura\n");
        System.out.println("\tPedido nº: " + nPedido);
        System.out.println("\tCliente: ");
        System.out.println("\tNombre: " + cliente.getNombre());
        System.out.println("\tApellido: " + cliente.getApellido());
        System.out.println("\tTelefono: " + cliente.getTelefono());
        System.out.print("\n" + factura);
        System.out.println("\t******************************");
        System.out.println("\t**** COMPRA TERMINADA ****");
    }
    
    
    public static void salida() {
        System.out.print("\n\tHa salido del sistema");
        for (int i = 1; i <= 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(1000); // Duerme el hilo durante 1000 milisegundos, 1 segundo pues
            } catch(InterruptedException ie) {
                // ignorar
            }
        }
    }
    
}

