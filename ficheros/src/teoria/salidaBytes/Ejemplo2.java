package teoria.salidaBytes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo2 {
    public static void main(String[] args) {
        String frase = "España";
        byte[] bytes = frase.getBytes();  //ya puedo usar el método write(byte[] arrayBytes)
        //cuando append está a true, se añade al final del fichero
        //tratamiento de excepciones usando Java 7
        try (FileOutputStream out = new FileOutputStream("OUTPUT_FILES/fichero1.txt",true)) {
            out.write(bytes);
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
