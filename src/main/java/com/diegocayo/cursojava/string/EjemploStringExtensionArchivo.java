package com.diegocayo.cursojava.string;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "imagen.png";

        System.out.println("archivo.length() = " + (archivo.length()-1));
        System.out.println("archivo.lastIndexOf(\".\") = " + archivo.lastIndexOf("."));
        int numero = archivo.lastIndexOf(".");
        int tamanyo = archivo.length()-1;

        String extension = archivo.substring(numero);
        System.out.println("extension = " + extension);
    }
}
