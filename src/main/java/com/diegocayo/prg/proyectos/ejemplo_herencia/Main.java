package com.diegocayo.prg.proyectos.ejemplo_herencia;

import com.diegocayo.prg.utils.LibPersonal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Multimedia> multimediaList = new ArrayList<>();
    private static List<Socio> socioList = new ArrayList<>();
    private static List<Alquiler> alquilerList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú:");
            System.out.println("1. Alta de una nueva Película");
            System.out.println("2. Alta de un nuevo Videojuego");
            System.out.println("3. Alta de un nuevo socio");
            System.out.println("4. Alquilar multimedia a socio");
            System.out.println("5. Devolver multimedia");
            System.out.println("6. Listado de todos los objetos multimedia");
            System.out.println("7. Listado de todas las películas ordenadas por título");
            System.out.println("8. Listado de todos los videojuegos ordenados por año");
            System.out.println("9. Listado del histórico de alquileres de un socio ordenados por fecha de alquiler");
            System.out.println("10. Listado de los alquileres actuales de un socio");
            System.out.println("11. Listado de los socios con recargos pendientes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = LibPersonal.obtenerOpcion(scanner);
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    altaNuevaPelicula(scanner);
                    break;
                case 2:
                    altaNuevoVideojuego(scanner);
                    break;
                case 3:
                    altaNuevoSocio(scanner);
                    break;
                case 4:
                    alquilarMultimedia(scanner);
                    break;
                case 5:
                    devolverMultimedia(scanner);
                    break;
                case 6:
                    listarTodosLosObjetosMultimedia();
                    break;
                case 7:
                    listarTodasLasPeliculasOrdenadasPorTitulo();
                    break;
                case 8:
                    listarTodosLosVideojuegosOrdenadosPorAño();
                    break;
                case 9:
                    listarHistoricoDeAlquileresDeUnSocio(scanner);
                    break;
                case 10:
                    listarAlquileresActualesDeUnSocio(scanner);
                    break;
                case 11:
                    listarSociosConRecargosPendientes();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } while (option != 0);

        scanner.close();
    }

    private static void altaNuevaPelicula(Scanner scanner) {
        System.out.print("Ingrese el título de la película: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor de la película: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el formato (CD, DVD, BLU_RAY, ARCHIVO): ");
        Formato formato = Formato.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Ingrese el año de la película: ");
        int año = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Ingrese la duración de la película en minutos: ");
        int duracion = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Ingrese el actor principal de la película: ");
        String actorPrincipal = scanner.nextLine();
        System.out.print("Ingrese la actriz principal de la película: ");
        String actrizPrincipal = scanner.nextLine();

        Pelicula pelicula = new Pelicula(titulo, autor, formato, año, duracion, actorPrincipal, actrizPrincipal);
        multimediaList.add(pelicula);
        System.out.println("Película añadida correctamente.");
    }

    private static void altaNuevoVideojuego(Scanner scanner) {
        System.out.print("Ingrese el título del videojuego: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del videojuego: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el formato (CD, DVD, BLU_RAY, ARCHIVO): ");
        Formato formato = Formato.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Ingrese el año del videojuego: ");
        int año = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Ingrese la plataforma del videojuego: ");
        String plataforma = scanner.nextLine();

        Videojuego videojuego = new Videojuego(titulo, autor, formato, año, plataforma);
        multimediaList.add(videojuego);
        System.out.println("Videojuego añadido correctamente.");
    }

    private static void altaNuevoSocio(Scanner scanner) {
        System.out.print("Ingrese el NIF del socio: ");
        String nif = scanner.nextLine();
        System.out.print("Ingrese el nombre del socio: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la fecha de nacimiento del socio (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
        System.out.print("Ingrese la población del socio: ");
        String poblacion = scanner.nextLine();

        Socio socio = new Socio(nif, nombre, fechaNacimiento, poblacion);
        if (socio.esMayorDeEdad()) {
            socioList.add(socio);
            System.out.println("Socio añadido correctamente.");
        } else {
            System.out.println("El socio debe ser mayor de edad.");
        }
    }

    private static void alquilarMultimedia(Scanner scanner) {
        System.out.print("Ingrese el NIF del socio: ");
        String nif = scanner.nextLine();
        Socio socio = buscarSocioPorNIF(nif);
        if (socio == null) {
            System.out.println("Socio no encontrado.");
            return;
        }
        if (socio.getRecargos() > 0) {
            System.out.println("El socio tiene recargos pendientes y no puede alquilar.");
            return;
        }

        System.out.print("Ingrese el título del multimedia: ");
        String titulo = scanner.nextLine();
        Multimedia multimedia = buscarMultimediaPorTitulo(titulo);
        if (multimedia == null) {
            System.out.println("Multimedia no encontrado.");
            return;
        }

        LocalDate fechaInicio = LocalDate.now();
        Alquiler alquiler = new Alquiler(multimedia, socio, fechaInicio);
        alquilerList.add(alquiler);
        System.out.println("Alquiler realizado correctamente.");
    }

    private static void devolverMultimedia(Scanner scanner) {
        System.out.print("Ingrese el NIF del socio: ");
        String nif = scanner.nextLine();
        Socio socio = buscarSocioPorNIF(nif);
        if (socio == null) {
            System.out.println("Socio no encontrado.");
            return;
        }

        System.out.print("Ingrese el título del multimedia: ");
        String titulo = scanner.nextLine();
        Alquiler alquiler = buscarAlquilerActivo(socio, titulo);
        if (alquiler == null) {
            System.out.println("No se encontró un alquiler activo para ese multimedia y socio.");
            return;
        }

        alquiler.devolver();
        alquilerList.remove(alquiler);
        System.out.println("Devolución realizada correctamente.");
    }

    private static void listarTodosLosObjetosMultimedia() {
        if (multimediaList.isEmpty()) {
            System.out.println("No hay objetos multimedia.");
        } else {
            multimediaList.forEach(System.out::println);
        }
    }

    private static void listarTodasLasPeliculasOrdenadasPorTitulo() {
        multimediaList.stream()
                .filter(m -> m instanceof Pelicula)
                .sorted(Comparator.comparing(Multimedia::getTitulo))
                .forEach(System.out::println);
    }

    private static void listarTodosLosVideojuegosOrdenadosPorAño() {
        multimediaList.stream()
                .filter(m -> m instanceof Videojuego)
                .sorted(Comparator.comparingInt(Multimedia::getAño))
                .forEach(System.out::println);
    }

    private static void listarHistoricoDeAlquileresDeUnSocio(Scanner scanner) {
        System.out.print("Ingrese el NIF del socio: ");
        String nif = scanner.nextLine();
        Socio socio = buscarSocioPorNIF(nif);
        if (socio == null) {
            System.out.println("Socio no encontrado.");
            return;
        }

        alquilerList.stream()
                .filter(a -> a.socio.getNIF().equals(nif))
                .sorted(Comparator.comparing(a -> a.fechaInicio))
                .forEach(System.out::println);
    }

    private static void listarAlquileresActualesDeUnSocio(Scanner scanner) {
        System.out.print("Ingrese el NIF del socio: ");
        String nif = scanner.nextLine();
        Socio socio = buscarSocioPorNIF(nif);
        if (socio == null) {
            System.out.println("Socio no encontrado.");
            return;
        }

        alquilerList.stream()
                .filter(a -> a.socio.getNIF().equals(nif) && a.estaEnPlazo())
                .forEach(System.out::println);
    }

    private static void listarSociosConRecargosPendientes() {
        socioList.stream()
                .filter(s -> s.getRecargos() > 0)
                .forEach(System.out::println);
    }

    private static Socio buscarSocioPorNIF(String nif) {
        return socioList.stream()
                .filter(s -> s.getNIF().equals(nif))
                .findFirst()
                .orElse(null);
    }

    private static Multimedia buscarMultimediaPorTitulo(String titulo) {
        return multimediaList.stream()
                .filter(m -> m.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }

    private static Alquiler buscarAlquilerActivo(Socio socio, String titulo) {
        return alquilerList.stream()
                .filter(a -> a.socio.equals(socio) && a.multimedia.getTitulo().equalsIgnoreCase(titulo) && a.estaEnPlazo())
                .findFirst()
                .orElse(null);
    }
}
