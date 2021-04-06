/*
 * Ejercicio 2, leer argumentos del programa
 */


public class Ejercicio2 {
	
	public static void main (String[] args) {
		if ( args.length < 2 ) {
			System.out.println("Faltan argumentos");
			return;
		}
		String nombre   = args[0];
		String apellido = args[1];
		System.out.printf("\"Hola %s %s\"%n", nombre, apellido);
			
	}
}

