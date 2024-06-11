package com.diegocayo.prg.tema11.ejercicio06;

import java.util.HashMap;

public class VideoJuego extends Multimedia{
    private String plataforma;

    public VideoJuego(Formato formato, String titulo, String autor, int anyo, String plataforma) {
        super(formato, titulo, autor, anyo);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    @Override
    public String toString() {
        return super.toString() + "plataforma='" + plataforma;
    }
}
