package com.diegocayo.cursojava.operadores;

import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Indica la medida actual en litros de gasolina: ");
        double capacidadActual;
        do {
            capacidadActual = lector.nextDouble();
            if (capacidadActual == 70) {
                System.out.println("Estanque lleno");
            } else if (capacidadActual >= 60 && capacidadActual < 70 ) {
                System.out.println("Estanque casi lleno");
            } else if (capacidadActual >= 40 && capacidadActual < 70) {
                System.out.println("Estanque 3/4");
            } else if (capacidadActual >= 35 && capacidadActual < 40) {
                System.out.println("Medio Estanque");
            } else if (capacidadActual >= 20 && capacidadActual < 35) {
                System.out.println("Suficiente");
            } else if (capacidadActual >= 1 && capacidadActual < 20) {
                System.out.println("Insuficiente");
            } else {
                System.out.println("Valor incompatible, Introduzca de nuevo la medida de la gasolina: ");
            }

        } while (capacidadActual > 70 || capacidadActual < 1);

    }
}