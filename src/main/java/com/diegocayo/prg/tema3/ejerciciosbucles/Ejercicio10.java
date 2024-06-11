package com.diegocayo.prg.tema3.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        int contador = 0;
        do {
            System.out.println("Indica un número");
            numero = lector.nextInt();
            contador += numero;
        } while(!(numero == 0));
        System.out.println("contador = " + contador);
    }
}
