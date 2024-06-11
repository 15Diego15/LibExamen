package com.diegocayo.cursojava.flujodecontrol;

import javax.swing.*;
import javax.swing.undo.AbstractUndoableEdit;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Brea", "Pato", "Pepa"};

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase("Andres") || nombres[i].equalsIgnoreCase("Pepa"))
                continue;
            System.out.println(i +".- "+ nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingres un nombre, ejemplo \"Pepe\" o \"Maria\":");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }

        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no fue entrado");
        }

    }
}
