/*
 * ejercicio anterior sin usar argumentos (args) y usamos Scanner
 * 
 */

import java.util.Scanner;

public class Tiempo_1{
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		do {
			System.out.println("Introduce una hora cuyo valor está comprendido entre 0 y 23");
			hora = sc.nextInt();
		} while (hora < 0 || hora > 23);
		
		int minutos;
		do {
			System.out.println("Introduce minutos cuyo valor está comprendido entre 0 y 59");
			minutos = sc.nextInt();
		} while (minutos < 0 || minutos > 59);
		
		int segundos;
		do {
			System.out.println("Introduce segundos cuyo valor está comprendido entre 0 y 59");
			segundos = sc.nextInt();
		} while (segundos < 0 || segundos > 59);
		
		sc.close();  //cierre del scanner
		
		System.out.printf("Hora válida %d:%d:%d%n", hora, minutos, segundos);
	}
}

