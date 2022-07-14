/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;

/**
 *
 * @author RICHARD RIVERA
 */
public class ListaInv {
    private Nodo<Inventario> inicio;
    private int longitud;
    
    /**
     * Constructor por defecto.
     */
    public void ListaInv(){
        inicio = null;
        longitud = 0;
    }
    
    /**
     * Consulta si la lista esta vacia.
     * 
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean esVacia() {
        return inicio == null;
    }
    
    /**
     * Consulta cuantos elementos (nodos) tiene la lista.
     * 
     * @return numero entero entre [0,n] donde n es el numero de elementos
     * que contenga la lista.
     */
    public int getLongitud() {
        return longitud;
    }
    
    public void agregarFinal(Inventario v){
        Nodo<Inventario> nuevo = new Nodo(v);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            Nodo<Inventario> auxNodo = inicio;
            while(auxNodo.getSig() != null) {
                auxNodo = auxNodo.getSig();
            }
            auxNodo.setSig(nuevo);
        }
        longitud++;
    }
    /**
     * Agrega un nuevo nodo al inicio de la lista.
     * 
     * @param v Valor a agregar.
     */   
    public void agregarInicio(Inventario v){
        Nodo<Inventario> nuevo = new Nodo(v);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSig(inicio);
            inicio = nuevo;
        }
        longitud++;
    }
    
    /**
     * Obtiene el valor de un nodo en una determinada posición.
     * 
     * @param pos posición del nodo que se desea obtener su valor.
     * @return un numero entero entre [1,n-1] n = numero de nodos de la lista.
     */
    public Inventario getValor(int pos) {
        if(pos >= 0 && pos < longitud) {
            if (pos == 0) {
                return inicio.getValor();
            } else {
                Nodo<Inventario> auxNodo = inicio;
                for (int i = 0; i < pos; i++) {
                    auxNodo = auxNodo.getSig();
                }
                return auxNodo.getValor();
            }
        }
        return null;
    }
    
    public static ListaInv ordenar(ListaInv inventario) {
        ListaInv tempInv = new ListaInv(); 
        int cantMayor = 0;
        for (int i = 0; i < inventario.getLongitud(); i++) {
            if (inventario.getValor(i).getCantVentas() > cantMayor) {
                cantMayor = inventario.getValor(i).getCantVentas();
                tempInv.agregarInicio(inventario.getValor(i));
            } else if (inventario.getValor(i).getCantVentas() == cantMayor)  {
                tempInv.agregarInicio(inventario.getValor(i));
            } else {
                tempInv.agregarFinal(inventario.getValor(i));
            }
        }
        return tempInv;
    }
    
    public static ListaInv llenarLista(String[] saboresInv) {
        String tempSabor = null;
        Inventario tempInv = new Inventario();
        ListaInv tempListInv = new ListaInv();
        for (int i = 0; i < saboresInv.length ; i++) {
            tempSabor = saboresInv[i];
            tempInv = new Inventario(tempSabor);
            tempListInv.agregarFinal(tempInv);
        }
        return tempListInv;
    }
    
    @Override
    public String toString() {
        String string = "";
        Nodo<Inventario> actual = inicio;
        int contador = 0;
        for(int i = 0; i < longitud; i++) {
            contador++;
            string += "\t" + contador + ". " + actual.getValor().getNombre() + "\n";
            string += "\t\t" + "    Cantidad de ventas: " + actual.getValor().getCantVentas() + "\n\n";
            actual = actual.getSig();
        }
        return string;
    }
}
    

