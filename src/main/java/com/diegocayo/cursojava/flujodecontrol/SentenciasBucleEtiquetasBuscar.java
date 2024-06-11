package com.diegocayo.cursojava.flujodecontrol;

public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal";
        int cantidad = 0;
        char letra = 'g';
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != letra) {
                continue;
            }
            cantidad++;
        }
        System.out.println("cantidad = " + cantidad);
    }
}
