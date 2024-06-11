package com.diegocayo.prg.tema3;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la edad");
        int edad = lector.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
