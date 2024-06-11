package com.diegocayo.prg.tema3.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el número del cual deseas saber la tabla de multiplicar (1-10)");
        int numero = lector.nextInt();
        while (numero > 10 || numero <1) {
            System.out.println("Numero invalido, debe ser un número entre 1 y 10");
            numero = lector.nextInt();
        }
        lector.close();
        int resultado;
        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
}
