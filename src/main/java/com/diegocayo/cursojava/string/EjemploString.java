package com.diegocayo.cursojava.string;

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        String curso3 = "Programación Java";

        // 2 estancias diferentes, compara la referencia;
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        // compara el valor, mismo valor;
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        // compara las estancias, pero tambien el valor;
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
    }
}
