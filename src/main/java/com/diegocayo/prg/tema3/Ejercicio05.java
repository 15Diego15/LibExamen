package com.diegocayo.prg.tema3;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        enum NotasAlfabeticas{INSUFICIENTE,SUFICIENTE,BIEN,NOTABLE,SOBRESALIENTE,ERROR};
        System.out.println("Introduce la nota");
        float edad = lector.nextFloat();

        if (edad >= 0 && edad < 5) {
            System.out.println(NotasAlfabeticas.INSUFICIENTE);
        } else if (edad >= 5 && edad < 6) {
            System.out.println(NotasAlfabeticas.SUFICIENTE);
        } else if (edad >= 6 && edad < 7) {
            System.out.println(NotasAlfabeticas.BIEN);
        } else if (edad >= 7 && edad < 9) {
            System.out.println(NotasAlfabeticas.NOTABLE);
        } else if (edad >=9 && edad <= 10) {
            System.out.println(NotasAlfabeticas.SOBRESALIENTE);
        } else {
            System.out.println(NotasAlfabeticas.ERROR);
        }
    }
}
