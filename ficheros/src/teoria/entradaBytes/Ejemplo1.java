package teoria.entradaBytes;

import java.io.*;

public class Ejemplo1 {
    public static void main(String[] args) {
        File inFile = new File("INPUT_FILES/fichero1.txt");
        try (FileInputStream in = new FileInputStream(inFile)) {
            while (in.available() > 0) { //mientras queden bytes por leer
                int byteLeido = in.read();
                System.out.printf("Bytes: %d - Char: %c%n",byteLeido, (char) byteLeido );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
