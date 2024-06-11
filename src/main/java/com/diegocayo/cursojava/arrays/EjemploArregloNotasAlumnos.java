package com.diegocayo.cursojava.arrays;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMatematicas=0, sumNotasHistoria=0, sumNotasLenguaje = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        System.out.println("Ingrese 7 notas de estudiantes para matematicas:");
        for (int i = 0; i< claseMatematicas.length; i++) {
            claseMatematicas[i] = lector.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia:");
        for (int i = 0; i< claseHistoria.length; i++) {
            claseHistoria[i] = lector.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje:");
        for (int i = 0; i< claseLenguaje.length; i++) {
            claseLenguaje[i] = lector.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas= sumNotasMatematicas/claseMatematicas.length;
        double promedioHistoria= sumNotasHistoria/claseHistoria.length;
        double promedioLenguaje= sumNotasLenguaje/claseLenguaje.length;
        System.out.println("promedio mates = " + promedioMatematicas);
        System.out.println("promedio historia = " + promedioHistoria);
        System.out.println("promedio lenguaje = " + promedioLenguaje);
        System.out.println("promedio curso = " + (promedioMatematicas+promedioHistoria+promedioLenguaje)/3);

        System.out.println("Ingrese el identificador del alumno (de 0-6: ");
        int id = lector.nextInt();
        lector.nextLine();
        double promedioAlumno = (claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id])/3;
        System.out.println("promedioAlumno id "+ id +" " + promedioAlumno);

    }

}
