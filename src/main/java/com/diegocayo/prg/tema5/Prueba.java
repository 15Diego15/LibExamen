package com.diegocayo.prg.tema5;

public class Prueba {

        public static void main(String[] args) {
            int a = 3;
            System.out.println("antes de la llamada: a = " + a);
            funcion(a);
            System.out.println("después de la llamada: a = " + a);
        }
        public static void funcion(int x){
            x = x + 3;
            System.out.println("dentro de la función: a = " + x);
        }
}
