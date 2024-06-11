package com.diegocayo.prg.tema5;

import java.util.Random;

public class Ejercicio12 {
    private static Random random = new Random();
    public enum Notas{INSUFICIENTE,SUFICIENTE,BIEN,NOTABLE,EXCELENTE,ERROR}
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Nota " + i + " = " + calcularNota());
        }
    }

    public static int crearNotaAleatorio() {
        int notaAleatorio = random.nextInt(10 - 1 + 1) + 1;
        return notaAleatorio;
    }

    public static Notas calcularNota() {
        int nota = crearNotaAleatorio();
        if (nota > 0 && nota < 5) {
            return Notas.INSUFICIENTE;
        } else if (nota >= 5 && nota < 6) {
            return Notas.SUFICIENTE;
        } else if (nota >= 6 && nota < 7) {
            return Notas.BIEN;
        } else if (nota >= 7 && nota < 9) {
            return Notas.EXCELENTE;
        } else if (nota >= 9 && nota <= 10) {
            return Notas.EXCELENTE;
        } else {
            return Notas.ERROR;
        }
    }
}
