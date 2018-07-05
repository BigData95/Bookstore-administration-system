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
public class Libreria {

    private ArrayList<Material> material;

    public Libreria() {
        material = new ArrayList<Material>();
    }

    public boolean agregaMaterial(Material m) {

        material.add(m);
        if (material.get(0).equals(m)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean quitaMaterial(Material materialQuitar) {
        return material.remove(materialQuitar);

    }

    public Material[] dameMateriales() {

        Material materialTemp[] = new Material[material.size()];
        material.toArray(materialTemp);
        for (int i = 0; i < materialTemp.length; i++) {
            System.out.println("[" + materialTemp[i].dameNombre() + "]");
        }
        return materialTemp;
    }

    public Material[] buscaMaterialCuyoNombreContenga(String criterio) {

        Material[] auxiliar = new Material[material.size()];
        for (int i = 0; i < material.size(); i++) {

            if (material.get(i).nombre.contains(criterio)) {

                auxiliar[i] = material.get(i);
                System.out.println(auxiliar[i]);
                //System.out.println("["+auxiliar[i].nombre+"]");
            }
        }
        return auxiliar;
    }

    public int cuantosMateriales() {
        return material.size();
    }

}
