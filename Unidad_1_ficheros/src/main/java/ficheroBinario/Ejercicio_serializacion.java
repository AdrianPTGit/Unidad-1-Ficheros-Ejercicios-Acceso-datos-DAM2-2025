package ficheroBinario;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ejercicio_serializacion {
    public static void main(String[] args) throws IOException {
        //para leer el fichero se necesita su clase en caso de tener una.
        //crear objeto persona
        Persona p1 = new Persona(7.26,"Adrian",369);
        System.out.println(p1.toString());

        //lo serializo

        ObjectOutputStream oOutput = new ObjectOutputStream(new FileOutputStream("serializacion.data"));
        oOutput.writeObject(p1);

        oOutput.close();


    }
}
