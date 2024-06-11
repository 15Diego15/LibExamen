package com.diegocayo.prg.tema3;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double cuotaBase = 500;

        System.out.println("Indica nombre: ");
        String nombre = lector.nextLine();

        System.out.println("Indica la edad: ");
        int edad = lector.nextInt();
        lector.nextLine();
        if (edad > 65) {
            cuotaBase = cuotaBase * 0.5;
            System.out.println("Tu cuota es: " + cuotaBase);
        } else if (edad < 18) {
            System.out.println("¿Tus padres son socios?(s/n)");
            String padresSocios = lector.nextLine();

            if (padresSocios.equalsIgnoreCase("s")) {
                cuotaBase = cuotaBase * 0.65;
                System.out.println("Tu cuota es: " + cuotaBase);
            } else if (padresSocios.equalsIgnoreCase("n")) {
                cuotaBase = cuotaBase * 0.75;
                System.out.println("Tu cuota es: " + cuotaBase);
            }
        } else {
            System.out.println("Tu cueta es: " + cuotaBase);
        }
    }
}
