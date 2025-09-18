package org.example;

import java.io.File;

public class Ejercicio_1_1 {
    public static void main(String[] args) {

        //1.1 Instancia un fichero y determina si existe o no existe. Muestra su nombre, longitud y ruta absoluta

        File archivo1 = new File("ejemplo1.txt");
        if(archivo1.exists()){
            System.out.println("fichero existe");
            System.out.println("Nombre: "+archivo1.getName());
            System.out.println("Tamaño: "+archivo1.length());
            System.out.println("Ruta: " + archivo1.getAbsolutePath());
        } else{
            System.out.println("fichero no existe");
        }
    }

}
