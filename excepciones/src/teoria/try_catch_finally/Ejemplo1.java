package teoria.try_catch_finally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        String path = "FILES/dni_sin_letra.tx";
        File fileIn = new File(path);
        Scanner in = null;
        try {
            in = new Scanner(fileIn);
            System.out.println("Programa sigue aquí");
        } catch (FileNotFoundException e) {
            System.out.printf("No existe el fichero %s\n", path);
            // e.printStackTrace();
        } finally {
            System.out.println("Cerrando flujos");
            if (in != null)  //tratamiento excepceciones NO declarativas (porqué es una RUNTIMEXCEPTION)
                in.close();
        }
    }
}
