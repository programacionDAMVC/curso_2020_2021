package ejercicios;

import java.util.Scanner;

public class TestMatematicas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número, válido negativos y con decimales");
        double numero = in.nextDouble();
        in.close();
        double raizCuadrada = Matematicas.calcularRaizCuadrada(numero);
        double raizCubica   = Matematicas.calcularRaizCubica(numero);
        long numeroRedondea = Matematicas.redondearAbsNumero(numero);
        long numeroAleatori = Matematicas.generarAleatorio(numero);
        System.out.printf("El número %.2f tiene de raíz cuadrada %.2f, raíz cúbica %.2f, " +
                        "valor redondeado absoluto %d y nº aletorio entre 0 y %d es %d%n",
                numero, raizCuadrada, raizCubica, numeroRedondea, numeroRedondea, numeroAleatori);
    }

}
