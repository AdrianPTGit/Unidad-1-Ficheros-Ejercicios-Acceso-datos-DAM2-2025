package org.example;

import java.io.File;

public class Ejercicio_1_4 {
    public static void main(String[] args) {

    //1.4 Crea una carpeta y determina si se ha creado o si ya existía.

        File carpeta = new File("js");
        boolean crearCarpeta = carpeta.mkdir() && carpeta.exists();

        if (crearCarpeta){
            System.out.println("Carpeta creada correctamente");
        }else {
            System.out.println("Error al crear la carpeta \n O la carpeta ya existe");
        }
    }
}
