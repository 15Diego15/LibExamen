package com.diegocayo.prg.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * La clase LibIO proporciona métodos de utilidad para solicitar y manipular datos de entrada del usuario.
 */
public class LibIO {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Solicita una cadena de texto al usuario dentro de un rango de longitud específico.
     *
     * @param mensaje        El mensaje que se muestra al usuario.
     * @param longitudMinima La longitud mínima permitida.
     * @param longitudMaxima La longitud máxima permitida.
     * @return La cadena de texto ingresada por el usuario.
     */
    public static String solicitarString(String mensaje, int longitudMinima, int longitudMaxima) {
        String result;
        boolean valido;
        do {
            System.out.println(mensaje);
            result = scanner.nextLine();
            valido = result.length() >= longitudMinima && result.length() <= longitudMaxima;
            if (!valido)
                System.err.printf("La longitud debe estar entre %d y %d \n", longitudMinima, longitudMaxima);
        } while (!valido);
        return result;
    }

    /**
     * Solicita una fecha al usuario y la devuelve como un objeto Date.
     *
     * @param mensaje El mensaje que se muestra al usuario.
     * @param formato El formato de fecha esperado.
     * @return La fecha ingresada por el usuario como un objeto Date.
     */
    public static Date solicitarFechaDate(String mensaje, SimpleDateFormat formato) {
        Date fecha = null;
        boolean valido = false;
        do {
            System.out.println(mensaje);
            String fechaStr = scanner.nextLine();
            try {
                fecha = formato.parse(fechaStr);
            } catch (ParseException e) {
                System.err.println("Error de formato de fecha. Debe coincidir con el formato " + formato.toPattern());
                continue;
            }
            valido = fecha != null;
            if (!valido) {
                System.out.println("El formato de la fecha no es válido");
            }
        } while (!valido);
        return fecha;
    }

    /**
     * Solicita una fecha al usuario y la devuelve como un objeto LocalDate.
     *
     * @param mensaje El mensaje que se muestra al usuario.
     * @param formato El formato de fecha esperado.
     * @return La fecha ingresada por el usuario como un objeto LocalDate.
     */
    public static LocalDate solicitarFechaLocalDate(String mensaje, SimpleDateFormat formato) {
        LocalDate fecha = null;
        boolean valido = false;
        do {
            System.out.println(mensaje);
            String fechaStr = scanner.nextLine();
            try {
                Date utilDate = formato.parse(fechaStr);
                fecha = utilDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            } catch (ParseException e) {
                System.err.println("Error de formato de fecha. Debe coincidir con el formato " + formato.toPattern());
                continue;
            }
            valido = fecha != null;
            if (!valido) {
                System.err.println("La fecha introducida no es válida.");
            }
        } while (!valido);
        return fecha;
    }

    /**
     * Solicita un número decimal al usuario dentro de un rango específico.
     *
     * @param mensaje     El mensaje que se muestra al usuario.
     * @param valorMinimo El valor mínimo permitido.
     * @param valorMaximo El valor máximo permitido.
     * @return El número decimal ingresado por el usuario.
     */
    public static double solicitarDouble(String mensaje, double valorMinimo, double valorMaximo) {
        double result;
        boolean valido;
        do {
            System.out.println(mensaje);
            result = Double.parseDouble(scanner.nextLine());
            valido = result >= valorMinimo && result <= valorMaximo;
            if (!valido)
                System.err.printf("La longitud debe estar entre %f y %f \n", valorMinimo, valorMaximo);
        } while (!valido);
        return result;
    }

    /**
     * Solicita un número entero al usuario dentro de un rango específico.
     *
     * @param mensaje     El mensaje que se muestra al usuario.
     * @param valorMinimo El valor mínimo permitido.
     * @param valorMaximo El valor máximo permitido.
     * @return El número entero ingresado por el usuario.
     */
    public static int solicitarInt(String mensaje, int valorMinimo, int valorMaximo) {
        int result = 0;
        boolean valido;
        do {
            try {
                System.out.println(mensaje);
                result = Integer.parseInt(scanner.nextLine());
                valido = result >= valorMinimo && result <= valorMaximo;
                if (!valido)
                    System.err.printf("El valor debe estar entre %d y %d \n", valorMinimo, valorMaximo);
            } catch (NumberFormatException NFE) {
                System.err.println("Se ha insertado una letra, vuelve a intentarlo.");
                valido = false;
            }
        } while (!valido);
        return result;
    }

    /**
     * Solicita un número decimal de precisión simple al usuario dentro de un rango específico.
     *
     * @param mensaje     El mensaje que se muestra al usuario.
     * @param valorMinimo El valor mínimo permitido.
     * @param valorMaximo El valor máximo permitido.
     * @return El número decimal de precisión simple ingresado por el usuario.
     */
    public static float solicitarFloat(String mensaje, int valorMinimo, int valorMaximo) {
        float result = 0;
        boolean valido;
        do {
            try {
                System.out.println(mensaje);
                result = Float.parseFloat(scanner.nextLine());
                valido = result >= valorMinimo && result <= valorMaximo;
                if (!valido) {
                    System.err.printf("El valor debe estar entre %d y %d \n", valorMinimo, valorMaximo);
                }
            } catch (NumberFormatException NFE) {
                System.out.println("Se ha insertado una letra, vuelve a intentarlo.");
                valido = false;
            }
        } while (!valido);
        return result;
    }

    /**
     * Genera una fecha aleatoria dentro de un rango de años específico.
     *
     * @param anyoMinimo El año mínimo permitido.
     * @param anyoMaximo El año máximo permitido.
     * @return Una fecha aleatoria como un objeto LocalDate.
     */
    public static LocalDate generarFechaAleatoria(int anyoMinimo, int anyoMaximo) {
        Random random = new Random();
        int year = random.nextInt(anyoMinimo, anyoMaximo);
        int month = random.nextInt(12) + 1;
        int day = random.nextInt(LocalDate.of(year, month, 1).lengthOfMonth()) + 1;
        return LocalDate.of(year, month, day);
    }

    /**
     * Formatea una fecha LocalDate en el formato dd/MM/yyyy.
     *
     * @param fecha La fecha a formatear.
     * @return La fecha formateada como una cadena de texto.
     */
    public static String formatearFechaLocaleDate(LocalDate fecha) {
        int day = fecha.getDayOfMonth();
        int month = fecha.getMonthValue();
        int year = fecha.getYear();
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    /**
     * Formatea una fecha Date en el formato dd/MM/yyyy.
     *
     * @param fecha La fecha a formatear.
     * @return La fecha formateada como una cadena de texto.
     */
    public static String formatearFechaDate(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fecha);
    }

    /**
     * Calcula la edad en años a partir de una fecha de nacimiento en formato dd/MM/yyyy.
     *
     * @param fecha La fecha de nacimiento en formato dd/MM/yyyy.
     * @return La edad calculada en años.
     */
    public static int calcularEdad(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fecha, formatter);
        LocalDate fechaActual = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(fechaNac, fechaActual);
    }

    /**
     * Obtiene el año a partir de una fecha en formato dd/MM/yyyy.
     *
     * @param fecha La fecha en formato dd/MM/yyyy.
     * @return El año de la fecha.
     */
    public static int obtenerAnyo(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaLocal = LocalDate.parse(fecha, formatter);
        return fechaLocal.getYear();
    }

    public static void buscarElementoString(String elementoBuscado, List<String> listaBuscar) {
        int pos = listaBuscar.indexOf(elementoBuscado);
        if (pos != -1) {
            System.out.println(elementoBuscado + " en la posición: " + pos);
        } else {
            System.out.println(elementoBuscado + " no se ha encontrado");
        }
    }
}
