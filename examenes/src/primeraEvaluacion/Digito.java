package primeraEvaluacion;

import java.util.Scanner;
/**Clase digito 
* muestra si el número es par, múltiplo de 3 y 5 a la vez,
* el número de cifras, si es capicúa y muestra sus múltiplos
* @author Manuel Molino
* @version 1.0.0
*/
public class Digito {
    /**
     * @hidden
     * */
    public static void main(String[] args) {
        System.out.println("Introduce un número mayor que 10 y menor que 1000");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();
        if (numero < 10 || numero > 1_000) {
            System.out.printf("El valor %d no es aceptado en el programa%n", numero);
            return;
        }
        System.out.printf("%d ¿es par? %b%n", numero, esPar(numero));
        System.out.printf("%d ¿es múltiplo de 3 y 5? %b%n", numero, esMultiploDe3y5(numero));
        System.out.printf("%d tiene %d cifras%n", numero, obtenerNumeroCifras(numero));
        System.out.printf("%d ¿es capicúa? %b%n", numero, esCapicua(numero));
        mostrarMultiplos(numero);
    }

    /**Método que nos dice si el número es par o no
    * @param numero valor a analizar
    * @return true si el número es par, false si el número es impar
    */
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    /**Método que nos dice si es múltiplo de cinco y tres a la vez número es par o no
    * @param numero valor a analizar
    * @return true si es múltiplo de cinco y tres a la vez, false si no
    */
    public static boolean esMultiploDe3y5(int numero) {
        return numero % 3 == 0 && numero % 5 == 0;
    }
    /**Método que nos devuelve el número de cifras
    * @param numero valor a analizar
    * @return número de cifras que tiene el número
    */
    public static int obtenerNumeroCifras (int numero) {
        if (numero / 10 < 10)  // 10 / 10 = 1 ... 99 /10 = 9
            return 2;   // al pasar a 100 100 /10 = 10
        else if (numero / 100 < 10)
            return 3;  // 100 / 100 = 1  999 / 100 = 9
        else           // al pasar a 1000 / 100 = 10
            return 4;
    }
    /**Método que nos dice si el número es capicúa o no
    * @param numero valor a analizar
    * @return true si el número es capicúa, false si no lo es
    */
    public static boolean esCapicua(int numero) {
        switch (obtenerNumeroCifras(numero)) {
            case 2:
                return numero / 10 == numero % 10;  //22 / 10 = 2  22 % 10 = 2  31 / 10 = 3  31 % 10 = 1
            case 3:
                return numero / 100 == numero % 10;  //202 / 100 = 2  202 % 10 = 2
            default:
                return false;
        }
    }
    /**Método que nos muestra en consola en dos columnas
    * los valores múltiplos del número empezando desde el 1
    * @param numero valor a analizar
    */
    public static void mostrarMultiplos(int numero) {
        System.out.println("MÚLTIPLOS");
        int contadorDeMultiplos = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.printf("%6d", i);
                contadorDeMultiplos++;
                if (contadorDeMultiplos % 2 == 0)
                    System.out.println();
            }

        }
        System.out.println();
    }
            
}

/*Para el caso de pedir el número hasta que sea correcto:
* int numero = 0;
* do {
*        System.out.println("Introduce un número mayor que 10 y menor que 1000");
*        numero = sc.nextInt();
* } while ( numero < 10 || numero > 1_000);
* sc.close();
*/
    
