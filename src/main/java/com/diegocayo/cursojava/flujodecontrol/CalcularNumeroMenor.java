package com.diegocayo.cursojava.flujodecontrol;

import java.util.Scanner;

public class CalcularNumeroMenor {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desea ingresar");
        int cantidad = lector.nextInt();

        if (cantidad < 10) {
            System.out.println("Cantidad invalida, el minimo es 10");
        } else {
            int numeroMenor = Integer.MAX_VALUE;
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese el numero " + i);
                int numero = lector.nextInt();
                if (numero < numeroMenor) {
                    numeroMenor = numero;
                }
            }


            if (numeroMenor < 10) {
                System.out.println("El número menor es menor que 10!");
            } else {
                System.out.println("El número menor es igual o mayor que 10!");
            }
        }
    }
}
