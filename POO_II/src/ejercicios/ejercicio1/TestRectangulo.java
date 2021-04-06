package ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(3, 4);
        Rectangulo rectangulo2 = new Rectangulo(4,7);
        new Rectangulo();
        System.out.println(rectangulo1.toString());
        System.out.println(rectangulo2.toString());
        System.out.printf("Nº de rectángulos creados: %d%n", Rectangulo.getNumeroRectangulos());
        //esto no lo  pide el ejercicio
        Rectangulo[] rectangulos = {new Rectangulo(), new Rectangulo(1.2, 2.3),
                    new Rectangulo(5.5, 8.89)};
        for (int i = 0; i < rectangulos.length ; i++) {
            System.out.println(rectangulos[i]);
        }
        System.out.printf("Nº de rectángulos creados: %d%n", Rectangulo.getNumeroRectangulos());
        //usando un bucle foreach, hacemos lo mismo que el bucle fori
        for (Rectangulo rectangulo: rectangulos) {
            System.out.println(rectangulo);
        }
        System.out.printf("Nº de rectángulos creados: %d%n", Rectangulo.getNumeroRectangulos());
        //otra forma de mostrar la colección
        System.out.println(Arrays.toString(rectangulos));
        //esto tampoco
        List<Rectangulo> lista1 = new ArrayList<>();
        lista1.add(new Rectangulo());
        lista1.add((new Rectangulo(5.6, 9.2)));
        for (Rectangulo rectangulo: lista1) {
            System.out.println(rectangulo);
        }
        System.out.printf("Nº de rectángulos creados: %d%n", Rectangulo.getNumeroRectangulos());
        System.out.println(lista1);
        //usando programación funcional
        lista1.forEach(System.out::println);
        List<Rectangulo> lista2 = List.of(new Rectangulo(), new Rectangulo(2.0, 2.0), new Rectangulo());
        lista2.forEach(System.out::println);
        System.out.printf("Nº de rectángulos creados: %d%n", Rectangulo.getNumeroRectangulos());
        System.out.println(rectangulos[0]);
        System.out.println(lista1.get(0));
        System.out.printf("Nº de rectángulos creados: %d%n", Rectangulo.RectanguloAuxiliar.obtenerNumeroRectangulos());

    }
}
