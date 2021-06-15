package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;
import java.util.Scanner;

//copiamos ficheros completos
public class Ejemplo8 {
    public static void main(String[] args) {
        /*File inFile  = new File("ficheros/fichero1Copia.txt");
        File outFile = new File("ficheros/fichero2Copia.txt");
        try (Scanner in = new Scanner(inFile);
             PrintWriter out = new PrintWriter(outFile)) {
            while (in.hasNextLine()) {
                out.println(in.nextLine());
                out.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/


        Path pathOriginal = Paths.get("ficheros", "fichero1.txt");
        Path pathCopiado = Paths.get("ficheros", "fichero1Copia.txt");
        try {
            Files.copy(pathOriginal, pathCopiado, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
