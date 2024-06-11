package com.diegocayo.prg.tema1;

import java.util.Scanner;

public class Ejercicio16 {
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Indica el precio en Euros: ");
        float euros = lector.nextFloat();

        float dolares = euros * 1.10f;
        System.out.println("dolares = " + dolares);
        float libras = euros * 0.90f;
        System.out.println("libras = " + libras);

    }
}
