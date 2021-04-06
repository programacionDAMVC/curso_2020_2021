package ejercicios.ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nombres {

    public static void main(String[] args) throws FileNotFoundException {
        final List<String> listaNombres = new ArrayList<>();
       // Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(new File("FILES/nombres.txt"));
        /*String nombreLeido = scanner.nextLine();
        listaNombres.add(nombreLeido);*/
        while (scanner.hasNextLine())
            listaNombres.add(scanner.nextLine());
       // System.out.println(listaNombres);
        System.out.printf("Leídas %d cadenas%n", devolverNumeroDeCadenas(listaNombres));
        scanner = new Scanner(System.in);
        System.out.println("Introduce la letra a buscar");
        char letra = scanner.nextLine().charAt(0);
        System.out.printf("Cadenas que empiezan por %c%n%s%n",
                letra , devolverListaDeCadenasQueEmpiezanPorCaracter(letra, listaNombres));
        System.out.printf("Cadenas que no acaban en vocal %s%n",
                devolverListaNombresQueNoAcabanEnVocal(listaNombres));
        System.out.printf("Tamaño de cadena mas chica %d, y tamaño de cadena mas grande %d%n",
                devolverTamannoMaxMinCadenas(listaNombres)[0],
                devolverTamannoMaxMinCadenas(listaNombres)[1]);
        System.out.println("Introduce el nombre a buscar");
        String cadena = scanner.nextLine();
        System.out.printf("¿La lista contiene la cadena %s? %B%n",
                cadena, contieneCadena(cadena, listaNombres));
        System.out.println("Introduce secuencia a buscar");
        String secuencia = scanner.nextLine();
        scanner.close();
        System.out.printf("Lista de cadenas que contiene la secuencia %s%n%s%n",
                secuencia, devolverListaCadenasCharSequence(secuencia, listaNombres));
    }

    public static int devolverNumeroDeCadenas(List<String> listaCadenas){
        return listaCadenas.size();
    }

    public static List<String> devolverListaDeCadenasQueEmpiezanPorCaracter
            (char letra, List<String> listaCadenas) {
        List<String> listaLetra = new ArrayList<>();
        for (String cadena : listaCadenas) {
            if (cadena.toLowerCase().startsWith((letra + "").toLowerCase()))
                listaLetra.add(cadena);
        }
        return listaLetra;
    }
    public static List<String> devolverListaNombresQueNoAcabanEnVocal(List<String> listaCadenas) {
        List<String> listaNOAcabaVocal = new ArrayList<>();
        for (String cadena : listaCadenas) {
            if (cadena.toLowerCase().matches("^.*[^aeiouáéíóú]$"))
                listaNOAcabaVocal.add(cadena);
        }
        return listaNOAcabaVocal;
    }
    //nos devuelva un array con dos valores enteros max y min longitud de cadenas
    public static int[] devolverTamannoMaxMinCadenas (List<String> listaCadenas) {
       // int[] tamannos = new int[2];
        int min = Integer.MAX_VALUE, max = 0;
        for (String cadena: listaCadenas) {
            if (cadena.length() < min)
                min = cadena.length();
            if (cadena.length() > max)
                max = cadena.length();
        }
       // tamannos[0] = min;
       // tamannos[1] = max;
       // return tamannos;
        return new int[] { max, min };
    }
    public static boolean contieneCadena (String cadenaABuscar, List<String> listaCadenas) {
        //return listaCadenas.contains(cadenaABuscar);
        for (String cadena : listaCadenas) {
            if (cadena.equalsIgnoreCase(cadenaABuscar))
                return true;
        }
        return false;
    }

    public static List<String> devolverListaCadenasCharSequence (String secuencia, List<String> listaCadenas) {
       List<String> listaCoincidencias = new ArrayList<>();
        for (String cadena: listaCadenas) {
            if (cadena.toLowerCase().contains(secuencia.toLowerCase()))
                listaCoincidencias.add(cadena);
        }
       return listaCoincidencias;
    }
}
