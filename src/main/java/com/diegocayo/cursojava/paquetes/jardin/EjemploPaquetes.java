package com.diegocayo.cursojava.paquetes.jardin;

import com.diegocayo.cursojava.paquetes.hogar.Persona;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Andres");
        persona.setApellido("Guzman");
        System.out.println(persona.getNombre());


        Perro perro = new Perro();
        perro.nombre = "Tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(persona);
        System.out.println("jugando = " + jugando);
    }
}
