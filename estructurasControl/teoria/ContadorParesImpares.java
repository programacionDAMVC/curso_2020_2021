/*
 * Contador de números pares e impares. Generados aleatoriamente
 */


public class ContadorParesImpares {
	
	public static void main (String[] args) {
		
		int contador = 0, contadorPares = 0, contadorImpares = 0;
		while ( contador <= 99 ) {
			
			contador++;
			int numeroAleatorio = (int) (Math.random() * 100) + 1; //aleatorio de 1-100 inclusive
			if (numeroAleatorio % 2 == 0) {
				contadorPares++; 
				continue; //en este caso no se sale, pero no ejecuta en ESTE PASO las sentencias de abajo
			} 
			
			contadorImpares++;
		}
		System.out.printf("Nº pares %d, nº impares %d%n", contadorPares, contadorImpares);
		
	}
}

