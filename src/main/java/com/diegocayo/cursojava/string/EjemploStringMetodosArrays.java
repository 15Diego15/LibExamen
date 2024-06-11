package com.diegocayo.cursojava.string;

public class EjemploStringMetodosArrays {
    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] array = trabalenguas.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        // split- el caracter que le dices, lo salta y produce un salto de linea(si usa println)
        System.out.println("\ntrabalenguas.split(\"a\") = " + trabalenguas.split("a"));

        String[] array2 = trabalenguas.split("a");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        String archivo = "imagen.pdf";

        String[] archivoArray = archivo.split("\\.");

        for (int i = 0; i < archivoArray.length; i++) {
            System.out.println(archivoArray[i]);
        }
    }
}



