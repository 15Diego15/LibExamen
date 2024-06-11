package com.diegocayo.cursojava.operadores;

import javax.swing.*;

public class ObtenerNombreMasLargo {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre de la primera persona");
        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre de la Segunda persona");
        String nombre3 = JOptionPane.showInputDialog("Ingrese el nombre de la Tercra persona");

        String nombreMasLargo = (nombre1.split(" ")[0].length() > nombre2.split(" ")[0].length()) ? nombre1 : nombre2;
        nombreMasLargo = (nombreMasLargo.split(" ")[0].length() > nombre3.split(" ")[0].length()) ? nombreMasLargo : nombre3;
        System.out.println("nombreMasLargo = " + nombreMasLargo);
    }
}
