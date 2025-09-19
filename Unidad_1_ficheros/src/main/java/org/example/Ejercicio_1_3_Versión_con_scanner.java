package org.example;

import java.io.File;
import java.util.Scanner;

public class Ejercicio_1_3_Versión_con_scanner {
    public static void main(String[] args) {
        //1.3 Crea un fichero y determina si se ha creado o si ya existía.
        //Con Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del directorio a crear");
        String nombreCatpeta = teclado.nextLine();

        File fichero = new File(nombreCatpeta);

        if (fichero.mkdir()){
            System.out.println("El directorio se ha creado");
        } else {
            System.out.println("El directorio NO se ha creado");
        }

        if(fichero.exists()){
            System.out.println("El direcctoio exixte:");
        }else{
            System.out.println("El directorio NO exixte");
        }
    }
}
