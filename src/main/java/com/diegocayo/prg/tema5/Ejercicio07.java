package com.diegocayo.prg.tema5;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el numero del cual desea calcular el factorial");
        int num = lector.nextInt();
        int resultado = calcularFactorial(num);
        System.out.println("El resultado es: " + resultado);
    }

    public static int calcularFactorial(int num) {
        int resultado = num;
        for (int i = num - 1; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }
}
