package org.example;

import java.io.File;

public class Ejercicio_1_7 {
    public static void main(String[] args) {
        // 1.7 Dado un directorio muestra el nombre de todos los archivos que contenga, o si está vacío

        // Se crea un objeto File que apunta al directorio llamado "css"
        File dir = new File("css");

        // Verificamos que el objeto exista y que efectivamente sea un directorio
        if (dir.exists() && dir.isDirectory()) {

            // Obtenemos la lista de nombres de archivos/carpetas dentro del directorio
            String[] archivos = dir.list();

            // Comprobamos que la lista no sea nula y tenga al menos un elemento
            if (archivos != null && archivos.length > 0) {
                System.out.println("Archivos del directorio " + dir + ":");

                // Recorremos el array de nombres y los mostramos por pantalla
                for (String nombre : archivos) {
                    System.out.println(nombre);
                }
            } else {
                // Si el array está vacío o nulo → el directorio está vacío
                System.out.println("El directorio está vacío");
            }
        } else {
            // Si el directorio no existe o no es un directorio válido
            System.out.println("El directorio no existe");
        }
    }
}

