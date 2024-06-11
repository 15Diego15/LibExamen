package com.diegocayo.prg.utils;

import java.util.Random;

public class Aleatorios {
    public static int aleatorio(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min +1 ) + min;
    }
    public static double aleatorioDouble(double min, double max) {
        Random r = new Random();
        return r.nextDouble() * (max - min) + min;
    }
    public boolean aleatorioBoolean(){
        Random r = new Random();
        return r.nextBoolean();
    }
    public static char aleatorioChar(char min, char max){
        Random r = new Random();
        return (char) (r.nextInt(max - min + 1) + min);
    }
    public static float aleatorioFloat(float min, float max){
        Random r = new Random();
        return r.nextFloat() * (max - min) + min;
    }

    public static String generarNifAleatorio(){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numero = Aleatorios.aleatorio(1000000,9999999) - 1;
        int indice = numero % 23;
        return numero + "" + letras.charAt(indice);
    }
}
