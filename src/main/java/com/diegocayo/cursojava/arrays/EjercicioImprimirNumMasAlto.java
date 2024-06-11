package com.diegocayo.cursojava.arrays;

import java.util.Scanner;

public class EjercicioImprimirNumMasAlto {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int[] numeros = new int[7];
        int max = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número");
            numeros[i] = lector.nextInt();
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        System.out.println("El número máximo es: " + max);
    }
}
