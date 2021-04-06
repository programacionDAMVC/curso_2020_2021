/*
PRIMERA CONCLUSIÓN:
Para escribir ficheros de texto se RECOMIENDA
el uso de PrintWriter
 */
package teoria.salidaCaracteres;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ejemplo2 {
    public static void main(String[] args) {
        String[] productos = {"boli", "lápiz", "goma", "cartulina"};
        float[]  precios   = { 1.2f,   0.98f,   0.25f,  0.61f };

        mostrarConsola(productos, precios);

        mostrarEnFichero(productos, precios);

    }

    private static void mostrarEnFichero(String[] productos, float[] precios) {
        File outFile = new File("OUTPUT_FILES/fichero3.txt");
        try (PrintWriter out = new PrintWriter(outFile)) {
            for (int i = 0; i < productos.length; i++) {
                out.printf("%-10s", productos[i]);
            }
            out.println();
            for (int i = 0; i < precios.length; i++) {
                out.printf("%-10.2f", precios[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void mostrarConsola(String[] productos, float[] precios) {
        for (int i = 0; i < productos.length; i++) {
            System.out.printf("%-10s", productos[i]);
        }
        System.out.println();
        for (int i = 0; i < precios.length; i++) {
            System.out.printf("%-10s", precios[i]);
        }
    }
}
