package com.diegocayo.cursojava.flujodecontrol;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        char num = 'a';

        switch (num) {
            case '0':
                System.out.println("El num es cero");
                break;
            case '1':
                System.out.println("El num es uno");
                break;
            case '2':
                System.out.println("El num es dos");
                break;
            case '3':
                System.out.println("El num es tres");
                break;
            case '4':
                System.out.println("El num es cuatro");
                break;
            default:
                System.out.println("Número o caracter desconocido");
        }

        String nombre = "andres";

        switch (nombre) {
            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case "andres":
                System.out.println("Hola andres, bienvenido!");
                break;
            case "pepe":
                System.out.println("Hola pepe, bienvenido!");
                break;
            default:
                System.out.println("Usuario no encontrado");
        }
    }
}
