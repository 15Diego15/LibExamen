package com.diegocayo.cursojava.arrays;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] a = new int[7];
        int numero, posicion;

        for (int i = 0; i < a.length-1; i++) {
            System.out.println("Ingrese un número: ");
            a[i] = lector.nextInt();
        }
        System.out.println();

        System.out.println("Número a insertar:");
        numero = lector.nextInt();
        lector.nextLine();

        posicion = 0;

        while (posicion < a.length-1 && numero > a[posicion]) {
            posicion++;
        }

        for (int i = a.length-2; i >=posicion; i--) {
            a[i+1] = a[i];
        }

        a[posicion] = numero;
        System.out.println("El arreglo ordenado");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i+ " => "+ a[i]);
        }
    }
}
