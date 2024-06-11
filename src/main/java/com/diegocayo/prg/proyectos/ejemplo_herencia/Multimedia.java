package com.diegocayo.prg.proyectos.ejemplo_herencia;

public class Multimedia {
    private String titulo;
    private String autor;
    private Formato formato;
    private int año;

    public Multimedia(String titulo, String autor, Formato formato, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.año = año;
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

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Formato: " + formato + ", Año: " + año;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Multimedia that = (Multimedia) obj;
        return titulo.equals(that.titulo) && autor.equals(that.autor);
    }
}
