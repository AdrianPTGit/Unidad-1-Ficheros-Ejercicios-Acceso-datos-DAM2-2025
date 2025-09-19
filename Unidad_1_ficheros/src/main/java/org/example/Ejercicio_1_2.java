package org.example;

import java.io.File;

public class Ejercicio_1_2 {
    public static void main(String[] args) {
        //1.2 Instancia un directorio y determina si existe o no existe. Muestra su nombre, longitud y ruta absoluta
        File dir1 = new File("datos");
        long tamanoTotal=0;
        
        if(dir1.exists()){

            System.out.println("El direcctorio: " + dir1 +" existe.");
            System.out.println("Nombre: " + dir1.getName());
            System.out.println("longitud: " + dir1.length());
            System.out.println("Ruta: " + dir1.getAbsolutePath());

        } else if (dir1.isDirectory()) {
            System.out.println(dir1 + " Es Un directorio.");
        }else{
            System.out.println("El direcctorio no existe");
        }
    }
}
