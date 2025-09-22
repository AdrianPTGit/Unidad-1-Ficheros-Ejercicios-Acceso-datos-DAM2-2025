package Streams;

import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio_2_2_escribir_fichero {
    public static void main(String[] args) throws IOException {
        //nombre fichero a escribir
        String nombreFichero = "fichero.txt";
        //texto a escribir
        String texto = "Hola mundo \n";
        //instancia el fichero
        FileWriter fileWriter = new FileWriter(nombreFichero, true);
        //escribe el fichero
        fileWriter.write(texto);
        //cierra el fichero
        fileWriter.close();


    }
}
