package teoria.nuevasClases;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

//alternativa a Scanner (ficheros de texto)
//alternativa a PrintWriter (escribir ficheros)
public class Ejemplo3 {
    public static void main(String[] args) {
        Path inPath = Paths.get("INPUT_FILES", "fichero1.txt");
        Path outPath = Paths.get("OUTPUT_FILES", "fichero5.txt");

        /*try (Scanner in = new Scanner(inPath)) {
            while (in.hasNextLine())
                System.out.println(in.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        //alternativa a PrintWriter para escribir fichero de texto
        try (BufferedWriter out = Files.newBufferedWriter(outPath);) {
            //Alternativa, usar readAllLines de la clase Files
            List<String> lineas = Files.readAllLines(inPath);

            for (String linea: lineas) {
                out.write(linea.toUpperCase() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
