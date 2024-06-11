package com.diegocayo.prg.tema3.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        int contador = 0;
        float media = 0;
        do {
            System.out.println("Indica un número");
            numero = lector.nextInt();
            lector.nextLine();
            contador += numero;
            media++;
        } while((numero > 0));
        System.out.println("media = " + contador/media);
        System.out.println("contador = " + contador);
    }
}
