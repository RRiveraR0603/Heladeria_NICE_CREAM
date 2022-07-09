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

    private static Barquilla bar;

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String h = "", t = "";
        int l = 0;
        Pila_helado ph = new Pila_helado();
        Pila_toping pt = new Pila_toping();
        Pila_Barquilla pb = new Pila_Barquilla();
        Cola_Clientes cc = new Cola_Clientes();
        
        ph.Push_helado("Chocolate");
        ph.Push_helado("Fresa");
        ph.Push_helado("Mantecado");
        ph.Push_helado("Oreo");
        ph.Push_helado("Piña");
        
        ph.mostrar_helados();
        
        System.out.println();
        
        pt.Push_topping("galleta");
        pt.Push_topping("Chispas");
        pt.Push_topping("ro");
        pt.Push_topping("Oreo");
        pt.Push_topping("Flips");
        
        pt.mostrar_topping();
        
        System.out.println();
        
        cc.enqueue("Pedro");
        cc.enqueue("Anabella");
        cc.enqueue("Sahenndry");
        cc.enqueue("Rodrigo");
        cc.enqueue("Ray");
        cc.enqueue("Diego");
        
        cc.mostrar_per();
        
        System.out.println();

        
        pb.Push_Barquilla(bar);
        pb.Push_Barquilla(bar);
        pb.Push_Barquilla(bar);
        pb.Push_Barquilla(bar);
        pb.Push_Barquilla(bar);
        
        pb.mostrar_Barquilla();
                
        ph.Pop_helado();
        pt.Pop_topping();
        cc.dequeue();
        
        System.out.println();
        
        ph.mostrar_helados();
        System.out.println();
        pt.mostrar_topping();
        System.out.println();
        cc.mostrar_per();
        System.out.println();
        
        
        

    }
}
