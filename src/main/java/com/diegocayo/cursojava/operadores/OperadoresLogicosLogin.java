package com.diegocayo.cursojava.operadores;

import java.util.Scanner;
public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "Diego";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345";*/

        String[] usernames = {"Diego", "admin", "pepe"};
        String[] passwords = {"12345", "12345", "12345"};

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = lector.nextLine();

        System.out.println("Ingrese el password");
        String p = lector.nextLine();

        boolean esAutenticado = false;

        for ( int i = 0; i < usernames.length; i++) {
            esAutenticado = (usernames[i].equalsIgnoreCase(u) && passwords[i].equals(p)) ? true : esAutenticado;

            /*if (usernames[i].equalsIgnoreCase(u) && passwords[i].equals(p)) {
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") : "Username o contraseña incorrectos!\n No tienes acceso" ;
        System.out.println("mensaje = " + mensaje);

        /*if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Username o contraseña incorrectos!");
            System.out.println("No tienes acceso");
        }*/
    }
}
