package com.diegocayo.prg;

import com.diegocayo.prg.utils.LibIO;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class EjemploLibs {
    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        LocalDate fecha =LibIO.solicitarFechaLocalDate("Indica una tu fecha de nacimiento",formato);
        System.out.println(fecha); //yyyy/MM/dd
    }
}
