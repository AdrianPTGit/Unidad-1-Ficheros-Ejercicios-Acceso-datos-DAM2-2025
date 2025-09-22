package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_2_2 {
    public static void main(String[] args) throws IOException {
        // 2.2 Crea una clase de Java que permita buscar una vocal en un fichero de texto
        // y muestre el número de veces que se repite.
        System.out.println("Que vocal quieres buscar: ");
        Scanner teclado = new Scanner(System.in);
        char buscarLetra  = teclado.next().charAt(0);// Letra que queremos buscar en el fichero
        // Nombre del fichero a leer
        String nombreFichero = "fichero.txt";

        // Creamos un BufferedReader para leer el fichero de manera eficiente
        BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreFichero));

        int datos; // Variable para almacenar el valor Unicode de cada carácter leído

        int contarVocales = 0;  // Contador para la cantidad de veces que aparece la letra

        // Bucle que recorre todo el fichero carácter por carácter
        while ((datos = bufferedReader.read()) != -1) { // read() devuelve -1 al llegar al final del fichero
            // Convertimos el valor leído (int) a char y luego a String
            String textoFichero = String.valueOf((char) datos).toLowerCase();

            // Recorremos la cadena de texto (aunque en este caso siempre es un carácter)
            for (int i = 0; i < textoFichero.length(); i++) {
                // Comparamos el carácter actual con la letra que buscamos
                if (textoFichero.charAt(i) == buscarLetra) {
                    contarVocales++; // Si coincide, incrementamos el contador
                }
            }
        }

        // Mostramos el resultado por pantalla
        System.out.println("La letra: " + buscarLetra + " se repite: " + contarVocales + " veces");
    }
}
