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
public class ControlAgregarAutor {
    
    DAOAutor autores;
    
    public ControlAgregarAutor(DAOAutor autor){
        this.autores = autor;
    }
    
    public void inicia(){
        VentanaAgregarAutor ventanaAutor = new VentanaAgregarAutor(this);
        ventanaAutor.setVisible(true);
    }
    
    public boolean agregarAutor(String nombre, String apellido, int anio){
        Autor nuevoAutor = new Autor(nombre,apellido,anio);
        autores.AgregarAutor(nuevoAutor);
        return true;
    }
    
    
}
