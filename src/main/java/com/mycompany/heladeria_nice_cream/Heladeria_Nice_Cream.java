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
        String h = "", t = "";
        int op = 0;
        boolean salir = false, salirf = false;
        Pila_helado ph = new Pila_helado();
        Pila_toping pt = new Pila_toping();
        Pila_Barquilla pb = new Pila_Barquilla();
        Cola_Clientes cc = new Cola_Clientes();
        
        while(!salir){
            
            System.out.println("1. Iniciar compra");
            System.out.println("2. Salir del sistema");
            System.out.println("Elija la opcion a realizar");
            op = leer.nextInt();
            
            switch(op){
                case 1: 
                    while(!salirf){
                        System.out.println("\t Bienvenido");
                        System.out.println("\n 1. Agregar helado");
                        System.out.println("\n 2. Agregar toppings");
                        System.out.println("\n 3. Volver a Inicio");
                        op = leer.nextInt();
                        if(op == 1){
                            //Apartado donde el usuario seleccionara el sabor de helado de su eleccion y se añadira a la factura
                            System.out.println("\t Elija el sabor de helado (Maximo 3)");
                            System.out.println("\n 1. Chocolate ");
                            System.out.println("\n 2. Mantecado");
                            System.out.println("\n 3. Fresa");
                            System.out.println("\n 4. Mora");
                            System.out.println("\n 5. Kiwi");
                            System.out.println("\n 6. Parchita");
                            System.out.println();
                        }else if(op == 2){
                            //Apartado donde el usuario seleccionara el sabor de Topping de su eleccion y se añadira a la factura
                            System.out.println("\t Elija el sabor de Toppings (Maximo 3)");
                            System.out.println("\n 1. Sirope de Chocolate");
                            System.out.println("\n 2. Sirope de fresa");
                            System.out.println("\n 3. Sirope de caramelo");
                            System.out.println("\n 4. Arequipe");
                            System.out.println("\n 5. Nutella");
                            System.out.println("\n 6. Cerales");
                            System.out.println("\n 7. Galletas");
                            System.out.println();
                        }else if(op ==3){
                            //Apartado para imprimir la factura compra del cliente, donde se mostrara "sabor(es) de helado y topping que selecciono el cliente" y "Monto de cada uno de los elemento hasta llegar a un Monto total"
                        }else if(op ==4){
                            //Guarda la factura en la pila o lista y regresa al menu de inicio para atender a otro cliente
                            salirf = true;
                            System.out.println();
                        }
                    }
                    break;
                case 2:
                    //Se sale y ya jaja
                    System.out.println("Ha salido del sistema");
                    salir = true;
                    break;
                default:
                    System.out.println("ERROR");
            }
        }
    }
}
