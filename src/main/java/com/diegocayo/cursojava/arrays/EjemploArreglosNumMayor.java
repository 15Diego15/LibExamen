package com.diegocayo.cursojava.arrays;

import java.util.Scanner;

public class EjemploArreglosNumMayor {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("ingresa 5 enteros");
        for (int i = 0; i< a.length; i++) {
            a[i] = lector.nextInt();
        }

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max = (a[max] > a[i]) ? max: i;
        }
        System.out.println("a = " + a[max]);
    }
}
