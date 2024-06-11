package com.diegocayo.prg.tema7.ejercicio01;

public class Principal {
    public static void main(String[] args) {
        Coche coche1 = new Coche();//Valor por defecto;
        Coche coche2 = new Coche(TipoCoche.MINI, "Cooper", "Verde", false, "9876ABC", "2023", false);
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println("Tuneando coches");
        coche2.setColor("Amarillo");
        coche2.setModalidadSeguros(true);
        coche1.setColor("Azul");
        System.out.println(coche1);
        System.out.println(coche2);
    }
}
