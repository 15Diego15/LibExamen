package com.diegocayo.cursojava.arrays;

import com.diegocayo.cursojava.arrays.EjemploArreglosForOrdenamientoBurubja;
import java.util.Scanner;

public class EjercicioOrdenarArregloUltPrim {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Integer[] numeros = new Integer[10];


        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número");
            numeros[i] = lector.nextInt();
        }

        System.out.println("Array ordenado de ultimo a primero: ");
        for (int i = 0; i < numeros.length/2 ; i++) {
            System.out.println(numeros[numeros.length-1-i]);
            System.out.println(numeros[i]);
        }
    }

}
