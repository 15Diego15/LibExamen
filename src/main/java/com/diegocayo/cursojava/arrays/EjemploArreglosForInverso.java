package com.diegocayo.cursojava.arrays;

import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        //String[] productos = new String[7];
        String[] productos = {"Kingston","Samsumg","Disco duro ssd Samgumg","Asus","Macbook","Chrome","Bicicleta"};
        int total = productos.length;

        /*
        productos[0] = "Kingston";
        productos[1] = "Samsumg";
        productos[2] = "Disco duro ssd Samgum";
        productos[3] = "Asus";
        productos[4] = "Macbook";
        productos[5] = "Chrome";
        productos[6] = "Bicicleta";

         */

        //sort, ordena de forma alfabetica.
        Arrays.sort(productos);
        System.out.println("==== usando for ====");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }
        System.out.println("==== usando for inverso ====");
        for (int i = 0; i<total; i++) {
            System.out.println("para i = " + (total-1-i) + " valor: " + productos[total-1-i]);
        }

        System.out.println("==== usando for inverso2 ====");
        for (int i = total - 1; i > 0; i--) {
            System.out.println("para i = " + i + " valor: " + productos[i]);
        }
    }
}
