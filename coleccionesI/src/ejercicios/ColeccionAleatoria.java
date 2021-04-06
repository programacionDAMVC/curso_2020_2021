package ejercicios;

import java.util.Arrays;

/**
 * Clase para manipular una colección de números enteros generados aleatoriamente
 * @author manuel molino
 * @version 1.0.0
 */
public class ColeccionAleatoria {

    private static final int LONGITUD_VALORES = 5;
    private static final int VALOR_MAXIMO = 100;
    //Cree un array de de 100 valores de tipo int: ATRIBUTO
    private int[] valores = new int[LONGITUD_VALORES]; //se crea {0,0,0 ....0}  100 valores

    /**
     * getter
     * @return la lista de valores enteros
     */
    public int[] getValores() {
        return valores;
    }

    /**
     * Usando un bucle rellénalo con valores aleatorios comprendidos entre 0 y
     * 100. Usa Math.random() para esto
     */
    public void rellenarAleatoriamente() {
        int valorAleatorio;
        for (int i = 0; i < LONGITUD_VALORES; i++) {
            valorAleatorio = (int) (Math.random() * VALOR_MAXIMO); //entendemos que el 100 no entra
            valores[i] = valorAleatorio;
        }
    }

    /**
     * Crea un metodo que devuelva el valor medio de los datos.
     * @return el valor medio de la lista de valores
     */
    public double calcularValorMedio () {
        int suma = 0;
        for (int apuntador: valores ) {
            suma += apuntador;
        }
        return 1.0 * suma / LONGITUD_VALORES;
    }

    /**
     * método que calcula la desviación típica
     * @return un double con el valor de la desviación típica
     */
    public double calcularDesviacionTipica () {
        double suma = 0;
        for (int valor: valores) {
            suma += Math.pow(valor - calcularValorMedio () , 2);
        }
        return Math.sqrt(suma / LONGITUD_VALORES);
    }

    /**
     * método que devuelve el array ordenado
     * @return una array de int ordenado, se modifica el original
     */
    public int[] devolverArrayOrdenado () {
       Arrays.sort(valores); //devuelve void, no puedo hacer return Arrays.sort(valores) y tiene que devolver int[]
       return valores;
    }

    /**
     * método que devuelve el valor mínimo del array
     * @return un valor entero con el valor mas chico de la colección
     */
    public int devolverValorMinimo () {
        /*devolverArrayOrdenado();
        return valores[0];*/
        /*int[] ordenado = devolverArrayOrdenado();
        return ordenado[0];*/
        // return devolverArrayOrdenado()[0];  { 2, 3 , 0, -2, 8}
        int valorMinimo = Integer.MAX_VALUE;
        for (int valor: valores) {
            if (valor < valorMinimo)
                valorMinimo = valor;
        }
        return valorMinimo;
    }
    /**
     * método que devuelve el valor máximo del array
     * @return un valor entero con el valor mas grande de la colección
     */
    public int devolverValorMaximo () {
        int valorMaximo = Integer.MIN_VALUE;
        for (int valor: valores) {
            if (valor > valorMaximo)
                valorMaximo = valor;
        }
        return valorMaximo;
    }

    /**
     * método que devuelve un array con los valores pares del array original
     * @return array con valores pares del array original
     */
    public int[] devolverArrayDePares() {
        int[] arrayPares = new int[LONGITUD_VALORES];  // { 0, 0, 0, 0, 0}
        int numeroPares = 0;
        for (int valor: valores) {
            if (valor % 2 == 0) {      // { 2, 3 , 0, -2, 8}
                arrayPares[numeroPares] = valor;
                numeroPares++;
            }
        }   //arrayPares  {2, 0, -2, 8 , 0}  tenemos que devolver {2, 0, -2, 8}
        return Arrays.copyOf(arrayPares, numeroPares);
    }



}
