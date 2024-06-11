package com.diegocayo.cursojava.arrays;

import java.util.Scanner;

public class EjemploArreglosEliminarElemento {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese un número: ");
            a[i] = lector.nextInt();
        }

        System.out.println();
        System.out.println("Ingrese la posición que desea eliminar entre 0-9:");
        int posicion = lector.nextInt();
        lector.nextLine();

        for (int i = posicion; i < a.length -1 ; i++) {
            a[i] = a[i+1];
        }


        int[] b = new int[a.length-1];
        System.arraycopy(a,0,b,0,b.length);

        a = b;
        for (int i = 0; i <a.length; i++) {
            System.out.println(i + " => " + b[i]);
        }
    }
}
