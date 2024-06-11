package com.diegocayo.cursojava.poo;


public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);



        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipoSubaru.getNombre() = " + tipo.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo) {
            case CONVERTIBLE:
                System.out.println("El automovil es desportido y descapotable");
                break;
            case COUPE:
                System.out.println("El automovil es pequeño y de dos puertas y tipicamente deportivo");
                break;
            case FURGON:
                System.out.println("El automovil utilitario de transporte, de empresas");
                break;
            case HATCHBACK:
                System.out.println("El automovil mediano compacto, aspecto deportivo");
                break;
            case PICKUP:
                System.out.println("El automovil de doble cabina o camioneta");
                break;
            case SEDAN:
                System.out.println("El automovil mediano");
                break;
            case STATION_WAGON:
                System.out.println("Es un automovil más grande, con maleta grande...");
                break;
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for (TipoAutomovil ta : tipos) {
            System.out.println(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuertas() + ", ");
            System.out.println();
        }

    }
}
