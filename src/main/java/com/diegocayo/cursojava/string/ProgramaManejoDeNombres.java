package com.diegocayo.cursojava.string;

import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indique el nombre del familiar 1: ");
        String nombre1 = lector.nextLine();
        System.out.println("Indique el nombre del familiar 2: ");
        String nombre2 = lector.nextLine();
        System.out.println("Indique el nombre del familiar 3: ");
        String nombre3 = lector.nextLine();
        char c1 = nombre1.toUpperCase().charAt(1);
        char c2 = nombre2.toUpperCase().charAt(1);
        char c3 = nombre3.toUpperCase().charAt(1);
        String s1 = nombre1.substring(nombre1.length()-2);
        String s2 = nombre1.substring(nombre1.length()-2);
        String s3 = nombre1.substring(nombre1.length()-2);

        System.out.println(c1 + "." + s1 + "_" + c2 + "." + s2 + "_" + c3 + "." + s3 );
    }
}
