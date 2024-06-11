package com.diegocayo.prg.tema5;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el caracter que desea imprimir: ");
        char c = lector.next().charAt(0);

        System.out.println("Indica el numero de veces que desea imprimirlo en la misma linea: ");
        int numVeces = lector.nextInt();
        System.out.println("Indica el numero de lineas que desea imprimirlo: ");
        int numLineas = lector.nextInt();

        imprimirElemento(c, numVeces, numLineas);
    }

    public static void imprimirElemento(char c, int numVeces, int numLineas) {
        for (int i = 0; i < numLineas; i++) {
            for (int j = 0; j < numVeces; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
