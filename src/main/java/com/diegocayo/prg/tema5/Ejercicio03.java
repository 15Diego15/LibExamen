package com.diegocayo.prg.tema5;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el número 1");
        int numero1 = lector.nextInt();
        System.out.println("Introduce el número 2");
        int numero2 = lector.nextInt();

        System.out.println("El número mayor es: " + numeroMayor(numero1, numero2));
    }

    public static int numeroMayor (int numero1, int numero2) {
        if (numero1 > numero2){
            return numero1;
        } else {
            return numero2;
        }
    }
}
