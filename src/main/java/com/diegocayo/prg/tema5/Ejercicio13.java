package com.diegocayo.prg.tema5;

import java.util.Scanner;

public class Ejercicio13 {
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce tu nombre");
        String nombre = lector.nextLine();
        Menu.mostrarMenu();
        String eleccionIdioma = lector.nextLine();
        System.out.println(darBuenosDias(nombre, eleccionIdioma));
    }

    public static String darBuenosDias(String nombre, String eleccionIdioma) {
        String buenosDias;
        if (eleccionIdioma.equalsIgnoreCase("a")) {
            buenosDias = "Bon dia ";
            return buenosDias + nombre;
        } else if (eleccionIdioma.equalsIgnoreCase("b")) {
            buenosDias = "Buenos días ";
            return buenosDias + nombre;
        } else if (eleccionIdioma.equalsIgnoreCase("c")) {
            buenosDias = "Good Morning ";
            return buenosDias + nombre;
        } else {
            return null;
        }
    }


    public class Menu {
        public static void mostrarMenu() {
            System.out.println("Elige tu idioma(a/b/c)");
            System.out.println("----------------");
            System.out.println("a) Valenciano");
            System.out.println("b) Castellano");
            System.out.println("c) Inglés");
        }
    }

}

