package com.diegocayo.cursojava.operadores;

import java.util.Scanner;
public class OperadorTernario {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        String variable = 7 == 5 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        System.out.println("Ingrese la nota de matemáticas entre 2.0 - 7.0");
        matematicas = lector.nextDouble();
        System.out.println("Ingrese la nota de ciencias entre 2.0 - 7.0");
        ciencias = lector.nextDouble();
        System.out.println("Ingrese la nota de historia entre 2.0 - 7.0");
        historia = lector.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        System.out.println("promedio = " + promedio);
        estado = promedio >= 5.49 ? "Esta aprobado" : "Esta suspendido";
        System.out.println("estado = " + estado);

        /*if (promedio >= 5.49) {
            estado = "Aprobado";
        } else {        similar al operador ternario
            estado = "Rechazado";
        }*/
    }
}
