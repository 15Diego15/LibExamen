package com.diegocayo.prg.tema5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {
    private static Random random = new Random();
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Indica el número de partidos que desea jugar: ");
        int numPartidos = lector.nextInt();
        lector.nextLine();
        for (int i = 1; i <= numPartidos; i++) {
            System.out.print("Partido " + i + "      ");
            resultadoPartido();
        }

    }

    public static int generarNumAleatorio() {
        int numAleatorio = random.nextInt(10 - 1 + 1) + 1;
        return numAleatorio;
    }

    public static void resultadoPartido() {
        int equipo1 = generarNumAleatorio();
        int equipo2 = generarNumAleatorio();
        if (equipo1 > equipo2) {
            System.out.println("1");
        } else if (equipo1 < equipo2) {
            System.out.println("2");
        } else {
            System.out.println("X");
        }
    }

    public static void jugarPartidos(int numPartidos) {

    }
}
