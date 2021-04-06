/*
 * métodos next y hasNext de la clase Scanner
 */

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una línea");
		String linea = in.nextLine();
		System.out.printf("Línea: %s%n", linea);
		System.out.println("Introduce un int, long, double, float, boolean");
		int numeroInt = in.nextInt();
		long numeroLong = in.nextLong();
		double numeroDouble = in.nextDouble();
		float numeroFloat = in.nextFloat();
		boolean variableBoolean = in.nextBoolean();
		System.out.printf("Entero: %d, long: %d%n", numeroInt, numeroLong);
		System.out.printf("Double: %.3f, float: %.2f%n", numeroDouble, numeroFloat);
		System.out.printf("Boolean: %B%n", variableBoolean);
		System.out.println("Introduce una cadena");
		String cadena = in.next();
                in.close();
		System.out.printf("Cadena: %s%n", cadena);
		

 
	}
}

