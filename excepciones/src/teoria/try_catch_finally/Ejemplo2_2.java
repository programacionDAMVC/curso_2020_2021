package teoria.try_catch_finally;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo2_2 {
    public static void main(String[] args) {
        String path = "FILES/dni_sin_letra.tx";
        File fileIn = new File(path);
        try (FileReader in = new FileReader(fileIn)) {
            //resto de código
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error I/O");
        }
    }
}
