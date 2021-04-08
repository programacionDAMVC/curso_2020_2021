package teoria.nuevasClases;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

//copiar un fichero a otro, sin declarar flujos
public class Ejemplo2 {
    public static void main(String[] args) {
        Path inPath  = Paths.get("INPUT_FILES", "epublica.jpg");
        Path outPath = Paths.get("OUTPUT_FILES", "copia1.jpg");
        try {
            Files.copy(inPath, outPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
