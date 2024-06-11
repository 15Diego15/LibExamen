package com.diegocayo.prg.tema1;

import java.util.Scanner;

public class Ejercicio08 {
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce tu edad: ");
        int edad = lector.nextInt();
        int edadEnDias = edad*365;
        System.out.println("edadEnDias = " + edadEnDias);
    }
}
