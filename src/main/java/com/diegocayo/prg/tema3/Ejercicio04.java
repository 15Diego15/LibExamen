package com.diegocayo.prg.tema3;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el número 1");
        float num1 = lector.nextFloat();
        System.out.println("Introduce el número 2");
        float num2 = lector.nextFloat();

        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else if (num1 < num2){
            System.out.println(num2 + " > " + num1);
        } else {
            System.out.println(num1 + " = " + num2);
        }
    }
}
