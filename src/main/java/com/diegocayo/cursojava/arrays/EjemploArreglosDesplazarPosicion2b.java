package com.diegocayo.cursojava.arrays;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int[] a = new int[10];
        int elemento,posicion, ultimo;

        for (int i = 0; i < a.length; i++) {
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

        ultimo = a[a.length-1];
        for (int i = a.length-2; i>=posicion; i--) {
            a[i+1] = a[i];
        }
        int[] b = new int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);
        a = b;
        a[posicion] = elemento;

        a[a.length-1] = ultimo;
        System.out.println("El arreglo:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("b = " + a[i]);
        }
    }
}
