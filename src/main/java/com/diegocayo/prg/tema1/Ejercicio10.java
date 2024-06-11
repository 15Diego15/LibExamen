package com.diegocayo.prg.tema1;

/*
* 10. Escribe un programa que represente los siguientes tipos enumerados:
a) Meses del año
b) Las notas musicales
c) Las calificaciones de un alumno
* */

public class Ejercicio10 {
    public static void main(String[] args) {
        enum MesesAnyo{ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO};
        enum notasMusicales{DO,RE,MI,FA,SOL,LA,SI};
        enum CalificacionesAlumnos{SUFICIENTE,BIEN,NOTABLE,SOBRESALIENTE}

        System.out.println(MesesAnyo.ENERO);
        System.out.println(notasMusicales.DO);
        System.out.println(CalificacionesAlumnos.NOTABLE);
    }
}