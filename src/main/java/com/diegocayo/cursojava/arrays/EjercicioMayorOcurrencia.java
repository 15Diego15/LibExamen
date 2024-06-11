package com.diegocayo.cursojava.arrays;

import java.util.Random;
import java.util.Scanner;

public class EjercicioMayorOcurrencia {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            int numAleatorio = random.nextInt(9-1+1)+1;
            numeros[i] = numAleatorio;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
}
