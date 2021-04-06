/*
 * programa número y columnas
 */


import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nº de columnas");
		int numeroColumnas = sc.nextInt();
		System.out.println("Introduce un número inferior a 10.000");
		int numero = sc.nextInt();
                sc.close();
		//int numeroColumnas = 7;
		//int numero = 9_999;
		if ( numero > 9_999) {
			System.out.println("Programa no preparado para algunas cifras");
			return;
		}
		for (int i = 1; i <= numero; i++) {
			System.out.printf("%5d", i);
			if (i % numeroColumnas == 0) {
				System.out.println();
			}
		}
	}
}

