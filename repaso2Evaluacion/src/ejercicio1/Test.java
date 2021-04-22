package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<NumeroNatural> lista1 = new ArrayList<>();

        try (Scanner in = new Scanner(new File("datos/datos1.txt"))) {
            while (in.hasNextLine()) {
                String linea = in.nextLine();
                if (linea.matches("[0-9]+")){
                    int valor = Integer.parseInt(linea);
                    try {
                        NumeroNatural numeroNatural = new NumeroNatural(valor);
                        lista1.add(numeroNatural);
                    } catch (NoNaturalException e) {
                        System.out.printf("%s no es un número natural%n", linea);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Collections.sort(lista1);
        Conjunto conjunto1 = new Conjunto(lista1);
        System.out.println(conjunto1);
        /*Collections.sort(lista1, new Comparator<NumeroNatural>() {
            @Override
            public int compare(NumeroNatural n1, NumeroNatural n2) {
                return n1.getValor() - n2.getValor();
            }
        });*/
        Collections.sort(lista1, (n1, n2) -> n1.getValor() - n2.getValor());
        System.out.println(conjunto1);

    }
}
