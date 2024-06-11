package com.diegocayo.cursojava.poo_herencia.ejerciciocompanyia;

public class Empleado extends Persona{
    private double renumeracion;
    private int empleadoID;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double renumeracion, int empleadoID) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.renumeracion = renumeracion;
        this.empleadoID = empleadoID;
    }

    public double getRenumeracion() {
        return renumeracion;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    public double aumentarRenumeracion(int porcentaje) {
        this.renumeracion += (this.renumeracion*(porcentaje/100));
        return renumeracion;
    }

    @Override
    public String toString() {
        return  "Empleado{" +
                "renumeracion=" + this.getRenumeracion() +
                ", empleadoID=" + empleadoID + super.toString();
    }
}
