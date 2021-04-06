package ejercicios;

import java.util.Arrays;

public class TestColeccionAleatoria {
    public static void main(String[] args) {
        ColeccionAleatoria coleccionAleatoria = new ColeccionAleatoria();
        System.out.println(Arrays.toString(coleccionAleatoria.getValores()));
        coleccionAleatoria.rellenarAleatoriamente();
        System.out.println(Arrays.toString(coleccionAleatoria.getValores()));
        System.out.printf("Valor medio %.2f%n", coleccionAleatoria.calcularValorMedio());
        System.out.printf("Desviación típica %.2f%n", coleccionAleatoria.calcularDesviacionTipica());
        System.out.printf("Valor máximo %d%n", coleccionAleatoria.devolverValorMaximo());
        System.out.printf("Valor mínimo %d%n", coleccionAleatoria.devolverValorMinimo());
        System.out.println(Arrays.toString(coleccionAleatoria.devolverArrayDePares()));
        System.out.println(Arrays.toString(coleccionAleatoria.devolverArrayOrdenado()));
        System.out.println(Arrays.toString(coleccionAleatoria.getValores()));
    }
}
