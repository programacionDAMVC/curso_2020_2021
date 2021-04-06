package ejercicios.Test;

import ejercicios.ejercicio3.ArrayReales;
import ejercicios.ejercicio3.Estadisticas;
import ejercicios.ejercicio3.ListaGenericaNumeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestEjercicio3 {
    public static void main(String[] args) {
        double[] numbers = new Random().doubles(0,350).limit(10).toArray();
        // System.out.println(Arrays.toString(numbers));
        Estadisticas arrayReales = new ArrayReales(numbers);
        System.out.printf("Nº de datos del array %d%n", arrayReales.obtenerNumeroValores());
        System.out.printf("Suma de los valores %.2f%n", arrayReales.calcularSuma());
        System.out.printf("Valor medio de los valores %.2f%n", arrayReales.calcularValorMedio());
        System.out.printf("Valor mas grande de los valores %.2f%n", arrayReales.obtenerValorMaximo());
        System.out.printf("Valor mas chico de los valores %.2f%n", arrayReales.obtenerValorMinimo());
        System.out.printf("Desviación típica de los valores %.2f%n", arrayReales.calcularDesviacionTipica());
        System.out.println("------------------------------------------------");

        arrayReales.mostrarDatos();

        ListaGenericaNumeros<Float> listaFloat = (ListaGenericaNumeros<Float>) List.of(2.2f, 23, 44.4f);
        ListaGenericaNumeros<Long> listaLong = (ListaGenericaNumeros<Long>) List.of(2, 45, 33);
        ListaGenericaNumeros<Integer> listaInteger = (ListaGenericaNumeros<Integer>) List.of(2, 45, 33);



    }
}
