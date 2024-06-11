package com.diegocayo.prg.tema5;

import java.util.Scanner;

public class Ejercicio08 {
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

        System.out.println(esCapicua(numero1,numero2,numero3,numero4));
    }
    public static boolean esCapicua (int numero1, int numero2, int numero3, int numero4) {

        if (numero1 == numero4 && numero2 == numero3) {
            return true;
        } else {
            return false;
        }
    }
}
