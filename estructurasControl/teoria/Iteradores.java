/*  FUNCIONAMIENTO DEL PROGRAMA
 *  Dado un numero, ejemplo 6, calculamos la siguiente suma
 * 1 + 2 + 3 + 4 + 5 + 6
 * ejemplo 3 calculamos 1 + 2 + 3
 * ejemplo 4 calculamos 1 + 2 + 3 + 4
 * ejemplo 0 debe devolver un 0
 * ejemplo -5 :  -5 -4 -3 -2 -1
 */
 
 /* VARIABLES REQUERIDAS Y TIPO
  * variable suma de tipo int y la inicializamos a 0
  * variable contador de tipo int y inicializamos a 1
  * variable numero de tipo int inicializado, depende, en los ejemplos
  * una vez a 6, otra vez a 3 y la última a 4
  */
  
  /*PSEUDOCÓDIGO:
   * definir numero como entero;
   * definir suma como entero;
   * definir contador como entero;
   * 
   * numero     <- 6;
   * suma       <- 0;
   * contador   <- 1;
   * 
   * Mientras contador <= numero hacer
   * 	suma = suma + contador;
   *    contador = contador + 1;
   * Fin Mientras
   * Escribir suma;
   */ 


public class Iteradores {
	
	public static void main (String[] args) {
		
		/*int suma     = 0;
		int contador = 1;
		while ( contador <= numero ) {
			suma += contador;
			contador++;
		}*/
		
		int numero   = -10;  
		int suma = calcularSuma(numero);
		System.out.printf("La suma desde 0 a %d vale %d%n", numero, suma);
		suma = resolverSuma(numero);
		System.out.printf("La suma desde 0 a %d vale %d%n", numero, suma);
		suma = obtenerSuma(numero);
		System.out.printf("La suma desde 0 a %d vale %d%n", numero, suma);
	}
	
	public static int calcularSuma(int numero) {
		boolean negativo = false;  //para número positivos
		if ( numero < 0 ) {
			numero *= -1;  //convertimos a positivo numero
			negativo = true; //para numero negativo
		}
		int suma     = 0;
		int contador = 1;
		while ( contador <= numero ) {
			suma += contador;
			contador++;
		}
		System.out.println("Valor del contador: " + contador);
		if ( negativo ) {
			suma *= -1;  //resultado se devuelve en negativo
		}
		
		return suma;
	}
	
	public static int resolverSuma(int numero) {
		//código usando do while
		if ( numero == 0) {
			return 0;
		}
		int numeroInicial = numero; //variable que conservar el valor de la llamada
		if ( numero < 0 ) {
			numero = -numero;
		}
		int suma     = 0;
		int contador = 1;
		
		do {
			suma += contador;
			contador++;
		} while (contador <= numero);
		
		System.out.println("Valor del contador: " + contador);

		if (numeroInicial < 0) {
			suma = -suma;
		}
		
		return suma;
		
	}
	
	public static int obtenerSuma(int numero) {
		//código con bucle for
		int numeroInicial = numero; //variable que conservar el valor de la llamada
		if ( numero < 0 ) {
			numero = -numero;
		}
		int suma = 0;
		for (int contador = 1; contador <= numero; contador++) {
			suma += contador;
		}
		//System.out.println("Valor del contador: " + contador); no lo veo
		if (numeroInicial < 0) {
			suma = -suma;
		}
		return suma;
	}
}

