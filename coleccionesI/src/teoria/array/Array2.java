package teoria.array;

public class Array2 {
    public static void main(String[] args) {
        int[][] datos1 = new int[2][2]; //tiene 4 int con valor 0
        System.out.println("Valor 0-0: " + datos1[0][0]);
        System.out.println("Valor 0-1: " + datos1[0][1]);
        System.out.println("Valor 1-0: " + datos1[1][0]);
        System.out.println("Valor 1-1: " + datos1[1][1]);
        datos1[0][1] = 8;
        datos1[1][0] = 7;
        System.out.println();
        System.out.println("Valor 0-0: " + datos1[0][0]);
        System.out.println("Valor 0-1: " + datos1[0][1]);
        System.out.println("Valor 1-0: " + datos1[1][0]);
        System.out.println("Valor 1-1: " + datos1[1][1]);
        String[] arrayUnaDimension = {"uno", "dos"};
        System.out.printf("Valor de datos1.length %d%n", datos1.length); //nº filas
        System.out.printf("Valor de datos1[0].length %d%n", datos1[0].length); //nº columnas fila 0
        System.out.printf("Valor de datos1[1].length %d%n", datos1[1].length); //nº columnas fila 1
        System.out.printf("Tamaño del array %d%n", datos1.length * datos1[0].length); //nº datos, porque es simétrica
        System.out.println("Recorremos el array bidimensional");
        for (int filas = 0; filas < datos1.length; filas++) {
            for (int columnas = 0; columnas < datos1[filas].length; columnas++) {
                System.out.printf("Fila %d columna %d valor %d    ", filas, columnas, datos1[filas][columnas]);
            }
            System.out.println();
        }
        System.out.println();
        //usando un literal
        String[][] datos2 = {
                {"uno", "dos", "tres", "cuatro"},
                {"cinco", "seis", "siete", "ocho"}
        };
        System.out.println("Valor 0-0: " + datos2[0][0]);
        System.out.println("Valor 0-1: " + datos2[0][1]);
        System.out.println("Valor 0-2: " + datos2[0][2]);
        System.out.println("Valor 0-3: " + datos2[0][3]);
        System.out.println("Valor 1-0: " + datos2[1][0]);
        System.out.println("Valor 1-1: " + datos2[1][1]);
        System.out.println("Valor 1-2: " + datos2[1][2]);
        System.out.println("Valor 1-3: " + datos2[1][3]);
        System.out.printf("Valor de datos2.length %d%n", datos2.length); //nº filas
        System.out.printf("Valor de datos2[0].length %d%n", datos2[0].length); //nº columnas fila 0
        System.out.printf("Valor de datos2[1].length %d%n", datos2[1].length); //nº columnas fila 1
        System.out.printf("Tamaño del array %d%n", datos2.length * datos2[0].length);
        for (int filas = 0; filas < datos2.length; filas++) {
            for (int columnas = 0; columnas < datos2[filas].length; columnas++) {
                System.out.printf("%10s", datos2[filas][columnas]);
            }
            System.out.println();
        }
        System.out.println();

        double[][] datos3 = {
                {1.1, 2.2},
                {3.3} ,
                {4.4, 5.5, 6.6}
        };
        System.out.println("Valor 0-0: " + datos3[0][0]);
        System.out.println("Valor 0-1: " + datos3[0][1]);
        System.out.println("Valor 0-2: " + datos3[1][0]);
        System.out.println("Valor 0-3: " + datos3[2][0]);
        System.out.println("Valor 1-0: " + datos3[2][1]);
        System.out.println("Valor 1-1: " + datos3[2][2]);
   //     System.out.println("Valor 1-1: " + datos3[0][2]); no existe
        System.out.printf("Valor de datos3.length %d%n", datos3.length); //nº filas
        System.out.printf("Valor de datos3[0].length %d%n", datos3[0].length); //nº columnas fila 0
        System.out.printf("Valor de datos3[1].length %d%n", datos3[1].length); //nº columnas fila 1
        System.out.printf("Valor de datos3[1].length %d%n", datos3[2].length); //nº columnas fila 2
      //  System.out.printf("Tamaño del array %d%n", datos2.length * datos2[0].length); no vale por la asimetría
        //se puede calcular usando un bucle
        int tamanno = 0;
        for (int i = 0; i < datos3.length; i++) {
            tamanno += datos3[i].length;
        }
        System.out.printf("Tamaño del array %d%n", tamanno);
        for (int filas = 0; filas < datos3.length; filas++) {
            for (int columnas = 0; columnas < datos3[filas].length; columnas++) {
                System.out.printf("%5.2f", datos3[filas][columnas]);
            }
            System.out.println();
        }
    }
}
