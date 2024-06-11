package com.diegocayo.cursojava.paquetes.jardin;

import com.diegocayo.cursojava.paquetes.hogar.Persona;

public class Perro {
    protected String nombre;
    protected String raza;

    String jugar(Persona persona) {
        return persona.lanzarPelota();
    }
}
