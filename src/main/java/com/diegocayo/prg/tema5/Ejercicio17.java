package com.diegocayo.prg.tema5;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el ancho");
        int ancho = lector.nextInt();
        lector.nextLine();
        System.out.println("Indica el alto");
        int alto = lector.nextInt();
        lector.nextLine();
        System.out.println("Indica el caracter");
        char c = lector.next().charAt(0);
        mostrarTabla(ancho,alto,c);
    }

    public static void mostrarTabla(int ancho, int alto, char c) {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
