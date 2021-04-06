/*
 * Descubrir un número secreto 
 */
public class Secreto {
	
	public static void main (String[] args) {
		//número aleatorio entre 1 y n inclusive ambos
		//varios jugadores 
		int valorMaximo = 2_530;
		int numeroJugadores = 10;
		if (numeroJugadores <= 0 || valorMaximo <= 0) {
			System.out.println("Datos errónes para jugar");
			return; //sale del método
		}
		int numeroADescubrir = (int) (Math.random() * valorMaximo ) + 1;
		System.out.println("Nº a descubrir: " + numeroADescubrir);
		
		for ( int i = 1 ; i <= valorMaximo ; i++ ) {
			int numeroJugador = i % numeroJugadores;
			if ( numeroJugador == 0 ) {
				numeroJugador = numeroJugadores;
			}
			System.out.println("Probando con " + i + " por el jugador " + 
				numeroJugador);
			if ( i == numeroADescubrir) {
				System.out.println("Descubierto el nº " + i + 
					" descubierto por el jugador " + numeroJugador);
				break; //sale del bucle 
			}
			
		}
		System.out.println("Fin de programa");
		
	}
}

