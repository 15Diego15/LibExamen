package com.diegocayo.cursojava.poo_herencia.ejemplocurso.ejemplo;

import com.diegocayo.cursojava.poo_herencia.ejemplocurso.pooherencia.Alumno;
import com.diegocayo.cursojava.poo_herencia.ejemplocurso.pooherencia.AlumnoInternacional;
import com.diegocayo.cursojava.poo_herencia.ejemplocurso.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("===== Creando la instancia de la clase Alumno =====");
        Alumno alumno = new Alumno();
        alumno.setNombre("Andres");
        alumno.setApellido("Guzman");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaLenguaje(5.5);
        alumno.setNotaHistoria(6.5);
        alumno.setNotaMatematicas(4.5);

        System.out.println("===== Creando la instancia de la clase AlumnoInternacional =====");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Diego");
        alumnoInternacional.setApellido("Cayo");
        alumnoInternacional.setPais("Australia");
        alumnoInternacional.setEdad(16);
        alumnoInternacional.setInstitucion("Instituto Nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaLenguaje(6.7);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematicas(7.7);

        System.out.println("===== Creando la instancia de la clase Profesor =====");
        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Pérez");
        profesor.setAsignatura("Matemáticas");


        System.out.println(" ======= - ======= ");
        System.out.println(alumno.getNombre()+" " + alumno.getApellido());

        System.out.println(alumnoInternacional.getNombre()
                + " " + alumnoInternacional.getApellido()
                + " " + alumnoInternacional.getInstitucion()
                + " " + alumnoInternacional.getPais());

        System.out.println("Profesor "+ profesor.getAsignatura()
                + ": " + profesor.getNombre()
                + " " + profesor.getApellido());

        Class clase = alumnoInternacional.getClass();
        while(clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija+ " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
