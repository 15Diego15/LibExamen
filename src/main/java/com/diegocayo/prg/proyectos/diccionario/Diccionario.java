package com.diegocayo.prg.proyectos.diccionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Diccionario {
    private HashMap<String, String> diccionario;

    public Diccionario() {
        diccionario = new HashMap<>();
    }

    public boolean agregarPalabra(String palabra, String descripcion) {
        if (diccionario.containsKey(palabra)) {
            return false;
        } else {
            diccionario.put(palabra, descripcion);
            return true;
        }
    }

    public String consultarPalabra(String palabra) {
        return diccionario.get(palabra);
    }

    public boolean eliminarPalabra(String palabra) {
        if (diccionario.containsKey(palabra)) {
            diccionario.remove(palabra);
            return true;
        } else {
            return false;
        }
    }

    public Set<Map.Entry<String, String>> verDiccionario() {
        return diccionario.entrySet();
    }

    public boolean estaVacio() {
        return diccionario.isEmpty();
    }
}
