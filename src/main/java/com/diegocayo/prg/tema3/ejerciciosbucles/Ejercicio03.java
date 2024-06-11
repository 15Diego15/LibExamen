package com.diegocayo.prg.tema3.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el numero 1");
        int num1 = lector.nextInt();
        System.out.println("Introduce el numero 2");
        int num2 = lector.nextInt();
        int contador=0;
        for (int i = 0; i < num2; i++) {
            contador += num1;
        }
        System.out.println(contador);
    }
}
