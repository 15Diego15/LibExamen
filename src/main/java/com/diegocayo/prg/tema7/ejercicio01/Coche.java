package com.diegocayo.prg.tema7.ejercicio01;

public class Coche {
    private final TipoCoche tipoCoche;
    private final String modelo;
    private String color;
    private boolean pinturaMetalizada;
    private final String matricula;
    private final String anyoFabricacion;
    private boolean modalidadSeguros; //true == todoRiesgo --- false == terceros;

    public Coche(TipoCoche tipoCoche, String modelo, String color, boolean pinturaMetalizada, String matricula, String anyoFabricacion, boolean modalidadSeguros) {
        this.tipoCoche = tipoCoche;
        this.modelo = modelo;
        this.color = color;
        this.pinturaMetalizada = pinturaMetalizada;
        this.matricula = matricula;
        this.anyoFabricacion = anyoFabricacion;
        this.modalidadSeguros = modalidadSeguros;
    }

    public Coche() {
        this.tipoCoche = TipoCoche.DEPORTIVO;
        this.modelo = "Ferrari";
        this.color = "Rojo";
        this.pinturaMetalizada = true;
        this.matricula = "1234ABC";
        this.anyoFabricacion = "2011";
        this.modalidadSeguros = true; //todoRiesgo
    }

    public TipoCoche getTipoCoche() {
        return tipoCoche;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public boolean isPinturaMetalizada() {
        return pinturaMetalizada;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public boolean isModalidadSeguros() {
        return modalidadSeguros;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPinturaMetalizada(boolean pinturaMetalizada) {
        this.pinturaMetalizada = pinturaMetalizada;
    }

    public void setModalidadSeguros(boolean modalidadSeguros) {
        this.modalidadSeguros = modalidadSeguros;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "tipoCoche=" + tipoCoche +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", pinturaMetalizada=" + pinturaMetalizada +
                ", matricula='" + matricula + '\'' +
                ", anyoFabricacion='" + anyoFabricacion + '\'' +
                ", modalidadSeguros=" + modalidadSeguros +
                '}';
    }
}
