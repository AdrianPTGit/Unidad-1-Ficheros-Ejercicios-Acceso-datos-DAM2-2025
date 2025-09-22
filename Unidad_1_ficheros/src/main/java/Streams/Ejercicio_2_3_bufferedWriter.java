package Streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio_2_3_bufferedWriter {
    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fuchero.txt"));
        // Escribo las lineas
        bufferedWriter.write("Primera prueba del bufferedwriter");
        bufferedWriter.newLine();
        bufferedWriter.write("Segunda linea de mi archivo");

// Cierro
        bufferedWriter.close();

    }
}
