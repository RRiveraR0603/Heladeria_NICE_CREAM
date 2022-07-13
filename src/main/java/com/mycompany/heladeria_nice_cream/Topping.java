/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;

/**
 *
 * @author RICHARD RIVERA
 */
public class Topping {
    private String sabor;
    
    /**
     * Constructor por defecto del topping
     */
    public Topping() {
        this.sabor = null;
    }
    
    public Topping(String sabor) {
        this.sabor = sabor;   
    }
    
    /**
     * Metodo que modifica el sabor del topping
     * 
     * sabor Nombre del sabor del topping
     */
    public void setTopping(String sabor) {
        this.sabor = sabor;
    }
    
    /**
     * Metodo que modifica el sabor del topping
     * 
     * sabor Nombre del sabor del topping
     */
    public String getTopping() {
        return this.sabor;
    }
}

