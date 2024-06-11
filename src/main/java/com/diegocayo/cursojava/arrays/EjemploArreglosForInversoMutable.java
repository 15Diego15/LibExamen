package com.diegocayo.cursojava.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {


        String[] productos = {"Kingston","Samsumg","Disco duro ssd Samgumg","Asus","Macbook","Chrome","Bicicleta"};
        int total = productos.length;


        //sort, ordena de forma alfabetica.
        Arrays.sort(productos);
        arregloInverso(productos);

        // ordena el array al inverso.
        //Collections.reverse(Arrays.asList(productos));
        System.out.println("==== usando for ====");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }


    }

    public static void arregloInverso(String[] arreglo) {
        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }

    }
}
