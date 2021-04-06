package ejercicios.ejercicio3;

public interface Estadisticas  {

    int obtenerNumeroValores(); //número de elementos de una colección
    double obtenerValorMinimo(); //valor mı́nimo de una colección
    double obtenerValorMaximo(); //valor máximo de una colección
    double calcularSuma(); //suma de los valores de una colección
    double calcularValorMedio(); //valor medio de de una colección
    double calcularDesviacionTipica(); //desviación tı́pica de de una colección.

    default void mostrarDatos () {
        System.out.printf("Nº de datos del array %d%n", obtenerNumeroValores());
        System.out.printf("Suma de los valores %.2f%n", calcularSuma());
        System.out.printf("Valor medio de los valores %.2f%n", calcularValorMedio());
        System.out.printf("Valor mas grande de los valores %.2f%n", obtenerValorMaximo());
        System.out.printf("Valor mas chico de los valores %.2f%n", obtenerValorMinimo());
        System.out.printf("Desviación típica de los valores %.2f%n", calcularDesviacionTipica());
    }
}
