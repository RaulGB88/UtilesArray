/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

import java.util.Random;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class DesordenarArray {

    public static void desordenarArray(int[] lista) {

        Random rnd = new Random(System.currentTimeMillis());

        for (int i = 0; i < lista.length; i++) {

            int aux = lista[i];
            int posicion = rnd.nextInt(lista.length);

            lista[i] = lista[posicion];

            lista[posicion] = aux;
        }
    }
    
}
