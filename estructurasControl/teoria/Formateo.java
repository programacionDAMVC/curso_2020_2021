/*
 * Formateando salida con printf
 */


public class Formateo {
	
	public static void main (String[] args) {
		/*int numeroEntero = 122;
		double numeroDouble = numeroEntero / 3.0;
		System.out.printf("¿El numero %d es par? %B%n", numeroEntero, numeroEntero % 2 == 0);
		System.out.printf("La división de %d entre 3 vale %.3f%n", numeroEntero, numeroDouble);
		int i = 0;
		System.out.printf("Fuera del bucle i vale %d y i < 10 vale %b%n", i, i < 10);
		for (i = 0; i < 10; i++) {
			System.out.printf("Dentro del bucle i vale %d y i < 10 vale %b%n", i, i < 10); 
		}
		System.out.printf("Fuera del bucle i vale %d y i < 10 vale %b%n", i, i < 10);*/
		for (int j = 0; j < 1_000; j+=5) {
			System.out.printf("%010d  -%-10d%+-10d%n", j,j * 5, j * j);
		}
	}
}

