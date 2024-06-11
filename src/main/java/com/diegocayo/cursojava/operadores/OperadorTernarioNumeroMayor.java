package com.diegocayo.cursojava.operadores;

import java.util.Scanner;
public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int max = 0;

        System.out.println("ingrese un número");
        int num1 = lector.nextInt();

        System.out.println("ingrese segundo número");
        int num2 = lector.nextInt();

        System.out.println("ingrese tercer número");
        int num3 = lector.nextInt();

        max = (num1 > num2) ?num1 : num2;
        max = (max > num3) ? max : num3;
        System.out.println("max = " + max);


    }
}
