package teoria.entradaCaracteres;

import java.io.*;

//Este ejemplo no se debe usar, mejor usar la clase Scanner
public class Ejemplo1 {
    public static void main(String[] args) {
        File inFile = new File("INPUT_FILES/fichero1.txt");
        String linea = "";
        try (BufferedReader in = new BufferedReader(new FileReader(inFile))) {
            while ( (linea = in.readLine()) != null)
                System.out.println(linea);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
