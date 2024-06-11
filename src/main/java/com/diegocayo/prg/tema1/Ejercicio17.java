package com.diegocayo.prg.tema1;

import java.util.Scanner;

public class Ejercicio17 {
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Indica el precio del litro de combustible ");
        float precioCombustible = lector.nextFloat();
        System.out.println("Indica el precio total de combustible ");
        float precioTotal = lector.nextFloat();
        System.out.println("Indica el numero de kilometros que marcaba el cuentakilometros");
        float numCuentaKilometros = lector.nextFloat();

        float vuelta1= calcularMedia(precioCombustible, precioTotal);

        System.out.println("Indica el precio del litro de combustible ");
        float precioCombustible2 = lector.nextFloat();
        System.out.println("Indica el precio total de combustible la segunda vez ");
        float precioTotal2 = lector.nextFloat();
        float vuelta2= calcularMedia(precioCombustible2, precioTotal2);


        System.out.println("Indica el numero de kilometros que marcaba el cuentakilometros");
        float numCuentaKilometros3 = lector.nextFloat();




    }

    public static float calcularMedia(float precioCombustible, float precioTotal) {
        float numKilometros = precioTotal / precioCombustible;
        return numKilometros;
    }
}
