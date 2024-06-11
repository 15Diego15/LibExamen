package com.diegocayo.cursojava.arrays;

import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Kingston";
        productos[1] = "Samsumg";
        productos[2] = "Disco duro ssd Samgum";
        productos[3] = "Asus";
        productos[4] = "Macbook";
        productos[5] = "Chrome";
        productos[6] = "Bicicleta";

        //sort, ordena de forma alfabetica.
        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);
        System.out.println(productos[3]);
        System.out.println(productos[4]);
        System.out.println(productos[5]);
        System.out.println(productos[6]);


        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = 3;
        numeros[3] = 1;
        // numeros[4] = 5;

        // sort ordena de mayor menor
        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];
        //int m = numeros[4];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
