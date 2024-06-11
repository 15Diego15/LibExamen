package com.diegocayo.prg.tema1;

import java.util.Scanner;

/*Escribe un programa que solicite al usuario una cantidad de segundos y
la convierta a días, horas, minutos y segundos.

 * */
public class Ejercicio13 {
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        int segundos;
        int seg, min, horas, dias;
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce los segundos: ");
        segundos = lector.nextInt();
        /** Consumimos salto de línea después de leer un entero */
        lector.nextLine();
        min = segundos / 60;
        seg = segundos % 60;
        horas = min / 60;
        min = min % 60;
        dias = horas / 24;
        horas = horas % 24;
        System.out.println(segundos + " segundos son " + dias + " días, " + horas + " horas, " + min + " minutos y " + seg + " segundos.");
        lector.close();
    }


}
