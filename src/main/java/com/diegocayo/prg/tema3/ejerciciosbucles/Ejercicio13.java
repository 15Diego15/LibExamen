package com.diegocayo.prg.tema3.ejerciciosbucles;

import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        Random random = new Random();
        final int NUM_INTENTOS = 1000000;
        int moneda;
        float contadorCaras = 0, contadorCruces = 0;
        for (int i = 0; i < NUM_INTENTOS; i++) {
            moneda = random.nextInt(2 -1 + 1) +1;
            if (moneda == 1) {
                contadorCaras++;
            } else if (moneda == 2) {
                contadorCruces++;
            }
        }
        System.out.println("contadorCaras = " + contadorCaras/NUM_INTENTOS * 100 + " %");
        System.out.println("contadorCruces = " + contadorCruces/NUM_INTENTOS * 100 + " %");
    }
}
