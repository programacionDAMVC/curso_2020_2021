package teoria.array;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] arrayInt = {0, 3, 4, 9, 15, 15};
        System.out.println(arrayInt);
        System.out.println(Arrays.toString(arrayInt));
        double[][] datos3 = {
                {1.1, 2.2},
                {3.3} ,
                {4.4, 5.5, 6.6},
                {7.7, 8.8, 9.9}
        };
        System.out.println(datos3);
        System.out.println(Arrays.toString(datos3));
        for (int i = 0; i < datos3.length; i++) {
            System.out.println(Arrays.toString(datos3[i]));
        }
        System.out.println("Ordenando el array de enteros");
        Arrays.sort(arrayInt);
        System.out.println(Arrays.toString(arrayInt));
        if (arrayInt.length != 0) {
            System.out.printf("Elemento mas chico del array es %d%n", arrayInt[0]);
            System.out.printf("Elemento mas grande del array es %d%n", arrayInt[arrayInt.length - 1]);
        }
        //rellenando un array
        float[] arrayFloat = new float[15];
        Arrays.fill(arrayFloat, 1.1f);
        System.out.println(Arrays.toString(arrayFloat));
        float[] arrayFloatRecortado = Arrays.copyOf(arrayFloat, 10);
        System.out.println(Arrays.toString(arrayFloatRecortado));
        float[] arrayFloatAmpliado = Arrays.copyOf(arrayFloat, 20);
        System.out.println(Arrays.toString(arrayFloatAmpliado));
        //localizando el primer valor
        arrayInt = new int[]{0, 3, 15, 9, 15, 150, 55};
        int indice = Arrays.binarySearch(arrayInt, 3);
        System.out.println(indice);



    }
}
