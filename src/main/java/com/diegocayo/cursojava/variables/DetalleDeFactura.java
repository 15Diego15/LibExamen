package com.diegocayo.cursojava.variables;
import java.util.Scanner;
public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la factura:");
        String nombreFactura = lector.nextLine();

        System.out.print("Ingrese el precio del primer producto:");
        Double precioPrimerProducto = lector.nextDouble();

        System.out.print("Ingrese el precio del segundo producto:");
        Double precioSegundoProducto = lector.nextDouble();

        double totalPrecioSinImpuesto = (precioPrimerProducto + precioSegundoProducto);
        double impuesto = totalPrecioSinImpuesto * 0.19;
        double totalPrecioConImpuesto = totalPrecioSinImpuesto + impuesto;

        String precioSinImpuestoStr = Double.toString(totalPrecioSinImpuesto);
        String impuestoStr = Double.toString(impuesto);
        String precioConImpuestoStr = Double.toString(totalPrecioConImpuesto);

        System.out.println("La factura " + nombreFactura + " tiene un total bruto " + precioSinImpuestoStr+ ", con un impuesto de " + impuestoStr + " y el monto después del impuesto es de " + precioConImpuestoStr );
    }
}
