/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;

/**
 *
 * @author RICHARD RIVERA
 */
public class Barquilla {
    private Pila<Helado> saboresHelado;
    private Pila<Topping> saboresTopping;
    int costo;

    public Barquilla() {
        this.saboresHelado = new Pila();
        this.saboresTopping = new Pila();
        costo = 0;
    }
  
    public int getCosto() {
        return this.costo;
    }
  
    public void agregarHelado(Helado sHelado) {
        this.saboresHelado.push(sHelado);
        costo++;
    }

    public void agregarTopping(Topping sTopping) {
        this.saboresTopping.push(sTopping);
        costo++;
    }

    @Override
    public String toString() {
        String string = "";
        int cant = 0;
        cant = saboresHelado.getSize();
        string += "\t" + cant + "x Bola de Helado:\n";
        
        for (int i = 1; i <= cant; i++) {
            string += "\t   " + i + ". " + saboresHelado.pop().getSabor() + ": 1$" + "\n";
        }

        cant = saboresTopping.getSize();
        string += "\t" + cant + "x Topping:\n";
        for (int i = 1; i <= cant; i++) {
	    string += "\t   " + i + ". " + saboresTopping.pop().getTopping() + ": 1$" + "\n";
        }

        string += "\n\tTOTAL\t\t\t   " + costo + "$" + "\n";
        return string;
    }
}

