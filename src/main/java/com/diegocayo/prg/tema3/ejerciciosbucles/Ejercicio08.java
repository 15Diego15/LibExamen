package com.diegocayo.prg.tema3.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el numero");
        int numero = lector.nextInt();
        int resultado = numero;
        for (int i = numero - 1; i > 1; i--) {
            resultado *= i;
        }
        System.out.println("resultado = " + resultado);
    }
}
