package ejercicios.Test;

import ejercicios.ejercicio2.Cuadrado;
import ejercicios.ejercicio2.Hexagono;
import ejercicios.ejercicio2.PoligonoRegular;
import ejercicios.ejercicio2.TrianguloEquilatero;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TestPoligonoRegular {
    //lista para guardar los poligonos regulares
    static  List<PoligonoRegular> poligonoRegularLista = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        leerDatos();
        poligonoRegularLista.forEach(System.out::println);
        Collections.sort(poligonoRegularLista);
        System.out.println("-----------------------------------------------------");
        poligonoRegularLista.forEach(System.out::println);
        System.out.println("-----------------------------------------------------");
        obtenerPoligonosIguales();
        System.out.println("-----------------------------------------------------");
        ordenarListaPorLadoYLongitud();
        poligonoRegularLista.forEach(System.out::println);
        poligonoRegularLista = null;  //ayudas al recolector de basura



    }

    private static void ordenarListaPorLadoYLongitud() {
        Collections.sort(poligonoRegularLista, (p1, p2) -> {
            if (p1.getNumeroLados() != p2.getNumeroLados())
                return p1.getNumeroLados() - p2.getNumeroLados();
            return (int) (p1.getLongitudLado() * 100 - p2.getLongitudLado() * 100);
        });
    }

    private static void obtenerPoligonosIguales() {
        //elegimos una posición de la lista al azar
        int index = new Random().nextInt(poligonoRegularLista.size());
        PoligonoRegular poligonoAzar = poligonoRegularLista.get(index);
        //comprobamos que obtenemos valores al azar:
        /*for (int i = 0; i < 10; i++) {
            int index = new Random().nextInt(poligonoRegularLista.size());
            PoligonoRegular poligonoRegular = poligonoRegularLista.get(index);
            System.out.printf("%d - %s%n", index, poligonoRegular);
        }*/
        int numeroPoligonosIguales = -1;  //para que cuando se encuentre a sí mismo, pase a valor 0
        for (PoligonoRegular poligonoRegular: poligonoRegularLista) {
            if (poligonoRegular.equals(poligonoAzar))
                numeroPoligonosIguales++;
        }
        System.out.printf("Hay %d polígonos iguales a:%n%s%n", numeroPoligonosIguales, poligonoAzar);
    }

    private static void leerDatos() throws FileNotFoundException {
        //abrir el scanner con el fichero figuras.csv
        Scanner in = new Scanner(new File("FILES/figuras.csv"));
        //ignoramos primera línea
        in.nextLine();
        //leemos hasta que acabe el fichero
        while (in.hasNextLine()) {
            //mostramos en consola los datos del fichero   3,6
            //System.out.println(in.nextLine());
            //dividir las líneas 3,6 por el separador ,  Usamos el método split que devuelve Strring[]
            String[] tokens = in.nextLine().split(","); //genera tokens[0] y  tokens[1]
            //guardar en una variable el número de lados y en otra la longitud del lado
            int numeroLados = Integer.parseInt(tokens[0]);
            float longitudLado = Float.parseFloat(tokens[1]);
           // System.out.printf("%d - %.2f%n", numeroLados, longitudLado); comprobación
            //con un switch, en función de numeroLado, creamos un TrianguloEquilatero, Cuadrado o Hexagono y
            //se añade a la lista
            switch (numeroLados){
                case 3:
                    poligonoRegularLista.add(new TrianguloEquilatero(longitudLado));
                    break;
                case 4:
                    poligonoRegularLista.add(new Cuadrado(longitudLado));
                    break;
                case 6:
                    poligonoRegularLista.add(new Hexagono(longitudLado));
                    break;
                default:
                    break;
            }
        }
        in.close();
    }
}
