package com.diegocayo.cursojava.poo;


public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luci", "Martinez");
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setConductor(conductorSubaru);





        Persona pato = new Persona("Pato","Rodriguez");
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0, TipoMotor.DIESEL));
        mazda.setConductor(pato);



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




    }
}
