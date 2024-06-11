package com.diegocayo.prg.tema3.ejerciciosbucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner lector = new Scanner(System.in);
        int numeroAdivinar = random.nextInt(100 -1 + 1) + 1;
        System.out.println("Introduce el número de intentos máximos: ");
        int numeroIntentos = lector.nextInt();
        lector.nextLine();
        int numJugador;
        System.out.println(numeroAdivinar);
        for (int i = 1; i <= numeroIntentos; i++) {
            System.out.println("Intento numero "+ i);
            numJugador = lector.nextInt();
            lector.nextLine();
            if (numJugador == numeroAdivinar) {
                System.out.println("Felicidades, has ganado");
                System.exit(0);
            } else if (numJugador > numeroAdivinar) {
                System.out.println("El número es menor a " + numJugador);
            } else if (numJugador < numeroAdivinar) {
                System.out.println("El número es mayor a " + numJugador);
            }
        }
        System.out.println("Has perdido");
    }
}
