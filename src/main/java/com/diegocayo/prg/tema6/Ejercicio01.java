package com.diegocayo.prg.tema6;

public class Ejercicio01 {
    public static void main(String[] args) {
        String[] frase = {"la frase es esta"};

        for (int i = 0; i < frase.length; i++) {
            if (i == 0) {
                System.out.println(frase[i].toUpperCase());
            } else {
                System.out.println(frase[i]);
            }
        }
    }
}
