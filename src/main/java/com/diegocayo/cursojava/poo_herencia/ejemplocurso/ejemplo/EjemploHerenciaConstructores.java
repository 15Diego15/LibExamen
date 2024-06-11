package com.diegocayo.cursojava.poo_herencia.ejemplocurso.ejemplo;

import com.diegocayo.cursojava.poo_herencia.ejemplocurso.pooherencia.Alumno;
import com.diegocayo.cursojava.poo_herencia.ejemplocurso.pooherencia.AlumnoInternacional;
import com.diegocayo.cursojava.poo_herencia.ejemplocurso.pooherencia.Persona;
import com.diegocayo.cursojava.poo_herencia.ejemplocurso.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo datos del tipo Persona");
        System.out.println("Nombre: "+persona.getNombre()
                + ", Apellido: " + persona.getApellido()
                + ", Edad: " + persona.getEdad()
                + ", Email: " + persona.getEmail());
        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo datos del tipo Alumno");
            System.out.println("Instución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matematias: " + ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Lenguaje: " + ((Alumno) persona).getNotaLenguaje());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo datos del tipo AlumnoInternacional");
                System.out.println("Nota Idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }

            System.out.println(" ======= sobre escritura promedio ======= ");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println(" ====================================== ");

        }

        if (persona instanceof Profesor) {
            System.out.println("Imprimiento datos del tipo Profesor");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println(" ======= sobre escritura saludar ======= ");
        System.out.println(persona.saludar());
        System.out.println(" ====================================== ");

    }
}
