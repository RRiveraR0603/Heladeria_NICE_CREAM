/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;

/**
 *
 * @author RICHARD RIVERA
 */
public class Inventario {
    private String nombre;
    private int cantVentas;
    
    public Inventario() {
        this.nombre = null;
        this.cantVentas = 0;
    }
    
    public Inventario(String nombre) {
        this.nombre = nombre;
        this.cantVentas = 0;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setCantVentas() {
        this.cantVentas++;
    }
    
    public int getCantVentas() {
        return this.cantVentas;
    }
}

