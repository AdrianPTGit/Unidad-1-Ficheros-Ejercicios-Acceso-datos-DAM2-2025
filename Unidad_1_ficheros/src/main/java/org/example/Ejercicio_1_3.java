package org.example;

import java.io.File;
import java.io.IOException;

public class Ejercicio_1_3 {
    public static void main(String[] args) throws IOException {
        //1.3 Crea un fichero y determina si se ha creado o si ya existía.

        File fichero = new File("texto3.txt");
        if(fichero.exists()){
            System.out.println("El fichero ya existe");
        }else{
            System.out.println("El fichero no existe");
        }
        if(fichero.createNewFile()){
            System.out.println("Fichero: " + fichero + " creado correctamente.");
        }



    }
}
