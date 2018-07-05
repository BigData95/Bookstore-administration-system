/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mx.uam.ayd.practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ivan
 */
public class Menu {

    private Libreria libreria;
    private final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public Menu() {
        libreria = new Libreria();
    }

    private void listaMateriales(Material[] materiales) {
        for (Material m : materiales) {
            System.out.println(m);
        }
    }

    private int leeEntero() {
        String entrada = "";

        try {
            entrada = in.readLine();
        } catch (IOException e) {
        }

        int val = 0;

        try {
            val = Integer.parseInt(entrada);

        } catch (NumberFormatException e) {
        }

        return val;
    }

    private String leeCadena() {
        String s = "";

        try {
            s = in.readLine();
        } catch (IOException e) {
            System.out.println("Error en la lectura de la cadena");
        }
        return s;
    }

    private double leeDoble() {
        String entrada = "";
        try {
            entrada = in.readLine();
        } catch (IOException e) {
        }

        double val = 0;

        try {
            val = Double.parseDouble(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Error en la lectura");
        }
        return val;
    }

    public void despliedaMenu() {
        int opcion = 0;

        do {

            System.out.println("\n1- Agregar  material");
            System.out.println("2- Buscar material");
            System.out.println("3- Eliminar material");
            System.out.println("4- Listar todo el material");
            do {

                System.out.println("Escoge una opcion o presiona 0 para salir.");
                opcion = leeEntero();

            } while (opcion < 0 || opcion > 4);

            switch (opcion) {

                case 1: //Agrega Material

                    int entrada = 0;

                    do {

                        System.out.println("\nPresiona 1 si quieres agregar un libro"
                                + "	o 2 si quieres agregar una revista");

                        entrada = leeEntero();

                        if (entrada == 1) {

                            String nombre;
                            String apellido;
                            int anioNacimiento;
                            String titulo;
                            double precio;

                            System.out.println("Primero dame los datos del Autor"
                                    + "\n Dame el nombre del autor");
                            nombre = leeCadena();

                            System.out.println("Ahora dame el apellido del autor");
                            apellido = leeCadena();

                            System.out.println("Ahora dame el year de nacimiento");
                            anioNacimiento = leeEntero();

                            Autor nuevoAutor = new Autor(nombre, apellido, anioNacimiento);

                            System.out.println("Ahora dame el titulo del libro");
                            titulo = leeCadena();

                            System.out.println("Ahora dame el precio del libro");
                            precio = leeDoble();

                            Libro nuevoLibro = new Libro(nuevoAutor, titulo, precio);

                            libreria.agregaMaterial(nuevoLibro);

                            break;

                        } else if (entrada == 2) {

                            String nombre;
                            int numero;
                            double precio;

                            System.out.println("Primero dame el nombre de la revista");
                            nombre = leeCadena();
                            System.out.println("Ahora dame el numero de la revista");
                            numero = leeEntero();
                            System.out.println("Ahora dame el precio de la revista");
                            precio = leeDoble();

                            Revista nuevaRevista = new Revista(numero, nombre, precio);
                            libreria.agregaMaterial(nuevaRevista);

                            break;
                        }

                    } while (entrada != 1 || entrada != 2);

                    break;

                case 2: //Buscar un material 

                    System.out.println("Ingresa lo que quieres buscar");
                    String criterio = leeCadena();
                    libreria.buscaMaterialCuyoNombreContenga(criterio);

                    break;

                case 3: //Eliminar un material 				

                    boolean estado;
                    String nombre;

                    System.out.println("Dame el nombre del material que quieres eliminar");
                    nombre = leeCadena();

                    Material[] auxiliar = new Material[1];
                    auxiliar = libreria.buscaMaterialCuyoNombreContenga(nombre);

                    if (libreria.cuantosMateriales() == 0) {
                        System.out.println("No hay material");
                        break;
                    }

                    Material materialQuitar = auxiliar[0];

                    estado = libreria.quitaMaterial(materialQuitar);

                    if (!estado) {
                        System.out.println("Parece que no se encuentra el material en la libreria");
                    } else {
                        System.out.println("Elemento eliminado con exito");
                    }

                    break;

                case 4: //Listar todos los materiales
                    if (libreria.cuantosMateriales() == 0) {
                        System.out.println("No hay material");
                    }
                    listaMateriales(libreria.dameMateriales());
                    break;

                default:

                    if (opcion == 0) {
                        System.out.println("Nos vemos");
                    } else {
                        System.out.println("Introduce una opcion valida o cero para salir");
                    }
                    break;
            }

        } while (opcion != 0);
    }

}
