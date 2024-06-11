package com.diegocayo.cursojava.string;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;
        // importa el orden, izq a der, y los parentesis
        System.out.println(detalle + (numeroA + numeroB));

        System.out.println(numeroA + numeroB + detalle);
        // metodo .concat, concatena Strings
        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);
    }
}
