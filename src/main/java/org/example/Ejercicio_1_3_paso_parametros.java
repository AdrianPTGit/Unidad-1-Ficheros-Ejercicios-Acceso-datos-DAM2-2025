package org.example;

import java.io.File;
import java.io.IOException;

public class Ejercicio_1_3_paso_parametros {
    public static void main(String[] args) throws IOException {
        //1.3 Crea un fichero y determina si se ha creado o si ya existía.
        //Con Paso de parametros.


        String nombreFichero=args[0];

        File fichero = new File(nombreFichero);

        if(fichero.createNewFile()){
            System.out.println("Fichero: "+ nombreFichero + " creado correctamente.");

        }else{
            System.out.println("Error al crear el fichero: " + nombreFichero);
        }

    }
}
