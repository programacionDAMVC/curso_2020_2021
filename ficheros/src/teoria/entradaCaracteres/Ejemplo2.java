package teoria.entradaCaracteres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Debemos usar clase Scanner, SOLO PARA TEXTO (Caracteres)
public class Ejemplo2 {
    public static void main(String[] args) {
        File inFile = new File("INPUT_FILES/fichero1.txt");
        try (Scanner in = new Scanner(inFile)) {
            while (in.hasNextLine())
                System.out.println(in.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
