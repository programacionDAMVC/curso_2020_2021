package ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//leemos un fichero -da igual que sea de texto o no- a nivel de bytes
public class Ejemplo2 {
    public static void main(String[] args) {
        //descriptor al fichero
        File inFile = new File("ficheros/fichero1.bin");
        //flujo entrada
        try (FileInputStream in = new FileInputStream(inFile)) {
            //uso un stringbuilder para almacenar los caracteres
            StringBuilder stringBuilder = new StringBuilder();
            int b = 0;  //nº que va a ir entre 0 y 254
            while ((b = in.read()) != -1) {
                System.out.printf("decimal: %d, caracter: %c%n", b, (char) b);
                stringBuilder.append( (char) b);
            }
            System.out.printf("El contenido del fichero es:%n%n%s", stringBuilder.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
