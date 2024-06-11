package com.diegocayo.prg.tema3.ejerciciosbucles;

public class Ejercicio05 {
    public static void main(String[] args) {
        int contadorImpares = 0;
        int contadorPares = 0;
        int contadorNumerosMultiplos5 = 0;
        int sumaImpares = 0;
        int sumaPares = 0;
        int sumaMultiple = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " impar");
                contadorImpares++;
                sumaImpares += i;
            } else {
                System.out.println(i + " par");
                contadorPares++;
                sumaPares += i;
            }
            if (i % 5== 0) {
                System.out.println("Multiplo de 5");
                contadorNumerosMultiplos5++;
                sumaMultiple += i;
            }
        }
        System.out.println("El numero de numeros impares es = " + contadorImpares);
        System.out.println("La suma de los numeros impares es = " + sumaImpares);
        System.out.println("El numero de numeros pares es = " + contadorPares);
        System.out.println("La suma de los numeros pares es = " + sumaPares);
        System.out.println("El numero de numeros multiplos de 5 es = " + contadorNumerosMultiplos5);
        System.out.println("La suma de los numeros multiplos de 5 es = " + sumaMultiple);
    }
}
