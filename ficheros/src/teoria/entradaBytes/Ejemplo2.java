package teoria.entradaBytes;

import java.io.*;

public class Ejemplo2 {
    public static void main(String[] args) {
        //Leer fichero correspondiente a la imagen epublica.jpg (inputStream)
        //Volcar los bytes a un fichero de salida copia.jpg (outputStream)

        //Primero crear el fichero de lectura
        File inFile = new File("INPUT_FILES/epublica.jpg");
        //Segundo crear el fichero de salida, QUE SERÍA LA COPIA
        File outFile = new File("OUTPUT_FILES/copia.jpg");
        //Tercero crear el FileInputStream
        int contador = 0;
        try (FileInputStream in = new FileInputStream(inFile);
             FileOutputStream out = new FileOutputStream(outFile)) {
            while (in.available() > 0) {
                int bytes = in.read();
                System.out.println(bytes);
                contador++;
                out.write(bytes);
                out.flush();
            }
            System.out.printf("El fichero tiene %d bytes%n", contador);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
