package com.diegocayo.prg.tema3.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el número a");
        int a = lector.nextInt();
        lector.nextLine();
        System.out.println("Introduce el número b");
        int b = lector.nextInt();
        lector.nextLine();
        int resultado = a;
        for (int i = 1; i < b; i++) {
            resultado = resultado * a;
        }
        
        System.out.println("resultado = " + resultado);
        
    }
}
