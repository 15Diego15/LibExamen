package com.diegocayo.prg.tema3;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = lector.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = lector.nextInt();

        if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo numero");
        } else if (num1 < num2) {
            System.out.println("El primer número es menor que el segundo numero");
        } else {
            System.out.println("El primer numero es igual que el segundo numero");
        }
    }
}
