package teoria.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista2 {
    public static void main(String[] args) {
        List<Boolean> booleanList = new ArrayList<>(); //lista vacía para objeto Boolean
        for (int i = 0; i < 25; i++) {
            booleanList.add(true);
        }
        booleanList.add(false);
        booleanList.set(0, false); //primer elemento
        booleanList.set(booleanList.size() - 1, true); //última posición
        //recorremos la lista de forma clásica:
        for (int i = 0; i < booleanList.size(); i++) {
            System.out.println(booleanList.get(i));
        }
        //recorremos la lista con un bucle mejorado
        List<Double> doubleList = List.of(2.6, 3.7, 8.7);  //inmutable
        for (double d: doubleList) {
            System.out.println(d);
        }
        //recorremos con foreach
        List<String> stringList = Arrays.asList("hola", "buenas", "adios");
        System.out.println(stringList);
        //programación funcional
        stringList.forEach(System.out::println);
        stringList.forEach(e -> System.out.print(e));
    }
}
