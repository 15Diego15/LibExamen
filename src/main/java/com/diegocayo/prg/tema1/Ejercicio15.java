package com.diegocayo.prg.tema1;

import java.util.Scanner;

public class Ejercicio15 {
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Indica los grados centígrados: ");
        float gradosCentigrados = lector.nextFloat();

        float gradosKelvin = 273.15f + gradosCentigrados;
        System.out.println("gradosKelvin = " + gradosKelvin);
        float gradosFahrenheit = gradosCentigrados * (5/9) +32;
        System.out.println("gradosFahrenheit = " + gradosFahrenheit);


    }
}
