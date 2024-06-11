package com.diegocayo.prg.proyectos.ejemplo_herencia;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
    Multimedia multimedia;
    Socio socio;
    LocalDate fechaInicio;
    private LocalDate fechaFin;
    private static final double PRECIO_BASE = 4.0;
    private static final double DESCUENTO_PELICULA = 1.0;
    private static final double DESCUENTO_VIDEOJUEGO = 1.0;
    private static final double RECARGO_DIA = 2.0;

    public Alquiler(Multimedia multimedia, Socio socio, LocalDate fechaInicio) {
        this.multimedia = multimedia;
        this.socio = socio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaInicio.plusDays(3);
    }

    public double calcularPrecio() {
        double precio = PRECIO_BASE;
        if (multimedia instanceof Pelicula && multimedia.getAño() < 2012) {
            precio -= DESCUENTO_PELICULA;
        } else if (multimedia instanceof Videojuego && multimedia.getAño() < 2010) {
            precio -= DESCUENTO_VIDEOJUEGO;
        }
        return precio;
    }

    public double calcularRecargo() {
        long diasRetraso = ChronoUnit.DAYS.between(fechaFin, LocalDate.now());
        return diasRetraso > 0 ? diasRetraso * RECARGO_DIA : 0;
    }

    public boolean estaEnPlazo() {
        return !LocalDate.now().isAfter(fechaFin);
    }

    public void devolver() {
        if (!estaEnPlazo()) {
            socio.añadirRecargo(calcularRecargo());
        }
    }

    @Override
    public String toString() {
        return "Multimedia: " + multimedia + ", Socio: " + socio + ", Fecha de Inicio: " + fechaInicio + ", Fecha de Fin: " + fechaFin;
    }
}

