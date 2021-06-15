package ficheros;
//escribir datos en un fichero, como si fueran bytes

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//escribir ficheros a nivel de byte
public class Ejemplo1 {
    public static void main(String[] args) {
        //definir el descriptor del fichero
        File outFile = new File("ficheros/fichero1.bin");
        //Frase que voy a escribir
        String frase = "Es es una frase para escribir en un fichero\nEsto aparece en otra línea\n";
        //Voy a convertir la frase en bytes
        byte[] bytes = frase.getBytes();
        //Defino el flujo de bytes, es un flujo de salida
        try (FileOutputStream out = new FileOutputStream(outFile,true)) {
            out.write(bytes);
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Creado fichero %s con %d bytes%n", outFile, outFile.length());
    }
}
