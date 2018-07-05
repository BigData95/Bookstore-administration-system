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
public class ControlAgregarRevista {

    Libreria libros;

    public ControlAgregarRevista(Libreria libros) {
        this.libros = libros;
    }

    public void inicia() {
        VentanaAgregarRevista ventanaRevista = new VentanaAgregarRevista(this);
        ventanaRevista.setVisible(true);
    }

    public void agregarRevista(String nombre, double precio, int num) {
        Revista nuevaRevista = new Revista(num, nombre, precio);
        libros.agregaMaterial(nuevaRevista);
    }

}
