package modelo.ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class AuxiliarFicheros {
    public static boolean escribirLogs(Path path, String log) throws IOException {
        long inicial = path.toFile().length();
        Files.writeString(path, log, StandardOpenOption.APPEND);
        long fin = path.toFile().length();
        return (fin -inicial) != 0;
    }
}
