package teoria.codificiacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Ejemplo2 {
    public static void main(String[] args) {
        File outFile = new File("OUTPUT_FILES/fichero4.txt");
        String frase = "Hola España";
        String charset = "iso-8859-15";
        try (PrintWriter out = new PrintWriter(outFile, charset)) {
            for (int i = 0; i < 10; i++) {
                out.println(frase);
                out.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.printf("Escrito fichero %s con %d bytes%n", outFile, outFile.length());
    }
}
