package com.diegocayo.prg.tema3;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el número");
        int num = lector.nextInt();

        if (num % 2==0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
