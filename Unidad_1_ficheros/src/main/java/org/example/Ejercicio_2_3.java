package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio_2_3 {
    public static void main(String[] args) throws IOException {
        //2.3 Crea una clase de Java que cree ‘n’ archivos, nombre1.txt, nombre2.txt,.... nombreN.txt.
        // El contenido de cada archivo contendrá la frase “Este es el fichero nombreN.txt”.

        int numArchivos= 10;

        //por cada archivo
        for (int i = 0; i < 10; i++) {

            //crear archivo
            FileWriter fileWriter = new FileWriter("nombre"+i+".txt");

            //cargar su contenido
            fileWriter.write("archivo"+i);

            //cerrar fichero
            fileWriter.close();
        }




    }
}
