package com.diegocayo.prg.tema11.ejercicio06;

public enum Formato {
    CD("CD"),
    DVD("DVD"),
    BLURAY("Blu-Ray"),
    ARCHIVO("Archivo");

    private final String formato;

    Formato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return this.formato;
    }
}
