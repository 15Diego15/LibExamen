package com.diegocayo.prg.proyectos.ejemplo_herencia;

public class Pelicula extends Multimedia {
    private int duracion;
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo, String autor, Formato formato, int año, int duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, año);
        this.duracion = duracion;
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        return super.toString() + ", Duración: " + duracion + " minutos, Actor Principal: " + actorPrincipal + ", Actriz Principal: " + actrizPrincipal;
    }
}
