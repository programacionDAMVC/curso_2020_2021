package teoria.try_catch_finally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo1_1 {
    public static void main(String[] args) {
        String path = "FILES/dni_sin_letra.txt";
        File fileIn = new File(path);
        try (Scanner in = new Scanner(fileIn);) {
            //resto código
        } catch (FileNotFoundException e) {
            System.out.printf("No existe el fichero %s\n", path);
           // e.printStackTrace();
        }
    }
}
