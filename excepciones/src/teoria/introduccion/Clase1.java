package teoria.introduccion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Clase1 {
    public static void main(String[] args)  {
        int numerador = 10;
        int denominador = 0;
        int resultado;
        if (denominador != 0)
             resultado = numerador / denominador;
        if (args.length > 0)
            System.out.println(args[0]);
        double[] array = null;
        if (array != null)
            System.out.println(array.length);
        new Scanner(System.in);
        File file = new File("kjdfkdfjkl");
        try {
            new Scanner(file);
        } catch (FileNotFoundException e) {
            //.err.println(e.getMessage());
            System.err.printf("No existe el fichero %s%n", file.toString());
        }
    }
}
