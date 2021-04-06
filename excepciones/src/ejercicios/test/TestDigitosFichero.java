package ejercicios.test;

import ejercicios.ejercicio2.Hexadecimal;
import ejercicios.ejercicio2.NoHexadecimalException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDigitosFichero {
    public static void main(String[] args) {
        List<Hexadecimal> hexadecimales = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("FILES/hexadecimal.txt"))){
            while (sc.hasNextLine()){
               String linea = sc.nextLine();
                try {
                    hexadecimales.add(new Hexadecimal(linea));
                } catch (NoHexadecimalException e) {
                    System.err.printf("%s %s%n", linea, e.getMessage());
                    //e.printStackTrace();
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("No existe el fichero");
        }
        System.out.println("#################################");
        System.out.println(hexadecimales);
        System.out.printf("La suma en decimal de los valores vale: %d%n", Hexadecimal.calcularSumaListaValores(hexadecimales) );
    }
}
