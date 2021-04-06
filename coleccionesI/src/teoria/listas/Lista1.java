package teoria.listas;

import java.util.*;

public class Lista1 {
    public static void main(String[] args) {
        //no parametrizamos
        ArrayList lista1 = new ArrayList();  //de objetos iguales, los guardo como Object
        lista1.add("hola"); //objeto String
        lista1.add('c');  //lo guarda como Character
        lista1.add(2); //lo guarda como Integer
        //vamos a ver los datos
        System.out.println(lista1);
        String dato1 = (String) lista1.get(0);
        char dato2   = (char) lista1.get(1);
        int dato3 = (int) lista1.get(2);
        System.out.printf("Cadena %s, char %c y entero %d%n", dato1, dato2, dato3);

        //mejora, parametrizando la listas, todos son de la misma clase, permite clases hijas de Object
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("hola");
        listaCadenas.add("buenas");
       // listaCadenas.add(1); no permitido, solo String
        //listaCadenas.add('c'); no permitido, solo String
        System.out.println(listaCadenas);
        listaCadenas.add(0, "bye");
        System.out.println(listaCadenas);
        listaCadenas.set(0, "hello");
        System.out.println(listaCadenas);
        int posicion = 12;
        if (posicion < listaCadenas.size())
            System.out.println(listaCadenas.get(posicion));
        listaCadenas.remove("hello");
        listaCadenas.remove(0);
        System.out.println(listaCadenas);  //solo queda la cadena buenas
        System.out.printf("¿Contiene buenas la lista? %b%n", listaCadenas.contains("buenas"));
        System.out.printf("¿Contiene hello la lista? %b%n", listaCadenas.contains("hello"));
        System.out.printf("Posición de buenas en la lista %d%n", listaCadenas.indexOf("buenas"));
        listaCadenas.add("buenas");
        System.out.printf("Posición de buenas en la lista %d%n", listaCadenas.indexOf("buenas"));
        //ejemplo de  lista de float
        List<Float> listaFloat = new ArrayList<>(); //crea una lista dinámica, se crea inicialmente con cero elemento
        float[] arrayFloat     = new float[12]; //crea una lista estática, no puede cambier el tamaño, y se crea con 12 floats que son todos 0.0
        listaFloat.add(2.2f);
        arrayFloat[11] = 2.2f;
        listaFloat.add(2f);
        listaFloat.add(0, 2.3f);
        System.out.println(listaFloat);
        //inicializando lista con contenido
        List<String> listaInmutableString = List.of("uno", "dos");
        System.out.println(listaInmutableString);
       // listaInmutableString.add("tres"); es inmutable no se puede añadir mas elementos
       // listaInmutableString.remove(0); es inmutable no se puede quitar elementos
        //parecido
        String[] arrayCadenas = {"uno", "dos"};
       // listaInmutableString.set(0, "one");
        System.out.println(listaInmutableString);
        //otra forma de crear listas con valores inciales
        List<String> stringList = Arrays.asList("one", "two");
        System.out.println(stringList);
        //stringList.add("three");
        //stringList.remove(0);
        //INMUTABLES

    }
}
