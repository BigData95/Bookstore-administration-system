/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mx.uam.ayd.practica;

/**
 *
 * @author Ilich
 */
public class ControlAgregarLibro {
    Libreria libreria;
    DAOAutor autores;
    
    public ControlAgregarLibro(Libreria libreria, DAOAutor autores){
        this.libreria = libreria;
        this.autores = autores;
    }
    public void inicia(){
        VentanaAgregarLibro ventanaLibro = new VentanaAgregarLibro(this);
        ventanaLibro.setVisible(true);
    }
    
    public void buscarAutor(){
        //Busca un autor
    }
    
    public Autor[] dameAutores(){
        //Regresa arreglo con todos los autores
        return null;
    }
    
    public boolean agregarLibro(String nombre,Double precio, Autor autor){
        Libro nuevoLibro = new Libro(autor,nombre,precio);
        return libreria.agregaMaterial(nuevoLibro);
        
    }
    
    
}
