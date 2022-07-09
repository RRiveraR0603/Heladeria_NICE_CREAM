/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;

/**
 *
 * @author RICHARD RIVERA
 */
public class Pila_helado {
    private Nodo inicio;
    
    //Metodo Constructor
    public void Pila_helado(){
        inicio = null;
    }
    
    //Funcion que verifica si la pila esta vacia
    public boolean IsEmpety_helado(){
        return inicio == null;
    }
    
    //Metdodo de insertar dato a la pila (push)
    public void Push_helado(String helado){
        Nodo nuevo = new Nodo();
        nuevo.setHelado(helado);
        if(IsEmpety_helado()){
            inicio = nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }
    
    //Funcion de eliminar un dato de la pila (Pop)
    public String Pop_helado(){
        if(!IsEmpety_helado()){
            String dato = inicio.getHelado();
            inicio = inicio.getSiguiente();
            return dato;
        }else{
            return "Pila Vacia";
        }
    }
    
    //Funcion Buscar (Para identificar si un elemento existe en la pila)
    public boolean buscar_helado(String aBuscar){
        Nodo aux = inicio;
        boolean existe = false; //"existe" es utilizado para verificar si se encuentra el elemento.
        
        //Recorrer la pila hasta encontrar el elemento
        while(existe != false && aux != null){
            
            //Compara si el valor del nodo es igual al valor a buscar.
            if(aBuscar == aux.getHelado()){
                existe = true; //"existe" indicara que el valor fue encontrado
            }else{
                aux = aux.getSiguiente();
            }
        }
        return existe; //Termina y retorna true y false
    }
    
    //Metodo que muestra todos los elementos de la pila.
    public void mostrar_helados(){
        Nodo aux = inicio;
        
        //recorre la pila hasta el ultimo nodo
        while(aux != null){
            System.out.println("|\t"+ aux.getHelado()+ "\t|");
            aux = aux.getSiguiente();
        }
    }  
}
