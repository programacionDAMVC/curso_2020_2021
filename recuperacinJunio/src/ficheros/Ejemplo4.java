package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

//leemos un fichero de texto, se recomienda Scanner
public class Ejemplo4 {
    public static void main(String[] args) {
        //descriptor al fichero
        File inFile = new File("ficheros/fichero1.txt");
        //stream de entrada
        int numeroLineas = 0, numeroPalabras = 0;
        try (Scanner in = new Scanner(inFile)) {
            while (in.hasNextLine()) {
             //   System.out.println(in.nextLine()); //conocemos el fichero línea a línea
                String linea = in.nextLine();
                String[] tokens = linea.split("\\s+");
              //  System.out.println(Arrays.toString(tokens));
                numeroPalabras += tokens.length;
                numeroLineas++;
            }
            System.out.printf("El fichero tiene %d líneas y %d palabras%n", numeroLineas, numeroPalabras);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
       /* int numeroPalabras = 0;
        try (Scanner in = new Scanner(inFile)) {
            while (in.hasNext()){
                System.out.println(in.next());
                numeroPalabras++;
            }
            System.out.printf("El fichero tiene %d palabras%n", numeroPalabras);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

    }

}
