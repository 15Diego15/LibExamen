package com.diegocayo.prg.tema11.ejercicio06;

public class Pelicula extends Multimedia{
    private double duracion;
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(Formato formato, String titulo, String autor, int anyo, double duracion, String actorPrincipal, String actrizPrincipal) {
        super(formato, titulo, autor, anyo);
        this.duracion = duracion;
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public double getDuracion() {
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
        return super.toString() + "duracion=" + duracion +
                ", actorPrincipal='" + actorPrincipal + '\'' +
                ", actrizPrincipal='" + actrizPrincipal;
    }
}
