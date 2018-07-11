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
public class Aplicacion {

    static Libreria libreriaInicial;
    static DAOAutor autoresInicial;

    public static void main(String[] args) {
        libreriaInicial = new Libreria();
        autoresInicial = new DAOAutor();
        
        Aplicacion app = new Aplicacion();
        app.inicia();
    }

    public Aplicacion() {
    }

    public void inicia() {

        VentanaPrincipal ventana = new VentanaPrincipal(this);
        ventana.setVisible(true);
        // ventana1.setVisible(rootPaneCheckingEnabled);

    }

    public void agregarAutor() {
        System.out.println("agregarAutor");
        ControlAgregarAutor nuevoAutor = new ControlAgregarAutor(autoresInicial);
        nuevoAutor.inicia();
    }

    public void agregarLibro() {
        System.out.println("agregarLibro");
    }

    public void agregarRevista() {
        System.out.println("agregarRevista");
        ControlAgregarRevista nuevaRevista = new ControlAgregarRevista(libreriaInicial);
        nuevaRevista.inicia();
    }

    public void buscarMaterial() {
        System.out.println("buscarMaterial");
    }

    public void quitarMaterial() {
        System.out.println("quitarMaterial");
    }

    public void listarMateriales() {
        System.out.println("listarMateriales");
        if (libreriaInicial.cuantosMateriales() == 0) {
            System.out.println("No hay material");
        }
        listaMateriales(libreriaInicial.dameMateriales());

    }

    private void listaMateriales(Material[] materiales) {
        for (Material m : materiales) {
            System.out.println(m);
        }
    }

}


