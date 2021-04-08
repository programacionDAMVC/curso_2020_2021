package teoria.nuevasClases;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        //File inFile = new File("INPUT_FILES/fichero1.txt");
        Path inPath = Paths.get("INPUT_FILES", "fichero1.txt");
        try (Scanner in = new Scanner(inPath)) {
            while (in.hasNextLine())
                System.out.println(in.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
