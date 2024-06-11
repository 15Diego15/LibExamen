package com.diegocayo.cursojava.string;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Andres";

        // Cuenta el número de caracteres desde 1
        System.out.println("nombre.length() = " + nombre.length());
        // Texto en mayúscula
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        // Texto en minúscula
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        // Booleano, Comprueba el valor, tiene en cuenta mayúsculas
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        // Booleano, Comprueba el valor, no tiene en cuenta mayúsculas y minúsculas.
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        // Devuelve el caracter que le digas, empieza desde 0,
        System.out.println("nombre.charAt(0) = " + nombre.charAt(1));
        // Devuelve el último caracter del String, importante el -1, sino error
        System.out.println("nombre.charAt(0) = " + nombre.charAt(nombre.length() - 1));
        // Devuelve los caracteres despues del indice que indica, incluido el indice indicado.
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        // Devuelve los caracteres despues del primer indice que indica, hasta el segundo indice que indica sin incluir
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));


        String trabalenguas = "trabalenguas";
        // Cambia los caracteres que indica(primero), por segundo caracter que indica
        System.out.println("trabalenguas = " + trabalenguas.replace("a","."));
        // Devuelve la posicion del caracter que indica, desde cero, solamente el primero que encuentra
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        // Devuelve la posicion del caracter/cadena que indica, desde cero, solamente el último que encuentra
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("lenguas"));
        // Booleano, devuelve si el caracter/cadena introducida esta en la cadena.
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        // Booleano, devuelve si el caracter/cadena introducida empieza igual en la cadena.
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("  trabalenguas  = ");
        // Elimina los espaciones del principio y final.
        System.out.println("  trabalenguas  ".trim());
    }
}



