package com.diegocayo.cursojava.arrays;

import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "Kingston";
        productos[1] = "Samsumg";
        productos[2] = "Disco duro ssd Samgum";
        productos[3] = "Asus";
        productos[4] = "Macbook";
        productos[5] = "Chrome";
        productos[6] = "Bicicleta";

        //sort, ordena de forma alfabetica.
        Arrays.sort(productos);
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        System.out.println("====Usando foreach====");
        for (String prod : productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println("====Usando while====");
        int i = 0;
        while (i < total) {
            System.out.println("para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("====Usando do while====");
        int j = 0;
        do {
            System.out.println("para indice " + j + " : " + productos[j]);
            j++;
        } while (j < total);




        int[] numeros = new int[10];

        for (int k = 0; k < numeros.length; k++) {
            numeros[k] = k*3;
        }

        for (int k = 0; k < numeros.length; k++) {
            System.out.println("numeros = " + numeros[k]);
        }


    }
}
