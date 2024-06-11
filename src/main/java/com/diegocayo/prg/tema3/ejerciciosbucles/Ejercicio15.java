package com.diegocayo.prg.tema3.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int h,m,s;
        do {
            System.out.println("Introduce la hora");
            h = lector.nextInt();
        } while (h < 0 || h > 24);

        do {
            System.out.println("Introduce los minutos");
            m = lector.nextInt();
        } while (m < 0 || m > 60);

        do {
            System.out.println("Introduce los segundos");
            s = lector.nextInt();
        } while (s < 0 || s > 60);


    }

}
