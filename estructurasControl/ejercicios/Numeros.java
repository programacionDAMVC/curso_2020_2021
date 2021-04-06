/*Ejercicio 1*/

 public class Numeros {
	 
	 //método main que arranca el programa
	 public static void main(String[] args) {
		mostrarNumeros1A10();
		mostrarSerie20a80();
		mostrarSerie100a50 ();
		int numero = 10;
		System.out.printf("La multiplicación de 1 a %d vale %d%n",
				numero, devolverMultiplicacion1aN (numero)); 
		System.out.printf("La suma de los cuadrados de 1 a %d vale %d%n",
				numero, devolverSumaCuadrados1aN (numero)); 
		mostrarParesEImpares(8);
	 }
	 
	//método que muestre en consola los números del 1 al 10.
	public static void mostrarNumeros1A10 () {
		int contador = 1;
		int numero   = 10;
		while ( contador <= numero ) {
			System.out.printf("%-5d", contador);
			contador++;
		}
		System.out.println();
	}
	
	//método muestre en consola la siguiente serie: 20 25 30 35 . . . 70 75 80
	public static void mostrarSerie20a80() {
		int contador = 20;
		int numero   = 80;
		do {
			System.out.printf("%-5d", contador);
			contador += 5;
		} while ( contador <= numero);
		System.out.println();
	}
	
	//método que muestra la siguiente serie: 100 98 96 94 . . . 56 54 52 50
	public static void mostrarSerie100a50 () {
		for (int i = 100; i >= 50 ; i -= 2 )
			System.out.printf("%-5d", i);
		System.out.println();
	}
	
	//método que devuelve la multiplicación de los números enteros del 1 a N
	//ejemplo 6: 1 * 2 * 3 * 4 * 5 * 6
	public static long devolverMultiplicacion1aN (int numero) {
		int contador = 1;
		long multiplicacion = 1;
		while ( contador <= numero) {
			multiplicacion *= contador;
			contador++;
		}
		return multiplicacion;
	}
	
	//método que devuelve la suma de los cuadrados de los N primeros números naturales
	//ejemplo numero : 4, devolver 1 * 1 + 2 * 2 + 3 * 3 + 4 * 4
	public static int devolverSumaCuadrados1aN (int numero) {
		int contador = 1;
		int suma = 0;
		do {
			suma += contador * contador;
			contador++;
		} while (contador <= numero);
		return suma;
	}
	
	//método que muestre en consola independientemente la suma de los pares e impares
	public static void mostrarParesEImpares( int numero ) {
		int sumaPares = 0, sumaImpares = 0;
		for (int i = 0; i <= numero; i++) {
			if ( i % 2 == 0)
				sumaPares += i;
			else
				sumaImpares += i;
		}
		System.out.printf("La suma de los números pares desde el cero a %d vale %d%n", 
				numero, sumaPares);
		System.out.printf("La suma de los números impares desde el cero a %d vale %d%n", 
				numero, sumaImpares);
	}
 }
