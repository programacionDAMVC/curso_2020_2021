package teoria.test;

import teoria.excepciones_propias.NoTrianguloRectanguloException;
import teoria.excepciones_propias.TrianguloRectangulo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestTrianguloRectantulo2 {
    public static void main(String[] args) {
        List<TrianguloRectangulo> listaTR = new ArrayList<>();
        try (Scanner in = new Scanner(new File("FILES/triangulos.txt"))) {
            while (in.hasNextLine()) {
              //  System.out.println(in.nextLine()); //1,1,1
                String linea = in.nextLine();
                String[] tokens = linea.split(",");  // ["1","1","1"]
                int cateto1 = Integer.parseInt(tokens[0]);  // 1
                int cateto2 = Integer.parseInt(tokens[1]);  // 1
                int hipotenusa = Integer.parseInt(tokens[2]);  // 1

                try {
                    listaTR.add(new TrianguloRectangulo(cateto1, cateto2, hipotenusa));
                } catch (NoTrianguloRectanguloException e) {
                    System.out.printf("%s con triangulo %s%n", e.getMessage(), linea);
                }
            }
        } catch (FileNotFoundException  e) {
            System.out.println(e.getMessage());
            return;  //termina el programa
        }
        System.out.println("\nDatos introducidos");
        listaTR.forEach(System.out::println);
    }
}
