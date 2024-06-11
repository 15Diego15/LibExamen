package com.diegocayo.cursojava.arrays;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] a = new int[10];
        int elemento,posicion;
        for (int i = 0; i < a.length-1; i++) {
            System.out.println("Ingrese un número");
            a[i] = lector.nextInt();
        }
        System.out.println();

        System.out.println("Nuevo elemento");
        elemento = lector.nextInt();
        lector.nextLine();

        System.out.println("Posicion donde agregar (de 0 a 9)");
        posicion = lector.nextInt();
        lector.nextLine();

        for (int i = a.length-2; i>=posicion; i--) {
            a[i+1] = a[i];
        }
        a[posicion] = elemento;
        System.out.println("El arreglo:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a = " + a[i]);
        }
    }
}
