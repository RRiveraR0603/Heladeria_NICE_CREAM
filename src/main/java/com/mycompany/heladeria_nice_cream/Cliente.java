/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;

/**
 *
 * @author RICHARD RIVERA
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    
    public Cliente() {
        this.nombre = null;
    }
    
    public Cliente(String n, String a, String tlf) {
        this.nombre = n;
        this.apellido = a;
        this.telefono = tlf;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
}

