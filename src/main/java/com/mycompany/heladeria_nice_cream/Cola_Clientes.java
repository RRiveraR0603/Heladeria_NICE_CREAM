/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;

/**
 *
 * @author RICHARD RIVERA
 */
public class Cola_Clientes<T> {
    private Nodo<T> top, tail;
    private int size;

    /**
     * Constructor por defecto de la cola
     */
    public Cola_Clientes() {
        top = tail = null;
        size = 0;
    }
    
    /**
     * Metodo que retorna la longitud de la cola
     * 
     * @return La longitud de la cola 
     */
    public int getSize() {
        return size;
    }
    
    /**
     * Metodo que verifica si la cola esta vacia
     * 
     * @return true si la cola esta vacia, false si la cola no esta vacia 
     */
    public Boolean isEmpty() {
        return (top == null);
    }
    
     /**
     * Metodo que retorna el frente de la cola
     * 
     * @return null si la cola esta vacia, sino el valor contenido en el frente
     */
    public T front() {
        if (isEmpty()) {
            return null;
        } else {
            return top.getValor();
        }
    }
    
    /**
     * Metodo que inserta al final de la cola
     * 
     * @param v El nuevo nodo de la cola 
     */
    public void enqueue(T v) {
        Nodo<T> nuevo = new Nodo(v, null);
        if (isEmpty()) {
            top = nuevo;
        } else {
            tail.setSig(nuevo);
        }
        tail = nuevo;
        size++;
    }
    
     /**
     * Metodo que remueve al principio de la cola
     * 
     * @return El valor contenido en el frente de la cola
     */
    public T dequeue() {
        T aux;
        if (isEmpty()) {
            aux = null;
        } else {
            aux = top.getValor();
            top = top.getSig();
            size--;
            if (isEmpty()){
                tail = null;
            }
        }
        return aux;
    }

}
