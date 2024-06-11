package com.diegocayo.prg.tema3.ejerciciosbucles;

import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
        Random random = new Random();
        final int NUM_INTENTOS = 1000000;
        int moneda;
        float dado1 = 0, dado2 = 0, dado3 = 0, dado4 = 0, dado5 = 0, dado6 = 0;
        for (int i = 0; i < NUM_INTENTOS; i++) {
            moneda = random.nextInt(6 - 1 + 1) + 1;
            switch (moneda) {
                case 1:
                    dado1++;
                    break;
                case 2:
                    dado2++;
                    break;
                case 3:
                    dado3++;
                    break;
                case 4:
                    dado4++;
                    break;
                case 5:
                    dado5++;
                    break;
                case 6:
                    dado6++;
                    break;
            }
        }
        System.out.println("dado1 ha aparecido " + dado1 + " y su porcentaje es: = " + dado1 / NUM_INTENTOS * 100 + " %");
        System.out.println("dado2 ha aparecido " + dado2 + " y su porcentaje es: = " + dado2 / NUM_INTENTOS * 100 + " %");
        System.out.println("dado3 ha aparecido " + dado3 + " y su porcentaje es: = " + dado3 / NUM_INTENTOS * 100 + " %");
        System.out.println("dado4 ha aparecido " + dado4 + " y su porcentaje es: = " + dado4 / NUM_INTENTOS * 100 + " %");
        System.out.println("dado5 ha aparecido " + dado5 + " y su porcentaje es: = " + dado5 / NUM_INTENTOS * 100 + " %");
        System.out.println("dado6 ha aparecido " + dado6 + " y su porcentaje es: = " + dado6 / NUM_INTENTOS * 100 + " %");
    }
}
