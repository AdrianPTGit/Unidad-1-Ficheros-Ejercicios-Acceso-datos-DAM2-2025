package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio_2_5 {
    public static void main(String[] args) throws IOException {
        /*
        2.5 Una clase que dado un archivo .java cambie los tabuladores por 2 espacios (\t es un tabulador)
         */
        //abrir fichero en modo lectura
        FileReader fReader = new FileReader("texto1.txt");

        //abrir fichero en modo escritura
        FileWriter fWriter = new FileWriter("texto3.txt");

        //recorrer fuchero lectura
        int letra=0;

        while ((letra= fReader.read())!=-1){

            System.out.print((char) letra);

            if(letra == 9){

                letra =' ';
                System.out.println("tabulador detectado");

            }
            fWriter.write(letra);
        }
        // cerrar fichero lectura
        fWriter.close();
        //cerrar fichero escritura
        fReader.close();

    }
}
