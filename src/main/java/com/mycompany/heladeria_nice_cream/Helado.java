/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;

/**
 *
 * @author RICHARD RIVERA
 */

public class Helado {
    private String sabor;
    
    /**
     * Constructor por defecto del helado
     */
    public Helado() {
        this.sabor = null;
    }
    
    public Helado(String sabor) {
        this.sabor = sabor;
    }
    
    /**
     * Metodo que modifica el sabor del helado
     * 
     *  sabor Nombre del sabor del helado
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    /**
     * Metodo que retorna el sabor del helado
     * 
     * retorna el nombre del sabor del helado
     */
    public String getSabor() {
        return this.sabor;
    }
}
