package com.diegocayo.prg.tema5;

import java.util.Scanner;

public class Ejercicio15 {
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        imprimirMenu();
        int opcion = lector.nextInt();
        lector.nextLine();
        String palabra1, palabra2, palabra3;
        switch (opcion) {
            case 1:
                System.out.println("Indica la palabra 1");
                palabra1 = lector.nextLine();
                System.out.println("Indica la palabra 2");
                palabra2 = lector.nextLine();
                System.out.println("Indica la palabra 3");
                palabra3 = lector.nextLine();
                System.out.println("La palabras más lara es: " + palabraLarga(palabra1, palabra2, palabra3));
                break;
            case 2:
                System.out.println("Indica la palabra 1");
                palabra1 = lector.nextLine();
                System.out.println("Indica la palabra 2");
                palabra2 = lector.nextLine();
                System.out.println("Indica la palabra 3");
                palabra3 = lector.nextLine();
                System.out.println("La palabras más lara es: " + palabraCorta(palabra1, palabra2, palabra3));
                break;
        }
    }

    public static void imprimirMenu() {
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("==============");
        System.out.println("1. Palabra más larga.");
        System.out.println("2. Palabra más corta.");
        System.out.println("3. Número de vocales.");
        System.out.println("------------------------------------");
        System.out.println("0. Salir");
    }

    public static String palabraLarga(String palabra1, String palabra2, String palabra3) {
        if (palabra1.length() > palabra2.length() && palabra1.length() > palabra3.length()) {
            return palabra1;
        } else if (palabra2.length() > palabra1.length() && palabra2.length() > palabra3.length()) {
            return palabra2;
        } else {
            return palabra3;
        }
    }

    public static String palabraCorta(String palabra1, String palabra2, String palabra3) {
        if (palabra1.length() < palabra2.length() && palabra1.length() < palabra3.length()) {
            return palabra1;
        } else if (palabra2.length() < palabra1.length() && palabra2.length() < palabra3.length()) {
            return palabra2;
        } else {
            return palabra3;
        }
    }


}
