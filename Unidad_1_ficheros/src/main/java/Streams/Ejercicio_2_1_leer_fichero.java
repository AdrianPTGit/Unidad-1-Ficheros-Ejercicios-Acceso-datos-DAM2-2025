package Streams;

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_2_1_leer_fichero {
    public static void main(String[] args) throws IOException {

        //leer fichero
        String nombreFichero = "fichero.txt";
        FileReader fileReader = new FileReader(nombreFichero);
        int dato;
        while ((dato = fileReader.read()) != -1){

            System.out.print((char)dato + " " + " --> " +dato);
        }

    }
}
