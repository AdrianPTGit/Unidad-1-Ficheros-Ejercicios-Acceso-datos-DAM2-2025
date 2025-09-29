package ficheroBinario;

import java.io.*;

public class Ejercicio_5_2_leer {
    public static void main(String[] args) throws IOException {
        DataInputStream dInput = new DataInputStream(new FileInputStream("fichero1.dat"));

        int numero = dInput.readInt();
        boolean b = dInput.readBoolean();
        String palabra = dInput.readUTF();
        double num2 = dInput.readDouble();

        System.out.println(numero+" "+num2+" "+palabra+" "+b);

        dInput.close();
    }
}
