/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;

/**
 *
 * @author RICHARD RIVERA
 */
public class Pila_Barquilla {
    private Nodo inicio;
    
    //Metodo Constructor
    public void Pila_Barquilla(){
        inicio = null;
    }
    
    //Funcion que verifica si la pila esta vacia
    public boolean IsEmpety_Barquilla(){
        return inicio == null;
    }
    
    //Metdodo de insertar dato a la pila (push)
    public void Push_Barquilla(Barquilla bar){
        Nodo nuevo = new Nodo();
        nuevo.setBarquilla(bar);
        if(IsEmpety_Barquilla()){
            inicio = nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }
    
    //Metodo que muestra todos los elementos de la pila.
    public void mostrar_Barquilla(){
        Nodo aux = inicio;
        
        //recorre la pila hasta el ultimo nodo
        while(aux != null){
            System.out.println("|\t"+ aux.getBarquilla()+ "\t|");
            aux = aux.getSiguiente();
        }
    }  
    
}
