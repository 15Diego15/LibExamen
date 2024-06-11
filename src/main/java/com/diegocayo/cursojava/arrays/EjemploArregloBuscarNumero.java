package com.diegocayo.cursojava.arrays;

import java.util.Scanner;

public class EjemploArregloBuscarNumero {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i< a.length; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = lector.nextInt();
        }
        System.out.println("\nIngrese un número a buscar:");
        int num = lector.nextInt();
        lector.nextLine();
        int i = 0;
        for (;i < a.length && a[i] != num; i++) {
        }
        if (i == a.length){
            System.out.println("Número no encontrado");
        } else if (a[i]==num) {
            System.out.println("Encontrado en la posición " + i);
        }
    }
}
