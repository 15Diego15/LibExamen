package com.diegocayo.prg;

import java.util.HashMap;
import java.util.Set;

public class HashMapEjemplo {
    public static void main(String[] args) {

        // Crear el HashMap y agregar algunos elementos
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("Comida", "Cosas que se comen");
        diccionario.put("Mesa", "Mueble para comer");

        // Obtener y mostrar el valor asociado a la clave "Comida"
        System.out.println(diccionario.get("Comida"));

        // Actualizar el valor asociado a la clave "Comida"
        diccionario.put("Comida", "Cosas que se comen mucho");
        System.out.println(diccionario.get("Comida"));


        // Obtener el conjunto de claves del diccionario
        Set<String> claves = diccionario.keySet();

        // Imprimir todas las claves del diccionario
        System.out.println("Claves del diccionario:");
        for (String clave : claves) {
            System.out.println(clave);
        }

        // Eliminar una clave del conjunto y verificar el efecto en el diccionario
        claves.remove("Mesa");
        System.out.println("Claves después de eliminar 'Mesa':");
        for (String clave : claves) {
            System.out.println(clave);
        }

        // Verificar el contenido del diccionario después de la eliminación
        System.out.println("Contenido del diccionario después de eliminar 'Mesa':");
        for (HashMap.Entry<String, String> entrada : diccionario.entrySet()) {
            System.out.println(entrada.getKey() + " = " + entrada.getValue());
        }
    }
}
