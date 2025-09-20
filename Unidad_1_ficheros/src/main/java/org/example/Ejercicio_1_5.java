package org.example;

import java.io.File;

public class Ejercicio_1_5 {
    public static void main(String[] args) {
        File fichero = new File("texto.txt");
        if (fichero.delete()){
            System.out.println("fichero eliminado");
        } else if (fichero.exists()) {
            System.out.println("El fichero existe");
        } else {
            System.out.println("El fichero no existe");
        }

    }

}
