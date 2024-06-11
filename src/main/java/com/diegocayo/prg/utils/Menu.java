package com.diegocayo.prg.utils;

import java.util.Scanner;

/**
 * Métodos para mostrar menús en la consola.
 */
public class Menu {
    /**
     * Muestra un menú con un título, una lista de opciones y un texto final, y devuelve la opción seleccionada por el usuario.
     *
     * @param titulo el título del menú
     * @param opciones una matriz de cadenas que contiene las opciones del menú
     * @param textoSalir el texto final a mostrar después de las opciones
     * @return la opción seleccionada por el usuario
     */
    public static int mostrarMenuConSalida(String titulo, String[] opciones, String textoSalir) {
        int opcion;
        do {
            System.out.println("*********************");
            System.out.println("**** " + titulo + " ****");
            System.out.println("*********************");
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }
            System.out.println("-----------------------");
            System.out.println("0. " + textoSalir);
            opcion = obtenerOpcionValida();
            if (opcion < 0 || opcion > opciones.length) {
                System.out.println("Error, el número introducido no es válido.");
            }
        } while (opcion < 0 || opcion > opciones.length);
        return opcion;
    }

    /**
     * Muestra un menú con un título y una lista de opciones, y devuelve la opción seleccionada por el usuario.
     *
     * @param titulo el título del menú
     * @param opciones una matriz de cadenas que contiene las opciones del menú
     * @return la opción seleccionada por el usuario
     */
    public static int mostrarMenu(String titulo, String[] opciones) {
        int opcion;
        do {
            System.out.println("***************************************");
            System.out.println("**** " + titulo + " ****");
            System.out.println("***************************************");
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }
            System.out.println("-----------------------");
            opcion = obtenerOpcionValida();

            if (opcion < 1 || opcion > opciones.length) {
                System.out.println("Error, el número introducido no es válido.");
            }
        } while (opcion < 1 || opcion > opciones.length);
        return opcion;
    }

    /**
     * Obtiene una opción válida ingresada por el usuario.
     *
     * @return la opción ingresada por el usuario
     */
    private static int obtenerOpcionValida() {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;
        do {
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                valido = true;
            } else {
                System.out.println("Entrada no válida. Debe ingresar un número entero.");
                scanner.next();
            }
        } while (!valido);
        return numero;
    }
}
