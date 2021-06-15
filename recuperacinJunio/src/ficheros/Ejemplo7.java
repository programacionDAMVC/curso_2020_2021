package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//leer texto con las nuevas clases nio
public class Ejemplo7 {
    public static void main(String[] args) {
        Path path = Paths.get("ficheros", "fichero1.txt");
        List<String> lineas = null;

        {
            try {
                lineas = Files.readAllLines(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < lineas.size(); i++) {
                System.out.printf("Línea %d: %s%n", i, lineas.get(i));
            }
        }
    }

}
