package com.diegocayo.cursojava.operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre incremento
        int i = 1;
        int j = ++i; // i = i + 1, primero se incrementa i, y luego se asigna el valor de j con el valor incrementado de i

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post incremento
        i = 2;
        j = i++; //primero se asigna el valor de j con el valor de i, y luego se incrementa i
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
