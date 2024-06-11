package com.diegocayo.cursojava.poo_herencia.ejerciciocompanyia;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Diego", "Cayo","23423","Calle Naranjos");
        System.out.println(persona);


        Empleado empleado = new Empleado("Jose","Alvarez","12345","Calle Olivos",20000, 123);
        System.out.println("Empleado antes de subida de salario");
        System.out.println(empleado);

        System.out.println("Empleado después de aumento de sueldo");
        System.out.println(empleado.aumentarRenumeracion(20));
        System.out.println("-------------------------------");

        Gerente gerente = new Gerente(57000.00, 25, 2000.00, "12.345.678-9", "John", "Roe", "Agustinas 2233");
        gerente.aumentarRemuneracion(15);
        gerente.setPresupuesto(77000.00);
        System.out.println(gerente);

    }
}
