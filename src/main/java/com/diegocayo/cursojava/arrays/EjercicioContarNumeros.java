package com.diegocayo.cursojava.arrays;

import java.util.Scanner;

public class EjercicioContarNumeros {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int[] numeros = new int[7];
        int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;
        int sumaPositivos = 0, sumaNegativos = 0;
        int mediaPositivos, mediaNegativos;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número");
            numeros[i] = lector.nextInt();
            if (numeros[i] > 0) {
                contadorPositivos++;
                sumaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                contadorNegativos++;
                sumaNegativos += numeros[i];
            } else {
                contadorCeros++;
            }
        }

        mediaPositivos = sumaPositivos / contadorPositivos;
        mediaNegativos = sumaNegativos / contadorNegativos;

        System.out.println("La media de números positivos es: " + mediaPositivos);
        System.out.println("La media de números negativos es: " + mediaNegativos);
        System.out.println("Las veces que aparece 0 es: " +  contadorCeros);

    }
}
