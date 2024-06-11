package com.diegocayo.cursojava.flujodecontrol;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5f;

        if(promedio >= 6.5) {
            System.out.println("Felicidades, genial promedio");
        } else if ( promedio >= 6.0){
            System.out.println("Muy Buen promedio");
        } else if (promedio >= 5.5) {
            System.out.println("Buena promedio");
        } else if (promedio >= 5.0) {
            System.out.println("Buen promedio");
        } else if (promedio >= 4.5) {
            System.out.println("Regular");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Reprobado");
        }
    }
}
