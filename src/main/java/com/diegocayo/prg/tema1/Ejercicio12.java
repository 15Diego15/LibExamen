package com.diegocayo.prg.tema1;

/*
 * Escribe un programa que visualice por pantalla la división de dos números.
 * El programa deberá pedir los dos números (dividendo y divisor), hacer
 * la división y mostrar el resultado.
 * */


import java.util.Scanner;

public class Ejercicio12 {
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Indica el dividendo");
        float dividendo = lector.nextFloat();
        System.out.println("Indica el divisor");
        float divisor = lector.nextFloat();

        System.out.println(division(dividendo, divisor));
    }

    public static float division(float dividendo, float divisor) {
        float resultado;
        resultado = dividendo / divisor;
        return resultado;
    }
}


