package com.diegocayo.cursojava.arrays;

import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] a = new int[7];

        System.out.println("Ingrese 7 números:");
        for (int i = 0; i < a.length; i++) {
            a[i] = lector.nextInt();
        }

        boolean ascendete = false;
        boolean descendente = false;
        for (int i = 0; i < a.length-1; i++) {

            if (a[i] >a[i+1]) {
                descendente = true;
            }
            if (a[i] < a[i+1]) {
                ascendete = true;
            }
        }

        if (ascendete == true && descendente == true) {
            System.out.println("Arreglo desordenado");
        }
        if (ascendete == false && descendente == false) {
            System.out.println("Arreglo todos son iguales");
        }
        if (ascendete == true && descendente == false) {
            System.out.println("Arreglo ascendente");
        }
        if (ascendete == false && descendente == true) {
            System.out.println("Arreglo descendente");
        }
    }
}
