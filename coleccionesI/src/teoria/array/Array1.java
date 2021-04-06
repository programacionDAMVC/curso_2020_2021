package teoria.array;

public class Array1 {
    public static void main(String[] args) {

        boolean[] arrayBoolean;  //declaramos la variable como array de boolean
        arrayBoolean = new boolean[5]; //iniciliazamos el array diciendo el TAMAÑO
        System.out.println("Posición 0: " + arrayBoolean[0]); //se inicilizan por el valor por defecto a false
        System.out.println("Posición 3: " + arrayBoolean[3]);
        arrayBoolean[1] = true;
        System.out.println("Posición 1: " + arrayBoolean[1]);
        System.out.println(); //salto de línea
        //en la misma línea declaración e inicialización:
        float[] arrayFloat = new float[4];  //declaramos e iniciliazamos  0.0f, 0.0f, 0.0f, 0.0f
        System.out.println("Posición 2: " + arrayFloat[2]);
        arrayFloat[0] =  2.2f;
        System.out.println("Posición 0: " + arrayFloat[0]);
        System.out.println();
        //en la misma línea declaración e inicialización, pero ahora no con los valores por defecto
        int[] arrayInt = {11, 3, 4, 9, 15};
        System.out.println("Posición 3: " + arrayInt[3]);
        arrayInt[3] = 100;  //cambio el valor de 9 a 6
        System.out.println("Posición 3: " + arrayInt[3]);
        System.out.println();
        //otra forma de hacerlo
        String[] arrayString = new String[]{"hola", "adios", "buenas"};
        System.out.println("Posición 2: " + arrayString[2]);
        System.out.println();
        //Tamaño del array
        System.out.printf("Tamaño del último array %d%n", arrayString.length);
        //mostrar los datos de arrayString usando el bucle for clásico
        for (int i = 0; i < arrayString.length; i++) {
            System.out.printf("Posición %d: %S%n", i, arrayString[i]);
        }
        //Recorremos el arrray arrayInt para calcular el valor medio:
        int suma = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            suma += arrayInt[i];
        }
        double media = 1.0 *  suma / arrayInt.length;
        System.out.printf("El valor medio vale %.2f%n", media);
        System.out.println();
        //usando el bucle for each recorremos el array arrayBoolean
        for (boolean b: arrayBoolean) {
            System.out.printf("%B%n", b);
        }
        //calcular el valor mas pequeño del array
        int valorMasPequenno = Integer.MAX_VALUE;
        for (int numero: arrayInt) {
            if (numero < valorMasPequenno)
                valorMasPequenno = numero;
        }
        System.out.printf("El valor mas pequeño del array es %d%n", valorMasPequenno);
        // VALOR MAS GRANDE
        int valorMasGrande = Integer.MIN_VALUE;
        for (int numero: arrayInt) {
            if (numero > valorMasGrande)
                valorMasGrande = numero;
        }
        System.out.printf("El valor mas grande del array es %d%n", valorMasGrande);
        //de otra manera NO TENGO QUE RECORRER EL ARRAY DOS VECES
      //  arrayInt = new int[]{15, 3, 6, 5, 11};
        valorMasPequenno = Integer.MAX_VALUE;
        valorMasGrande = Integer.MIN_VALUE;
        for (int numero: arrayInt) {
            if (numero < valorMasPequenno)
                valorMasPequenno = numero;
            if (numero > valorMasGrande)
                valorMasGrande = numero;
        }
        System.out.printf("El valor mas pequeño del array es %d%n", valorMasPequenno);
        System.out.printf("El valor mas grande del array es %d%n", valorMasGrande);

    }
}
