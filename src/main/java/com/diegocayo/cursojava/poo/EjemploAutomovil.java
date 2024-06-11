package com.diegocayo.cursojava.poo;

import java.util.Date;
import java.util.SimpleTimeZone;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Date fecha = new Date();
        Automovil subaru = new Automovil("Subaru","Impreza");
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,motorMazda);
        Automovil nissan = new Automovil("Nissan","Navara", Color.GRIS,
                new Motor(3.0, TipoMotor.DIESEL), new Estanque(50));
        Automovil nissan2 = new Automovil("Nissan","Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));
        Automovil auto = new Automovil();

        System.out.println(auto.equals(fecha));

        subaru.setMotor(motorSubaru);
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);

        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());
        System.out.println("son iguales ? " + (nissan == nissan2));
        System.out.println("son iguales con equals ? " + (nissan.equals(nissan2)));

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(auto.equals(nissan));
        System.out.println(nissan);
        System.out.println(nissan.toString());


        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("kilometros por litro " + subaru.calcularConsumo(300, 0.6f));

        System.out.println("kilometros por litro " + subaru.calcularConsumo(300, 60));

        System.out.println("kilometros por litro" + nissan.calcularConsumo(300,60));

    }
}
