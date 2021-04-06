package teoria.abstractas.figuras;

import java.util.ArrayList;
import java.util.List;

public class TestFiguras {
    public static void main(String[] args) {

        List<Figura> listaFiguras = new ArrayList<>();
        listaFiguras.add(new Cuadrado(1));
        listaFiguras.add(new Rombo(2,Math.PI /6));
        listaFiguras.add(new Rectangulo(2,3));
        listaFiguras.add(new Romboide(2,3,Math.PI /4));
        listaFiguras.add(new Circulo(5));
        listaFiguras.add(new TrapecioIsosceles(10, 5 ,3));
       // listaFiguras.add(new Cuadrilatero(1,1,3,4));
        listaFiguras.add(new Elipse(3,4));
     //   listaFiguras.add(new Figura(NombreFigura.TRIANGULO));

       // listaFiguras.forEach(System.out::println);
        mostrarFiguras(listaFiguras);
        System.out.println("-----------------------------------");
        mostrarFigurasYPerimetros(listaFiguras);
        System.out.println("-----------------------------------");
        mostrarFigurasYAreas(listaFiguras);
    }

    private static void mostrarFigurasYAreas(List<Figura> listaFiguras) {
        for (Figura figura: listaFiguras) {
            System.out.println(figura);
            /*if (figura instanceof Romboide)
                System.out.printf("Área %.2f%n", ((Romboide) figura).calcularArea());
            if (figura instanceof Elipse)
                System.out.printf("Área %.2f%n", ((Elipse) figura).calcularArea());*/
            System.out.printf("Área %.2f%n", figura.calcularArea());
        }
    }

    private static void mostrarFigurasYPerimetros(List<Figura> listaFiguras) {
        for (Figura figura: listaFiguras) {
            System.out.println(figura);
            /*if (figura instanceof Cuadrilatero)
                System.out.printf("Perímetro %d%n", ((Cuadrilatero) figura).calcularPerimetro());
            if (figura instanceof Elipse)
                System.out.printf("Perímetro %.2f%n", ((Elipse) figura).calcularPerimetro());*/
            System.out.printf("Perímetro %.2f%n", figura.calcularPerimetro());
        }
    }

    private static void mostrarFiguras(List<Figura> listaFiguras) {
        listaFiguras.forEach( figura -> System.out.println(figura.toString()));
    }
}
