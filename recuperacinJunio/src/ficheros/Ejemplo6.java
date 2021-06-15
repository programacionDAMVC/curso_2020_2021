package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//leer usando las nuevas clases de nio para leer bytes
public class Ejemplo6 {
    public static void main(String[] args) {
        Path path = Paths.get("ficheros", "fichero1.bin");
        try {
            byte[] bytes = Files.readAllBytes(path);
            for (byte b: bytes) {
                System.out.printf("byte: %d, caracter: %c\n", b, (char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
