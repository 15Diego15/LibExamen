package com.diegocayo.prg.tema5;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el número 1");
        int numero1 = lector.nextInt();
        System.out.println("Introduce el número 2");
        int numero2 = lector.nextInt();
        System.out.println("Introduce el número 3");
        int numero3 = lector.nextInt();
        System.out.println("Introduce el número 4");
        int numero4 = lector.nextInt();
        int numeroMayor1 = numeroMayor(numero1, numero2);
        int numeroMayor2 = numeroMayor(numero3,numero4);
        int numeroFinal = numeroMayor(numeroMayor1, numeroMayor2);
        System.out.println("El número mayor es: " + numeroFinal);

        System.out.println("El número mayor es: " + numeroMayor(numero1,numero2,numero3,numero4));
    }

    public static int numeroMayor (int numero1, int numero2) {
        if (numero1 > numero2){
            return numero1;
        } else {
            return numero2;
        }
    }

    public static int numeroMayor (int numero1, int numero2, int numero3, int numero4) {
        int max = numero1;

        if (numero2 > max){
            max = numero2;
        } else if (numero3 > max) {
            max = numero3;
        } else if (numero4 > max) {
            max = numero4;
        }
        return max;
    }
}
