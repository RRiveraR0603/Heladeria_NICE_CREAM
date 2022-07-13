/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;

/**
 *
 * @author RICHARD RIVERA
 */
public class Pila<T> {
    private Nodo<T> tope;
    private int size;

    /**
     * Constructor por defecto de la pila
     */
    public Pila(){
        tope = null;
        size = 0;
    }
    
    /**
     * Metodo que retorna la longitud de la pila
     * 
     * @return La longitud de la pila 
     */
    public int getSize() {
        return size;
    }
    
    /**
     * Metodo que verifica si la pila esta vacia
     * 
     * @return true si la pila esta vacia, false si la pila no esta vacia 
     */
    public Boolean isEmpty() {
        return (tope == null);
    }
    
    /**
     * Metodo que inserta en la cima un nodo
     * 
     * @param v El valor del nuevo nodo a la pila 
     */
    public void push(T v) {
        Nodo<T> nuevo = new Nodo(v, tope);
        tope = nuevo;
        size++;
    }
    
    /**
     * Metodo muestra la cima y la elimina de la pila
     *  
     * @return null si la pila esta vacia, sino el valor contenido en la cima
     */
    public T pop() {
        T aux;
        if (isEmpty()) {
            return null;
        } else {
            aux = tope.getValor();
            tope = tope.getSig();
            size--;
            return aux;
        }
    }
    
    /**
     * Metodo muestra la cima sin elimilarla
     *
     * @return null si la pila esta vacia, el valor contenido en la cima
     */
    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return tope.getValor();
        }
    }

}
    

