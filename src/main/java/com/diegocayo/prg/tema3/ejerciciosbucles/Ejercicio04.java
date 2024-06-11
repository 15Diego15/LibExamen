package com.diegocayo.prg.tema3.ejerciciosbucles;

public class Ejercicio04 {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                contador++;
            }
        }
        System.out.println("El numero de numeros pares es = " + contador);
    }
}
