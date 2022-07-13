/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;
import java.util.Scanner;

/**
 *
 * @author RICHARD RIVERA
 */
public class Leer {
    static Scanner leer = new Scanner(System.in);
    
    public static int opcion(int max, String msj) {
        int op = -1;
        try {
            do {
                if (((op < 1) || (op > max)) && (op != -1)) {
                    Mostrar.error("La opcion no es valida");
                }
                System.out.print("\n\t" + msj);
                String l = leer.next();
                op = Integer.parseInt(l);
            } while ((op < 1) || (op > max));
        } catch(NumberFormatException nfe) {
           Mostrar.error("La opcion debe ser un numero");
        }
        return op;
    }
    
}
