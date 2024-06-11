package com.diegocayo.prg.proyectos.ejemplo_herencia;

public class Videojuego extends Multimedia {
    private String plataforma;

    public Videojuego(String titulo, String autor, Formato formato, int año, String plataforma) {
        super(titulo, autor, formato, año);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    @Override
    public String toString() {
        return super.toString() + ", Plataforma: " + plataforma;
    }
}
