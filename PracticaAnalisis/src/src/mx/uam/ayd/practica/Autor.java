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
public class Autor {

    private String nombre;
    private String apellido;
    private int anioNacimiento;

    public Autor(String nombre, String apellido, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNacimiento = anioNacimiento;
    }

    public String dameNombre() {
        return nombre;
    }

    public String dameApellido() {
        return apellido;
    }

    public int AnioNacimiento() {
        return anioNacimiento;
    }
}
