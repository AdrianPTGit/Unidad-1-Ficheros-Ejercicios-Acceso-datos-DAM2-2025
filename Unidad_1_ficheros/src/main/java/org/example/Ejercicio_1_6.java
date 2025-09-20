package org.example;

import java.io.File;

public class Ejercicio_1_6 {
    public static void main(String[] args) {
        //1.6 Elimina un directorio y determina si
        // se ha eliminado o no (sólo se puede eliminar un directorio si esta vacío)
        File dir = new File("js");
        if (dir.delete()){
            System.out.println("direcctorio eliminado");
        } else if (dir.exists()) {
            System.out.println("El directorio existe");
        } else {
            System.out.println("El directorio no existe");
        }
    }
}
