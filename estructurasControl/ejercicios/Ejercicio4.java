/*
 * Leer de teclado un número de tres cifras
 */


public class Ejercicio4 {
	
	public static void main (String[] args) {
		if (args.length < 1) {
			System.out.println("Debe haber al menos un argumento");
			System.exit(1);
		}
		String sNumero = args[0];  //llega al menos un argumento
		if (sNumero.length() != 3) {
			System.out.println("No has introducido un nº de tres cifras");
			System.exit(2);
		}
		//TODAVÍA NO SABEMOS HACER ESTO:
		// char cCentena = sNumero.charAt(0);
		// char cDecena  = sNumero.charAt(1);
		// char cUnidad  = sNumero.charAt(2);
		
		//Todavía no somos capaces de controlar que la entrada no sea un número
		
		int iNumero = Integer.parseInt(sNumero); //si entra por ejemplo uno salta una excepción,  no es un número parseable
		// public static int parseInt (String value) 
		
		//algoritmo para descubrir unidades, decenas y centenas 123 1 es centena, 2 es decena y 3 la unidad
		int centena = iNumero / 100; //571 centena 571 / 100 = 5
		int decena  = (iNumero / 10) % 10; //571 (571 / 10) % 10  = 57 % 10 = 7
		int unidad  = iNumero % 10;   
		
		//otro algoritmo menos simple
		//centena igual iNumero / 100
		//decena (iNumero - centena * 100) / 10
		//unidad iNumero - 100 * centena - 10 * decena
		
		System.out.printf("Número %d%nCentena %d%nDecena %d%nUnidad %d%n",
			iNumero, centena, decena, unidad);
	}
}

