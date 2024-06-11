package com.diegocayo.cursojava.flujodecontrol;

import java.util.Scanner;

public class EjemploMultiplicarSinSigno {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero 1 para multiplicar");
        int num1 = lector.nextInt();
        System.out.println("Ingrese el numero 2 para multiplicar");
        int num2 = lector.nextInt();
        int contador = 0;
        for (int i = 0; i< num1; i++) {
            contador += num2;
        }
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es " + contador);
    }
}
