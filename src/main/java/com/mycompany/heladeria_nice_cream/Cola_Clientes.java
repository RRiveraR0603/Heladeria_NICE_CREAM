/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;

/**
 *
 * @author RICHARD RIVERA
 */
public class Cola_Clientes {
    private Nodo inicio;
    private Nodo Final;
    
    //Metodo Constructor
    public void Pila(){
        inicio = null;
        Final = null;
    }
    
    //Funcion que verifica si la pila esta vacia
    public boolean IsEmpety_per(){
        return inicio == null;
    }
    
    //Metdodo de insertar dato a la cola(enqueue)
    public void enqueue(String persona){
        Nodo nuevo = new Nodo();
        nuevo.setPersonas(persona);
        if(IsEmpety_per()){
            //"inicio" y "Final" toman referencia de la primera variable.
            inicio = nuevo;
            Final = nuevo;
        }else{
            Final.setSiguiente(nuevo);
            Final = nuevo;
        }
    }
    
    //Funcion de eliminar un dato de la cola (dequeue)
    public String dequeue(){
        if(!IsEmpety_per()){
            String dato = inicio.getPersonas();
            if(inicio == Final){
                inicio = null;
                Final = null;
            }else{
                inicio = inicio.getSiguiente();
            }
            return dato;
        }else{
            return "Cola Vacia";
        }
    }
    
    //Metodo que muestra todos los elementos de la pila.
    public void mostrar_per(){
        Nodo aux = inicio;
        
        //recorre la pila hasta el ultimo nodo
        while(aux != null){
            System.out.print("|\t"+ aux.getPersonas()+ "\t|");
            aux = aux.getSiguiente();
        }
    }  
    
    //Muestra la cantidad de personas que hay en la cola
    public int cantidad_per(){
        int cant = 0;
        Nodo aux = inicio;
        while(aux != null){
            cant++;
            aux = aux.getSiguiente();
        }
        return cant;
    }
}
