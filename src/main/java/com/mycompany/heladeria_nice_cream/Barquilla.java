/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;

/**
 *
 * @author RICHARD RIVERA
 */
public class Barquilla {
    private String sabor_hela;
    private String sabor_top;
    private int cant_max_he;
    
    public Barquilla(String hel, String top, int hemax){
        sabor_hela = hel;
        sabor_top = top;
        cant_max_he = 3;
    }
    @Override
    public String toString(){
        return "La cantidad maxima de bolas de helado y toppings para una barquilla es: "+cant_max_he+", "+
                "Sabor de helado: "+ sabor_hela+", "+
                "Sabor de top: "+sabor_top;
    }
}
