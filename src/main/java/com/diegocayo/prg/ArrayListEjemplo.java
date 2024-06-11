package com.diegocayo.prg;

import com.diegocayo.prg.utils.LibIO;

import java.util.ArrayList;

public class ArrayListEjemplo {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>();
        paises.add("España");
        paises.add("Italia");
        paises.add("Francia");
        paises.add(0,"Portugal");

        System.out.println(paises.isEmpty());

        paises.set(2,"Alemania");

        for (String pais : paises) {
            System.out.println(pais);
        }

        LibIO.buscarElementoString("España", paises);
    }
}