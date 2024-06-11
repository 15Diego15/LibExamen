package com.diegocayo.prg.tema7.ejercicio02;

public class Asignatura {
    private String nombre;
    private int codigoNumerico;
    private String curso;

    public Asignatura() {
        this.nombre = "Progración";
        this.codigoNumerico = 1017;
        this.curso = "1";
    }

    @Override
    public String toString() {
        return  "nombre= '" + nombre + '\'' +
                ", codigo= " + codigoNumerico +
                ", curso= '" + curso + '\'' +
                '}';
    }
}
