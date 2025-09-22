package org.example;

import java.io.*;

public class Ejercicio_2_1 {
    public static void main(String[] args) throws IOException {
        //2.1 Crea un fichero de texto con algún editor de texto y después realiza una clase de Java que visualice su contenido.
        //El programa recibe el nombre del archivo en tiempo de ejecución por línea de comandos.
        String nombreFichero = args[0];

        int datos;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreFichero));
        while ((datos=bufferedReader.read())!= -1){
            System.out.print((char)datos+"\n");
        }
    bufferedReader.close();
    }
}
