package com.diegocayo.prg.tema5;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el número 1");
        int num1 = lector.nextInt();
        System.out.println("Introduce el número 2");
        int num2 = lector.nextInt();
        System.out.println("El resultado de la suma es " + suma(num1,num2));
    }

    public static int suma(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }
}
