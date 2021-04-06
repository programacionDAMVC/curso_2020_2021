/*
 El programa dado dos números, lo que haces es lo siguiente
 * paso 10 y 2 y muestra los múltiplos de 2 que van desde 0  a 10
 * 0 2 4 6 8 10
 * paso 10 y 3 muestra los múltiplos de 3
 * 0 3 6 9
 * paso 10 y 4 muestra múltiplos de 4
 * 0 4 8
 * paso 10 y 7 muestra múltiplos de 7
 * 0 7
 */


public class Multiplos {
	
	public static void main (String[] args) {
	    mostrarMultiplosConDoWhile(-10, 10);	
	}
	
	//ejemplo numero va a ser 10, divisor va a ser 2
	//empiezas en 0 y vemos si 0 / 2 tiene de resto 0, si muestro 0
	//sigue       1 y vemos si 1 / 2 tiene de resto 0, no, no muestro nada
	//sigue       2 y vemos si 2 / 2 tiene de resto 0, si muestro 2
	// .........
	//sigue       9 y vemos si 9 / 2 tiene de resto 0, no, no muestro nada
	//sigue      10 y vemos si 10/2  tiene de resto 0, si se muestra el 10
	//terminamos hemos llegado a numero que venía con el valor 10
	//usando while
	public static void mostrarMultiplosConWhile (int numero, int divisor) {
		if (divisor == 0) {  //opción de divisor 0, evitamos división por cero
			System.out.println("ERROR: No buscamos divisores de cero");
		} else {
			int  numeroInicial = numero;//guardamos valor incial 
			if (numero < 0) { //si numero es negativo
				numero *= -1; //trabajamos como si fueran positivos
			}
			System.out.println("Mostrando mútiplos de " + divisor + " desde 0 a " + numeroInicial);
			
			int contador = 0;
			while ( contador <= numero) {
				if (contador % divisor == 0) { //es múltiplo
					if (numeroInicial < 0) {
						System.out.println(-contador + " es múltiplo de " + divisor);
					} else {
						System.out.println(contador + " es múltiplo de " + divisor);
					}
				}
				contador++;
			}
		}
		
	}
	
	//usando for
	public static void mostrarMultiplosConFor (int numero, int divisor) {
		if (divisor == 0) {
			System.out.println("ERROR: No buscamos divisores de cero");
		} else if (numero < 0 ) {
			numero *= -1;
			System.out.println("Mostrando mútiplos de " + divisor + " desde 0 a " + -numero);
			for (int contador = 0; contador <= numero; contador++) {
				if (contador % divisor == 0) {
					System.out.println("-" + contador + " es múltiplo de " + divisor);
				}
			}
		} else {
			System.out.println("Mostrando mútiplos de " + divisor + " desde 0 a " + numero);
			for (int contador = 0; contador <= numero; contador++) {
				if (contador % divisor == 0) {
					System.out.println(contador + " es múltiplo de " + divisor);
				}
			}
		}
	}
	//usando do-while
	public static void mostrarMultiplosConDoWhile (int numero, int divisor) {
		if (divisor == 0) {
			System.out.println("ERROR no buscamos divisores de cero");
			return;
		}
		if (numero > 0) {
			System.out.println("Mostrando mútiplos de " + divisor + " desde 0 a " + numero);
			int contador = 0;
			do {
				if (contador % divisor == 0) {
						System.out.println(contador + " es múltiplo de " + divisor);
				}
				contador++;
			} while (contador <= numero);
			return;
		}
		numero *= -1;
		int contador = 0;
		System.out.println("Mostrando mútiplos de " + divisor + " desde 0 a " + -numero);
		do {
			if (contador % divisor == 0) {
					System.out.println("-" + contador + " es múltiplo de " + divisor);
			}
			contador++;
		} while (contador <= numero);
	}

}

