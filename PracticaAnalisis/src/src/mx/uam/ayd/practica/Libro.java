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
public class Libro extends Material {

    Autor autor;

    public Libro(Autor autor, String nombre, double precio) {
        super(nombre, precio);
        this.autor = autor;
    }

    public Autor dameAutor() {
        return autor;
    }

    @Override
    public double damePrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Libro: " + nombre + " Autor: " + autor.dameNombre() + " " + autor.dameApellido()
                + "Precio: " + precio;
    }
}
