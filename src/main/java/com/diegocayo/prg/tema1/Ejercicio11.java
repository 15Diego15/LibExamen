package com.diegocayo.prg.tema1;

import java.util.Scanner;

public class Ejercicio11 {
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Indica el minuendo");
        float minuendo = lector.nextFloat();
        System.out.println("Indica el sustraendo");
        float sustraendo = lector.nextFloat();

        System.out.println(resta(minuendo, sustraendo));
    }

    public static float resta(float minuendo, float sustraendo) {
        float resultado;
        resultado = minuendo - sustraendo;
        return resultado;
    }
}
