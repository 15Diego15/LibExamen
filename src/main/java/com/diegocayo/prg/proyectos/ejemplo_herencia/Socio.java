package com.diegocayo.prg.proyectos.ejemplo_herencia;

import java.time.LocalDate;
import java.time.Period;

public class Socio {
    private String NIF;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String poblacion;
    private double recargos;

    public Socio(String NIF, String nombre, LocalDate fechaNacimiento, String poblacion) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.poblacion = poblacion;
        this.recargos = 0;
    }

    public String getNIF() {
        return NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public boolean esMayorDeEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears() >= 18;
    }

    public double getRecargos() {
        return recargos;
    }

    public void añadirRecargo(double cantidad) {
        this.recargos += cantidad;
    }

    public void pagarRecargos() {
        this.recargos = 0;
    }

    @Override
    public String toString() {
        return "NIF: " + NIF + ", Nombre: " + nombre + ", Fecha de Nacimiento: " + fechaNacimiento + ", Población: " + poblacion + ", Recargos: " + recargos;
    }
}
