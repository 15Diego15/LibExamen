package com.diegocayo.cursojava.poo;


import java.sql.SQLOutput;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru","Impreza");
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0, TipoMotor.DIESEL));
        Automovil nissan = new Automovil("Nissan","Navara", Color.GRIS,  new Motor(3.0, TipoMotor.DIESEL), new Estanque(50));
        Automovil nissan2 = new Automovil("Nissan","Navara", Color.GRIS, new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));
        Automovil auto = new Automovil();
        nissan2.setColor(Color.AMARILLO);
        Automovil.setColorPatente(Color.AZUL);
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);

        //mazda.setEstanque(new Estanque(50));

        subaru.setTipo(TipoAutomovil.HATCHBACK);
        mazda.setTipo(TipoAutomovil.PICKUP);
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        System.out.println(mazda.calcularConsumo(300, 70));



        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente().getColor());
        System.out.println("kilómetros por litros = " + Automovil.calcularConsumoEstatico(300,60));

        System.out.println("Velocidad maxima carretera " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima ciudad " + Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipoSubaru.getNombre() = " + tipoSubaru.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipoSubaru.getDescripcion());



    }
}
