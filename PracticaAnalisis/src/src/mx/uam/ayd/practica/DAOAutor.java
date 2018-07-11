/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mx.uam.ayd.practica;

import java.util.ArrayList;

/**
 *
 * @author Ivan
 */
public class DAOAutor {
    
    private ArrayList<Autor> listaAutores;
    
    public DAOAutor(){
        listaAutores = new ArrayList<>();
    }
    
    public boolean AgregarAutor(Autor autor){
        listaAutores.add(autor);
        return listaAutores.get(0).equals(autor);
    }
    
    public boolean QuitarAutor(Autor autor){
        return listaAutores.remove(autor);
    }
    
    public Autor[] dameAutores(){
        Autor[] autorTemp = new Autor[listaAutores.size()];
        listaAutores.toArray(autorTemp);
        for(int i = 0; i < autorTemp.length; i++){
                System.out.println("[" + autorTemp[i].dameNombre()+" "+ autorTemp[i].dameApellido() + "]");
        }
       return autorTemp;
    }
    
    public Autor buscarAutor(String nombre, String apellido){
        Autor autor = null;
        for(int i = 0; i < listaAutores.size(); i ++){
           if(listaAutores.get(i).dameNombre().contains(nombre) &&
                   listaAutores.get(i).dameApellido().contains(apellido)){
               autor = listaAutores.get(i);
           }else{
               System.out.println("No hay autores con esos nombres");
           }
        }
        return autor;
    }
    
    public int CuantosAutores(){
        return listaAutores.size();
    }
    
    
}
