package com.diegocayo.cursojava.arrays;

import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] a, pares, impares;
        int totalpares= 0, totalImpares = 0;
        a = new int[10];

        System.out.println("Introduce 10 numeros");
        for (int i = 0; i <a.length; i++) {
            a[i] = lector.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2==0){
                totalpares++;
            } else {
                totalImpares++;
            }
        }

        pares = new int[totalpares];
        impares = new int[totalImpares];
        int j = 0;
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0) {
                pares[j++] = a[i];
            } else {
                impares[k++] = a[i];
            }
        }
        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\r\nImpares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
    }




}
