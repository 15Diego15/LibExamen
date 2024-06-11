package com.diegocayo.prg.tema1;

import java.util.Scanner;

/*
* Escribe un programa que solicite al usuario el radio de la circunferencia y calcule la longitud y el área de dicha circunferencia.

 * */
public class Ejercicio14 {
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce el radio de la circunferencia: ");
        float radio = lector.nextFloat();

        float longitud = (radio+radio) * 3.14f;
        System.out.println("La longitud de la circunferencia es: " + longitud);

        float area = (radio*2) * 3.14f;
        System.out.println("La area de la circunferencia es: " + area);
    }
}
