package com.diegocayo.cursojava.variables;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println(decimal == caracter);

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = '\u0020';//char espacio = ' '; el caracter es un Espacio
        char retroceso = '\b';  //char retroceso: borra caracter anterior
        char tabulador = '\t';  //char tabulador: genera una tabulación
        char nuevaLinea = '\n'; //char nuevaLínea: genera un salto de liniea
        char retornoCarro ='\r';//char retornoCarro: borra lo anterior al char

        System.out.println("char corresponde en byte:" + System.lineSeparator() + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);


    }
}

