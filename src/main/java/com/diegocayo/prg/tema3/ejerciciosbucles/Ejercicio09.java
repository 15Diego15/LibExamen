package com.diegocayo.prg.tema3.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = lector.nextInt();
        lector.nextLine();
        /*if (numero % 1==0 && numero % numero==0) {
            System.out.println("Es un número primo.");
        } else {
            System.out.println("No Es un número primo");
        }*/
        boolean prime = true;
        for(int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime)
            System.out.println("The number is prime.");
        else
            System.out.println("The number isn't prime.");
    }
}
