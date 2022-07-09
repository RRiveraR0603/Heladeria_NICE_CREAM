/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;

/**
 *
 * @author RICHARD RIVERA
 */
public class Nodo {
    private int Valor;
    private String toping;
    private String helado;
    private String personas;
    private Barquilla bar;
    private Nodo sig;
    
    public void Nodo(){
        this.Valor = 0;
        this.toping = "";
        this.helado = "";
        this.personas = "";
        this.bar = null;
        this.sig = null;
    }
    
    public int getvalor(){
        return Valor;
    } 
    
    public void setValor(int Valor){
        this.Valor = Valor;
    }
    
    public Nodo getSiguiente(){
        return sig;
    }
    
    public void setSiguiente(Nodo sig){
        this.sig = sig;
    }
    
    public String getToping(){
        return toping;
    }
    
    public void setToping(String toping){
        this.toping = toping;
    }
    
    public String getHelado(){
        return helado;
    }
    
    public void setHelado(String helado){
        this.helado = helado;
    }
    
    public String getPersonas(){
        return personas;
    }
    
    public void setPersonas(String personas){
        this.personas = personas;
    }
    
    public Barquilla getBarquilla(){
        return bar;
    }
    
    public void setBarquilla(Barquilla bar){
        this.bar = bar;
        
    }
}
