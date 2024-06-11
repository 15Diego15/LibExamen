package com.diegocayo.prg.tema7.ejercicio03;

import com.diegocayo.prg.utils.LibIO;
import com.diegocayo.prg.utils.Menu;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio03 {
    private Scanner lector;

    public Ejercicio03() {
        lector = new Scanner(System.in);
        int opcion;
        String[] opcionesMenu1 = {"Nuevo Alumno", "Baja de alumno", "Consultas"};
        String[] opcionesMenuConsultas = {"Por grupo", "Por edad", "Por nia", "Por apellidos"};

        do {
            opcion = Menu.mostrarMenuConSalida("Gestión Alumnos",opcionesMenu1,"Salir");
            switch (opcion) {
                case 1:
                    nuevoAlumno();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 0:
                    System.exit(0);
            }
        } while (opcion <= 3 & opcion >=0);

    }

    private void nuevoAlumno() {
        int nia = LibIO.solicitarInt("Indica tu nia", 0,Integer.MAX_VALUE);
        String nombre = LibIO.solicitarString("Introduce tu nombre", 1,30);
        String apellidos = LibIO.solicitarString("Introduce tu apellido", 1, 30);
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = LibIO.solicitarFechaDate("Introduce tu fecha de nacimiento", formatoFecha);
        String grupo = LibIO.solicitarString("Introduce tu grupo", 1, 10);
        String telefono = LibIO.solicitarString("Introduce tu telefono", 0,9);
    }


    String[] opcionesMenu1 = {"Nuevo Alumno", "Baja de alumno", "Consultas"};
    String[] opcionesMenuConsultas = {"Por grupo", "Por edad", "Por nia", "Por apellidos"};

}
