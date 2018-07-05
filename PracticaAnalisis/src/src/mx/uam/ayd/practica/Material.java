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
public abstract class Material {

    String nombre;
    double precio;

    public Material(String nombre, double precio) {

        this.nombre = nombre;
        this.precio = precio;
    }

    public String dameNombre() {
        return nombre;
    }

    public boolean cambiaPrecio(double nuevoPrecio) {
        if (precio > 0) {
            this.precio = nuevoPrecio;
            return true;
        }
        return false;
    }

    public abstract double damePrecio();

}
