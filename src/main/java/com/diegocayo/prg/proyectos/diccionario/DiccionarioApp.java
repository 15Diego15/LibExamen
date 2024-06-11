package com.diegocayo.prg.proyectos.diccionario;

import com.diegocayo.prg.utils.LibPersonal;

import java.util.Scanner;
import java.util.Map;

public class DiccionarioApp {
    private Diccionario diccionario;
    private Scanner lector;

    public DiccionarioApp() {
        diccionario = new Diccionario();
        lector = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = LibPersonal.obtenerOpcion(lector);
            ejecutarOpcion(opcion);
        } while (opcion != 0);
    }

    private void mostrarMenu() {
        System.out.println("1. Añadir Palabra al diccionario");
        System.out.println("2. Consultar palabra diccionario");
        System.out.println("3. Eliminar Palabra del diccionario");
        System.out.println("4. Ver todo el diccionario");
        System.out.println("-------------------------");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    private void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                agregarPalabra();
                break;
            case 2:
                consultarPalabra();
                break;
            case 3:
                eliminarPalabra();
                break;
            case 4:
                verDiccionario();
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    private void agregarPalabra() {
        System.out.print("Introduce la palabra: ");
        String palabra = lector.nextLine();
        System.out.print("Introduce la descripción: ");
        String descripcion = lector.nextLine();
        if (diccionario.agregarPalabra(palabra, descripcion)) {
            System.out.println("Palabra agregada correctamente.");
        } else {
            System.out.println("La palabra ya existe.");
        }
    }

    private void consultarPalabra() {
        System.out.print("Introduce la palabra a consultar: ");
        String palabra = lector.nextLine();
        String descripcion = diccionario.consultarPalabra(palabra);
        if (descripcion != null) {
            System.out.println(palabra + ": " + descripcion);
        } else {
            System.out.println("La palabra no está disponible.");
        }
    }

    private void eliminarPalabra() {
        System.out.print("Introduce la palabra a eliminar: ");
        String palabra = lector.nextLine();
        if (diccionario.eliminarPalabra(palabra)) {
            System.out.println("Palabra eliminada correctamente.");
        } else {
            System.out.println("La palabra no está disponible.");
        }
    }

    private void verDiccionario() {
        if (diccionario.estaVacio()) {
            System.out.println("El diccionario está vacío.");
        } else {
            for (Map.Entry<String, String> entrada : diccionario.verDiccionario()) {
                System.out.println(entrada.getKey() + ": " + entrada.getValue());
            }
        }
    }
}
