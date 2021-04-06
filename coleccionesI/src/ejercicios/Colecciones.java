package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Colecciones {
    public static void main(String[] args) {

        final int LONGITUD_ARRAYS = 10;
        final int VALOR_MAXIMO = 100; // del 0 al VALOR EXclusive
        int[] enteros1 = new int[LONGITUD_ARRAYS];
        int[] enteros2 = new int[LONGITUD_ARRAYS];

        //rellenamos con valor aleatorio, usamos la clase Random
        Random random = new Random();
        int numeroRelleno1 = random.nextInt(VALOR_MAXIMO);
        //usamos un bucle para rellenar
        for (int i = 0; i < LONGITUD_ARRAYS; i++) {
            enteros1[i] = numeroRelleno1;
        }
        int numeroRelleno2 = random.nextInt(VALOR_MAXIMO);
        //usamos el método fill de la clase Arrays
        Arrays.fill(enteros2, numeroRelleno2);

        //mostramos datos:
        mostrarDatos(LONGITUD_ARRAYS, enteros1, enteros2);

    }

    private static void mostrarDatos(int LONGITUD_ARRAYS, int[] enteros1, int[] enteros2) {
        for (int i = 0; i < LONGITUD_ARRAYS; i++) {
            System.out.printf("%3d%3d\n", enteros1[i], enteros2[i]);
        }
    }
}
