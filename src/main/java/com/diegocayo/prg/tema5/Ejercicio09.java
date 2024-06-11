package com.diegocayo.prg.tema5;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el número del cual deseas calcula el sumatorio");
        int numero = lector.nextInt();
        System.out.println("El resultado es: " + calcularSumatorio(numero));
    }

    public static int calcularSumatorio(int numero) {
        int resultadoSumatorio = 0;
        for (int i = numero; i > 0; i--) {
            resultadoSumatorio += i;
        }
        return resultadoSumatorio;
    }


}
