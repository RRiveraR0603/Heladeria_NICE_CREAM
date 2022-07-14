/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeria_nice_cream;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author RICHARD RIVERA
 */
public class Archivos {
    
    public static Cola_Clientes<Cliente> hacerColaClientes() {
        Cola_Clientes<Cliente> clientes = new Cola_Clientes();
        Cliente tempCliente = new Cliente();
        try {
            Scanner leer = new Scanner(new FileReader("Clientes.in"));
            String nombre, apellido, telefono;
            nombre = apellido = telefono = null;
            while(leer.hasNextLine()) {
                String line = leer.nextLine();
                String[] separado = line.split("::");
                nombre = separado[0];
                apellido = separado[1];
                telefono = separado[2];
                tempCliente = new Cliente(nombre, apellido, telefono);
                clientes.enqueue(tempCliente);
            }
        } catch (FileNotFoundException fnfe) {
            Mostrar.error("El archivo \"Clientes.in\" no encontrado.");
        } catch (IOException ioe) { 
            Mostrar.error("El archivo \"Clientes.in\" no se puede leer.");
        }
        return clientes;
    }
    
public static void guardarFactura(int nPedido, String factura, Cliente cliente) {
    FileWriter file = null;
    BufferedWriter bw = null;
    try {
        file = new FileWriter("ventas.txt", true);
        bw = new BufferedWriter(file);
        bw.write("\t******************************");
        bw.newLine();
        bw.write("\t\t\t  Factura");
        bw.newLine();
        bw.newLine();
        bw.write("\tPedido nº: " + nPedido);
        bw.newLine();
        bw.write("\tCliente: ");
        bw.newLine();
        bw.write("\tNombre: " + cliente.getNombre());
        bw.newLine();
        bw.write("\tApellido: " + cliente.getApellido());
        bw.newLine();
        bw.write("\tTelefono: " + cliente.getTelefono());
        bw.newLine();
        bw.newLine();
        bw.write(factura);
        bw.write("\t******************************");
        bw.newLine();
        bw.newLine();
        bw.flush();
    } catch (FileNotFoundException fnfe) {
        Mostrar.error("El archivo \"ventas.txt\" no encontrado.");
    } catch (IOException ioe) {
        Mostrar.error("El archivo \"ventas.txt\" no se puede leer.");
    } finally {
        }try {
            if(bw != null) { 
                 bw.close();
            }
            if(file != null) { 
                file.close();
            } 
        } catch (IOException ioe) { 
        
        }    
    }

public static void guardarInventario(String inventario, String producto) {
        FileWriter file = null;
        BufferedWriter bw = null;
        try {
            file = new FileWriter("descuentos_inventario.txt", true);
            bw = new BufferedWriter(file);
            bw.write("\t\tInventario de " + producto);
            bw.newLine();
            bw.newLine();
            bw.write(inventario);
            bw.write("\t******************************");
            bw.newLine();
            bw.newLine();
            bw.flush();
        } catch (FileNotFoundException fnfe) {
            Mostrar.error("El archivo \"ventas.txt\" no encontrado.");
        } catch (IOException ioe) {
            Mostrar.error("El archivo \"ventas.txt\" no se puede leer.");
        } finally {
            try {
                if(bw != null) { 
                    bw.close();
                }
                if(file != null) { 
                    file.close();
                } 
            } catch (IOException ioe) { }
        }
    }
}

