package com.diegocayo.cursojava.arrays;

import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurubja {
    public static void main(String[] args) {


        String[] productos = {"Kingston","Samsumg","Disco duro ssd Samgumg","Asus","Macbook","Chrome","Bicicleta"};
        int total = productos.length;




        sortBurbuja(productos);
        System.out.println("==== usando for ====");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }


        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = 3;
        numeros[3] = 1;

        sortBurbuja(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros = " + numeros[i]);
        }

    }

    public static void sortBurbuja(Object[] arreglo) {
        int total = arreglo.length;
        int contador = 0;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total-1 -i; j++) {
                // < alfabeticamente/ de menor a mayor ----- > inverso al alfabeto/ de mayor a menor
                if (((Comparable) arreglo[j+1]).compareTo(arreglo[j])<0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }

    public static void arregloInverso(String[] arreglo) {
        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }

    }
}
