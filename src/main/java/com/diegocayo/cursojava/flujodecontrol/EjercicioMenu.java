package com.diegocayo.cursojava.flujodecontrol;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class EjercicioMenu {

    public static void main(String[] args) {
        int opcionIndice = 0;

       Map<String, Integer> opciones = new HashMap<>();
       opciones.put("Actualizar",1);
       opciones.put("Eliminar",2);
       opciones.put("Crear",3);
       opciones.put("Listar",4);
       opciones.put("Salir",5);

        Object[] opArreglo = opciones.keySet().toArray();

        Object opcion = JOptionPane.showInputDialog(null,
                "Seleccione un Opción",
                "Mantenedor de Productos",
                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

        if (opcion == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
        } else {
            opcionIndice = opciones.get(opcion.toString());

            // aca un if o switch para las distintas opciones.
        }

    }
}