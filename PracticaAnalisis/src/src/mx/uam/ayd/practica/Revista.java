/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mx.uam.ayd.practica;

/**
 *
 * @author Ivan
 */
public class Revista extends Material {

    int numero;

    public Revista(int numero, String nombre, double precio) {
        super(nombre, precio);
        this.numero = numero;
    }

    public int dameNumero() {
        return numero;
    }

    @Override
    public double damePrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Revista: " + nombre + " Numero: " + numero + " Precio: " + precio;
    }

}
