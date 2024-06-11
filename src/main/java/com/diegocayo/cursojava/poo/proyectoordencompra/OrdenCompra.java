package com.diegocayo.cursojava.poo.proyectoordencompra;

import com.diegocayo.cursojava.poo.Rueda;

import java.util.Date;

public class OrdenCompra {
    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private static Integer ultimoId;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void addProducto(Producto producto) {
        String fabricante = producto.getFabricante();
        String nombre = producto.getNombre();
        int precio = producto.getPrecio();
    }
}
