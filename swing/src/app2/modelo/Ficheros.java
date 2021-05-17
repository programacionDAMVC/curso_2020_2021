package app2.modelo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Ficheros {

    private Path rutaFichero;

    public Path getRutaFichero() {
        return rutaFichero;
    }

    public void setRutaFichero(Path rutaFichero) {
        this.rutaFichero = rutaFichero;
    }

    public String leerTexto () throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> lineas = Files.readAllLines(rutaFichero);
        for (String linea: lineas) {
            stringBuilder.append(linea);
            stringBuilder.append("\n");
        }
        String texto = stringBuilder.toString();
        return texto.substring(0, texto.length() -1); //quita el último \n
    }

    public void escribirEnFichero (String texto) throws IOException {
        Files.writeString(rutaFichero, texto, StandardOpenOption.TRUNCATE_EXISTING);
    }
}
