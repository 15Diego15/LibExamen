package com.diegocayo.prg.tema11.ejercicio06;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class Multimedia {
    private Formato formato;
    private String titulo;
    private String autor;
    private int anyo;

    public Multimedia(Formato formato, String titulo, String autor, int anyo) {
        this.formato = formato;
        this.titulo = titulo;
        this.autor = autor;
        this.anyo = anyo;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "formato=" + formato +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anyo=" + anyo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Multimedia that = (Multimedia) o;
        return titulo.equals(that.titulo) && autor.equals(that.autor);
    }

}
