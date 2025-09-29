package Fichero_Accesoaleatorio;

import ficheroBinario.Persona;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ejercicio_1_escribir {
    public static void main(String[] args) throws FileNotFoundException {

        RandomAccessFile raf = new RandomAccessFile("personas.data","wr");

        ArrayList<Persona> personas = new ArrayList<>();
        //DEJAR HUECO
        personas.add(new Persona(1,"ana",1.4));
        personas.add(new Persona(4,"teo",4.4));
        personas.add(new Persona(6,"lea",6.4));
        personas.add(new Persona(9, "meo",9.4));

        //calculo del tamaño de una persona
        //

        final int PERSONA_SIZE=4+3*2+8; // 4 BYTES ENTERO + 3 CHAR * 2 BYTES + 8 BYTES DOUBLE

        // CUARDAR ELEMENTOS




    }
}
