package com.diegocayo.cursojava.operadores;

import java.util.Scanner;

public class OrdenarNumero {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Indica el primer número: ");
        double num1 = lector.nextDouble();

        System.out.print("Indica el segundo número: ");
        double num2 = lector.nextDouble();

        String resultado = (num1 > num2) ? num1 + " > " + num2 : num2 + " > " + num1;
        System.out.println("resultado = " + resultado);


        /*if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo número, por tanto queda ordenado así: " + num1 + " > " + num2);
        } else if (num2 > num1) {
            System.out.println("El segundo número es mayor que el primer número, por tanto queda ordenado así: " + num2 + " > " + num1);
        } else {
            System.out.println("Los números con iguales.");
        }*/
    }
}
