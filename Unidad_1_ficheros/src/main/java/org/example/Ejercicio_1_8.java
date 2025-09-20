package org.example;

import java.io.File;

public class Ejercicio_1_8 {
    public static void main(String[] args) {
        // Directorio inicial
        File dir = new File("css");

        if (dir.exists() && dir.isDirectory()) {
            System.out.println("Contenido del directorio " + dir.getPath() + ":");
            listarContenido(dir, ""); // Llamada al método recursivo
        } else {
            System.out.println("El directorio no existe");
        }
    }

    /**
     * Método recursivo para listar archivos y subdirectorios
     *
     * @param carpeta Objeto File que representa el directorio a recorrer
     * @param prefijo Indentación para mostrar jerarquía visual
     */
    public static void listarContenido(File carpeta, String prefijo) {
        File[] archivos = carpeta.listFiles(); // Obtenemos archivos y subdirectorios

        if (archivos != null && archivos.length > 0) {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    // Si es un directorio → mostrar nombre y llamar recursivamente
                    System.out.println(prefijo + "[DIR] " + archivo.getName());
                    listarContenido(archivo, prefijo + "   "); // Más indentación
                } else {
                    // Si es un archivo → mostrar nombre
                    System.out.println(prefijo + archivo.getName());
                }
            }
        } else {
            System.out.println(prefijo + "(vacío)");
        }
    }
}
