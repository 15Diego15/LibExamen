package com.diegocayo.prg.tema5;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Indica un número para calcular su tabla de multiplicar");
            numero = lector.nextInt();
            calcularTabla(numero);
        } while(numero > 0);
        System.out.println("Has salido");
    }

    public static void calcularTabla(int numero) {
        int resultado;
        for (int i = 1; i <= 10; i++) {
            resultado = i * numero;
            System.out.println(i + " x " + numero + " = " + resultado);
        }
    }
}
