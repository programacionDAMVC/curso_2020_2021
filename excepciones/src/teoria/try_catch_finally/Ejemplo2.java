package teoria.try_catch_finally;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo2 {
    public static void main(String[] args) {
        String path = "FILES/dni_sin_letra.tx";
        File fileIn = new File(path);
        FileReader in = null;
        try {
            in = new FileReader(path);
            //acciones despues de leer el fichero
        } catch (FileNotFoundException e) {
            System.out.println("manejo de excepciones");
         //   e.printStackTrace();
            //manejo de excepciones
        } finally {
            try {
                if (in !=null )
                    in.close();
            } catch (IOException e) {
         //   } catch (Exception e) {  se atrapa a todas las exception hija, incluida las runtime
                System.out.println("manejo 2 excepciones");
             //   e.printStackTrace();
            }
        }
    }
}
