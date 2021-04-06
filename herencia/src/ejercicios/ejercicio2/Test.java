package ejercicios.ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ficheros/datos_figuras.csv"));

        sc.nextLine(); //nos olvidamos de la cabecera del fichero csv
        //mientras existan líneas vamos a leerlas 5,5  7,7.
        Circulo circulo;
        Elipse elipse;
        Set<FiguraCircular> conjuntoFigurasCirculares = new HashSet<>();
        List<FiguraCircular> listaFigurasCirculares = new ArrayList<>();
        while (sc.hasNextLine()){
            //split por ,   de manera que 5,5 queda como [5,5] y 7,7 queda [7,7]
            String[] lineas = sc.nextLine().split(",");
            //System.out.println(Arrays.toString(lineas)); compruebo que creo el array
            //convertir elemento 0 y elemento 1 a double con Double.parseDouble
            double lado1 = Double.parseDouble(lineas[0]);
            double lado2 = Double.parseDouble(lineas[1]);
            //si son iguales los lados creamos un Circulo
            if (lado1 == lado2) {
                circulo = new Circulo(lado1);
                //añadirlo a una lista
                listaFigurasCirculares.add(circulo);
                conjuntoFigurasCirculares.add(circulo);
            }
                //sin son distintos creamos una Elipse
            else {
                elipse = new Elipse(lado1, lado2);
                //añadirlo a una lista
                listaFigurasCirculares.add(elipse);
                conjuntoFigurasCirculares.add(elipse);
            }
         }
        //comprobamos que se ha añadido a la lista correctamente, recorrienda la misma
        //System.out.println(listaFigurasCirculares);
        //listaFigurasCirculares.forEach(System.out::println);
       /*for (FiguraCircular figuraCircular: listaFigurasCirculares) {
           if (figuraCircular instanceof Elipse)
               System.out.println(figuraCircular);
        }*/
        System.out.printf("Figura de área mas grande%n%s%n",
//                obtenerFiguraCircularDeAreaMasGrande(listaFigurasCirculares));
                    obtenerFiguraCircularDeAreaMasGrande(conjuntoFigurasCirculares));

        mostrarInforme(listaFigurasCirculares);
    }
    public static FiguraCircular obtenerFiguraCircularDeAreaMasGrande (Set<FiguraCircular> conjunto) {
 //       public static FiguraCircular obtenerFiguraCircularDeAreaMasGrande (List<FiguraCircular> lista) {

        double areaMasGrande = Double.MIN_VALUE;
        FiguraCircular figuraCircularDeMayorArea = null;
       // for (FiguraCircular figuraCircular: lista) {
        for (FiguraCircular figuraCircular: conjunto) {
            if (figuraCircular.calcularArea() > areaMasGrande) {
                areaMasGrande = figuraCircular.calcularArea();
                figuraCircularDeMayorArea = figuraCircular;
            }
        }
        return figuraCircularDeMayorArea;
    }

    public static void mostrarInforme (List<FiguraCircular> lista) {
        System.out.printf("Nº círculos creados: %d%n", Circulo.numeroCirculos);
        System.out.printf("Nº elípses creadas: %d%n", Elipse.numeroElipses);
        mostrarPerimetros(lista);
    }


    private static void mostrarPerimetros(List<FiguraCircular> lista) {
        double perimetroMasGrandeCirculo = 0, perimetroMasGrandeElipse = 0;
        Circulo circuloPerimetroMasGrande = null;
        Elipse elipsePerimetroMasGrande = null;
        for (FiguraCircular figuraCircular: lista) {
            if (figuraCircular instanceof Circulo) {
                //buscar el circulo de perímetro mas grande
                if (((Circulo) figuraCircular).calcularPerimetro() > perimetroMasGrandeCirculo) {
                    perimetroMasGrandeCirculo = ((Circulo) figuraCircular).calcularPerimetro();
                    circuloPerimetroMasGrande = (Circulo) figuraCircular;
                }
            } else {
                //buscar la elipse de perimetro mas grande
                perimetroMasGrandeElipse = ((Elipse) figuraCircular).calcularPerimetro();
                elipsePerimetroMasGrande = (Elipse) figuraCircular;
            }
        }
        System.out.printf("El círculo de mayor perímetro es: %s%n", circuloPerimetroMasGrande);
        System.out.printf("La elípse de mayor perímetro es: %s%n", elipsePerimetroMasGrande);
    }

}
