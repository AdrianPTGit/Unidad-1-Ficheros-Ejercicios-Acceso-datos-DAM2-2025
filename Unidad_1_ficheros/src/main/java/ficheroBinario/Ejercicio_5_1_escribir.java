package ficheroBinario;

import java.io.*;

public class Ejercicio_5_1_escribir {
    //5.1 Escribimos y leemos un archivo con con DataInputStream y distintos tipos de datos

    public static void main(String[] args) throws IOException {

        DataOutputStream dOutput = new DataOutputStream(new FileOutputStream("fichero1.dat"));

        dOutput.writeInt(100);
        dOutput.writeBoolean(true);
        dOutput.writeUTF("aula");
        dOutput.writeDouble(10.0);

        dOutput.close();


        FileInputStream  fInput = new FileInputStream("fichero1.dat");

        int dato;

        while ((dato=fInput.read())!= -1){

            System.out.print(dato+" ");
        }


    }


}
