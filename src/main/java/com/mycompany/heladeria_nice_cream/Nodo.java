/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;

/**
 *
 * @author RICHARD RIVERA
 */

public class Nodo<T> {
    private T valor;
    private Nodo<T> sig;

    /**
     * Constructor por defecto del nodo
     */
    public Nodo() {
        this.valor = null;
        this.sig = null;
    }

    /**
     * Constructor con parametros del nodo
     * 
     *  v El valor del nodo
     *  siguiente El nodo siguiente
     */
    public Nodo(T v, Nodo<T> siguiente){
        this.valor = v;
        this.sig = siguiente;
    }
    
    /**
     * Constructor con parametros del nodo
     *
     *  v Es el objeto del nodo
     */
    public Nodo(T v) {
        this.valor = v;
        this.sig = null;
    }
    
    /**
     * Metodo que obtiene el siguiente nodo
     *
     * Retorna El siguiente nodo
     */
    public Nodo<T> getSig() {
       return this.sig;
    }
    
    /**
     * Metodo que modifica el siguiente nodo
     *
     *  sig El nodo por el cual se cambiara el actual
     */
    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }
    
    /**
     * Metodo que obtiene el valor del nodo
     *
     * retorna el valor
     */
    public T getValor() {
       return this.valor;
    }
    
    /**
     * Metodo que modifica el siguiente nodo
     *
     * v El valor por el cual se cambiara el actual
     */
    public void setValor(T v) {
        this.valor = v;
    }
}