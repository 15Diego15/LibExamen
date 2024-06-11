package com.diegocayo.prg.tema3.ejerciciosbucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    private static Scanner lector = new Scanner(System.in);
    private static Random random = new Random();
    public static void main(String[] args) {

        int contadorJugador = 0, contadorNPC = 0;
        int porrasJugador = 0, porrasNPC = 0;
        System.out.println("********************");
        System.out.println("*****START GAME*****");
        System.out.println("********************");

        do {
            System.out.println("Su puntuación actual es " + contadorJugador + ". Desea tirar el dado (S/N)");
            String deseaLanzar = lector.nextLine();
            if (deseaLanzar.equalsIgnoreCase("S")) {
                contadorJugador += generarNumAleatorio();
                if (contadorJugador == 11) {
                    System.out.println("Felicidades, Has ganado");
                    porrasJugador++;
                    porrasJugador++;
                } else if (contadorJugador < 11) {
                    System.out.println("Turno del NPC");
                    do {
                        contadorNPC += generarNumAleatorio();
                        if (contadorNPC == 11) {
                            System.out.println("Has Perdido, Gano el NPC");
                            porrasNPC++;
                            porrasNPC++;
                        } else if (contadorNPC == contadorJugador) {
                            System.out.println("El ordenador te ha igualo, gana el ordenador");
                            porrasNPC++;
                        } else if (contadorNPC > 11) {
                            System.out.println("El ordenador se ha pasado de 11, Has ganado");
                            porrasJugador++;
                        }
                    } while (contadorNPC < 11);
                } else if ( contadorJugador > 11) {
                    System.out.println("Te has pasado de 11, has perdido");
                    porrasNPC++;
                }
            } else if (deseaLanzar.equalsIgnoreCase("N")) {
                break;
            }
            contadorJugador = 0;
            contadorNPC = 0;
            System.out.println("El marcador Actual es:");
            System.out.println("porrasJugador = " + porrasJugador);
            System.out.println("porrasNPC = " + porrasNPC);
        } while (porrasJugador < 5 && porrasNPC < 5);

    }

    public static int generarNumAleatorio() {
        int numAleatorio = random.nextInt(6 - 1 + 1) + 1;
        return numAleatorio;
    }

}
