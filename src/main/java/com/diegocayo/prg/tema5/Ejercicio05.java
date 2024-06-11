package com.diegocayo.prg.tema5;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el caracter que desea imprimir: ");
        char c = lector.next().charAt(0);

        System.out.println("Indica el numero de veces que desea imprimirlo: ");
        int numVeces = lector.nextInt();
        imprimirElemento(c, numVeces);
    }

    public static void imprimirElemento(char c, int numVeces) {
        for (int i = 0; i < numVeces; i++) {
            System.out.println(c);
        }
    }
}
