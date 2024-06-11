package com.diegocayo.cursojava.flujodecontrol;

import java.util.Scanner;

public class SistemaNotasAlumnos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numNotas = 20;
        double promedioTotal = 0;
        double promedioNotas5 = 0;
        double promedioNotasMenor4 = 0;
        int contadorPromMayor5 = 0;
        int contadorPromMenor4 = 0;
        int contadorVeces1 = 0;
        for (int i = 1; i <= numNotas; i++){

            System.out.println("Ingrese la nota del alumno " + i);
            double notaAlumno = lector.nextDouble();
            if (notaAlumno > 5) {
                promedioNotas5 += notaAlumno;
                contadorPromMayor5++;
            } else if (notaAlumno < 4) {
                promedioNotasMenor4 += notaAlumno;
                contadorPromMenor4++;
                if (notaAlumno == 1) {
                    contadorVeces1++;
                }
            }
            promedioTotal += notaAlumno;
        }

        promedioNotasMenor4 /= contadorPromMenor4;
        promedioNotas5 /= contadorPromMayor5;
        promedioTotal /= numNotas;

        System.out.println("promedioTotal = " + promedioTotal);
        System.out.println("promedioNotas5 = " + promedioNotas5);
        System.out.println("promedioNotasMenor4 = " + promedioNotasMenor4);
        System.out.println("contadorVeces1 = " + contadorVeces1);
    }
}
