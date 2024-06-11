package com.diegocayo.prg.tema5;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el radio de la circunferencia: ");
        double radio = lector.nextInt();

        System.out.println("Resultado area: " + calcularArea(radio));
        System.out.println("Resultado Longitud: " + calcularLongitud(radio));
    }

    public static double calcularArea(double radio) {
        double resultadoArea = Math.PI * (radio * radio);
        return resultadoArea;
    }

    public static double calcularLongitud(double radio) {
        double resultadoLongitud = Math.PI * (radio*2);
        return resultadoLongitud;
    }
}
