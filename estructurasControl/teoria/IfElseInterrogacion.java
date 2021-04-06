/*
 IF-ELSE usando ?
 * 
 */


public class IfElseInterrogacion {
	
	public static void main (String[] args) {
		int numero = 21_112;
		String mensaje = (numero % 2 == 1) ? "impar" : "par";
		System.out.printf("%d es %S%n", numero, mensaje); //%S lo muestra en mayúscula
		System.out.println(mensaje); //pero la variable sigue guardando el dato en minúscula

		
	}
}

