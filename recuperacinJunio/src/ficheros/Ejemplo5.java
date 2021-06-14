package ficheros;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

//escribir en fichero usando las nuevas clase de IO, nio
public class Ejemplo5 {
    public static void main(String[] args) {
        //descriptor
        Path path = Paths.get("ficheros","fichero1.bin");
        //Frase que voy a escribir
        String frase = "Es es una frase para escribir en un fichero\nEsto aparece en otra línea\n";
        //Voy a convertir la frase en bytes
        byte[] bytes = frase.getBytes();
        //usamos la clase Files
        try {
            Files.write(path, bytes, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.writeString(path, frase, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Creado fichero %s con %d bytes%n", path, path.toFile().length());

    }
}
