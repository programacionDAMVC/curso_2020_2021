package primeraEvaluacion;

import java.util.Scanner;
/**Clase digito 
* muestra si el número es par, múltiplo de 3 y 5 a la vez,
* el número de cifras, si es capicúa y muestra sus múltiplos
* @author Manuel Molino
* @version 1.0.0
*/
public class Digitos {
    /**@hidden*/
    public static void main(String[] args) {
        System.out.println("Introduce dos números comprendidos entre 100 y -100, no válido el cero");
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        sc.close();

        if (numero1 == 0 || numero2 == 0) {
            System.out.println("El valor 0 no es aceptado en el programa");
            return;
        }
        if (numero1 > 100 || numero1 < -100 || numero2 > 100 || numero2 < -100) {
            System.out.println("Valores no aceptados");
            return;
        }
        if (numero1 < 0) {
            numero1 *= -1;
        }
        if (numero2 < 0) {
            numero2 *= -1;
        }

        System.out.printf("El número mayor de %d y %d es %d%n", numero1, numero2, obtenerNumeroMayor(numero1, numero2));
        System.out.printf("%d y %d ¿son ambos múltiplos de 3? %b%n", numero1, numero2, sonMultiplosDe3(numero1, numero2));
        System.out.printf("El menor número de %d  y %d tiene %d cifras%n", numero1, numero2, calcularNumeroCifrasMenor(numero1, numero2));
        System.out.printf("¿es par el cociente de la división del mayor entre el menor de %d y %d? %b%n",numero1, numero2, esParDivisionDosNumeros(numero1, numero2));
        mostrarMultiplos(numero1, numero2);
    }

    /**Método que nos dice el mayor número introducido
    * @param numero1 primer número
    * @param numero2 primer número
    * @return el mayor número de los dos valores introducidos como parámetros
    */
    public static int obtenerNumeroMayor(int numero1, int numero2) {
        if (numero1 >= numero2)
            return numero1;
        return numero2;
    }
    /**Método que nos dice si es múltiplo de cinco y tres a la vez número es par o no
    * @param numero1 primer número
    * @param numero2 primer número
    * @return true si embos númreros son múltiplos de tres , false si no es alguno de ellos o ninguno
    */
    public static boolean sonMultiplosDe3(int numero1, int numero2) {
        return numero1 % 3 == 0 && numero2 % 3 == 0;
    }
    /**Método que nos devuelve el número de cifras del menor número
    * @param numero1 valor a analizar
    * @param numero2 valor a analizar
    * @return el número de cifras que tiene el número mas pequeño
    */
    public static int calcularNumeroCifrasMenor (int numero1, int numero2) {
        int numero = numero2;
        if (numero1 < numero2)
            numero = numero1;
        if (numero == 100)
            return 3;
        else if (numero > 0 && numero < 10)
            return 1;
        else
            return 2;
    }
    /**Método que nos dice si el cociente del número mas grande entre el mas pequeño es par
    * @param numero1 valor a analizar
    * @param numero2 valor a analizar
    * @return true si la división del mayor número entre el menor número es par
    */
    public static boolean esParDivisionDosNumeros(int numero1, int numero2) {
        if (numero1 > numero2)
            return numero1 / numero2 % 2 == 0;
        if (numero2 > numero1)
            return numero2 / numero1 % 2 == 0;
        return false; //los números son iguales el cociente de la división es 1
    }
    /**Método que nos muestra en consola en dos columnas
    * los  múltiplos comunes de dos números
    * @param numero1 valor a analizar
    * @param numero2 valor a analizar
    */
    public static void mostrarMultiplos(int numero1, int numero2) {
        System.out.println("MÚLTIPLOS COMUNES");
        int numero  = numero1;
        if (numero2 < numero1)
            numero = numero2;
        for (int i = 1; i <= numero ; i++) {
            if (numero1 % i == 0 && numero2 % i == 0) 
                System.out.printf("%5d", i);
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
    
