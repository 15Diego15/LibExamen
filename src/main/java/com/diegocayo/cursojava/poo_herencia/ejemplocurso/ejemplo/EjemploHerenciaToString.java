package com.diegocayo.cursojava.poo_herencia.ejemplocurso.ejemplo;

import com.diegocayo.cursojava.poo_herencia.ejemplocurso.pooherencia.Alumno;
import com.diegocayo.cursojava.poo_herencia.ejemplocurso.pooherencia.AlumnoInternacional;
import com.diegocayo.cursojava.poo_herencia.ejemplocurso.pooherencia.Persona;
import com.diegocayo.cursojava.poo_herencia.ejemplocurso.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        System.out.println("===== Creando la instancia de la clase Alumno =====");
        Alumno alumno = new Alumno("Andres","Guzman",18,"Instituto Nacional");

        alumno.setNotaLenguaje(5.5);
        alumno.setNotaHistoria(6.5);
        alumno.setNotaMatematicas(4.5);
        alumno.setEmail("andres@correo.com");

        System.out.println("===== Creando la instancia de la clase AlumnoInternacional =====");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Peter","Gosling", "Australia");
        alumnoInternacional.setEdad(16);
        alumnoInternacional.setInstitucion("Instituto Nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaLenguaje(6.7);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematicas(7.7);
        alumnoInternacional.setEmail("peter@correo.com");

        System.out.println("===== Creando la instancia de la clase Profesor =====");
        Profesor profesor = new Profesor("Luci","Perez", "Mtematicas");
        profesor.setEdad(33);
        profesor.setEmail("profesor@correo.com");


        System.out.println(" ======= - ======= ");
        imprimir(alumno);
        imprimir(alumnoInternacional);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona) {
        System.out.println(" ======================= ");
        System.out.println(persona);

    }
}
