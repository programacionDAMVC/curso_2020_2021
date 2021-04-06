package ejercicios;

import java.util.Scanner;

public class TestPalabra {
    public static void main(String[] args) {
        //String contenido = "HOLA";

        /*System.out.println("Introduce una palabra:");
        Scanner sc = new Scanner(System.in);
        String contenido = sc.next();
        sc.close();*/

        if (args.length == 0) {
            System.out.println("No hay palabra");
            return;
        }
        String contenido = args[0];

        Palabra palabra = new Palabra(contenido);
        System.out.printf("%s en mayúscula es %s%n", contenido, palabra.getContenidoMayuscula());
        System.out.printf("%s en minúscula es %s%n", contenido, palabra.getContenidoMinuscula());
        System.out.printf("%s tiene %d letras%n", contenido, palabra.obtenerNumeroLetras());
        char viejo = 'a';
        char nuevo = 'X';
        System.out.printf("%s cambiando %c por %c es %s%n",
                contenido, viejo, nuevo, palabra.reemplazarLetras(viejo, nuevo));
        System.out.printf("%s tiene como primera letra %c%n", contenido, palabra.obtenerPrimeraLetra());
        System.out.printf("%s tiene como última letra en mayúscula %c%n",
                contenido, palabra.obtenerUltimaLetraMayuscula());

    }
}
