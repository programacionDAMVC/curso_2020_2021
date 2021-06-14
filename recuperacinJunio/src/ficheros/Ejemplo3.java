package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//escribir un fichero de texto
public class Ejemplo3 {
    public static void main(String[] args) {
        //definir el descriptor al fichero
        File outFile = new File("ficheros/fichero1.txt");
        String frase = "Es es una frase para escribir en un fichero\nEsto aparece en otra línea\n";
        //definimos el stream de salida
        try (PrintWriter out = new PrintWriter(outFile)) {
            out.printf("%s", frase);
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.printf("Creado fichero %s con %d bytes%n", outFile, outFile.length());

    }
}
