package com.diegocayo.cursojava.arrays;

import java.util.Scanner;

public class EjemploArregloBuscarString {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String[] a = new String[4];

        for (int i = 0; i< a.length; i++) {
            System.out.print("Ingrese un nombre: ");
            a[i] = lector.nextLine();
        }
        System.out.println("\nIngrese un nombre a buscar:");
        String nombre = lector.nextLine();
        int i = 0;
        for (;i < a.length && !a[i].equalsIgnoreCase(nombre); i++) {
        }
        if (i == a.length){
            System.out.println("Número no encontrado");
        } else if (a[i].equalsIgnoreCase(nombre)) {
            System.out.println("Encontrado en la posición " + i);
        }
    }
}
