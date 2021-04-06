/*
 Variables las tratamos todas como float, las constantes como double y notación científica 2e-26
 * cinemática:  d = v0 · t + 1/2 · a · t^2  v0 = 23.36  a = 1.111 t = 6 
 * mostramos en consola que la distancia recorrida para una velocidad inicial del 23,36 ...
 * Fuerza gravitatoria:         M1 · M2 
 *                    F =  G · ---------
 *                                 d^2
 * M1 masa de la Tierra, M2 masa de la Luna, d distancia Tierra a la Luna, G constante
 * de gravitación universal
 */


public class Huelga2 {
	
	public static void main (String[] args) {
		//cinemática:  d = v0 · t + 1/2 · a · t^2  v0 = 23.36  a = 1.111 t = 6 
		float velocidadInicial   = 23.36f;
		float aceleracion        = 1.111f;
		float tiempo             = 6.0f;
		float distanciaRecorrida = velocidadInicial * tiempo + 1.0f / 2.0f * aceleracion * tiempo * tiempo;
		System.out.println("Distancia recorrida por un móvil de velocidad inicial " + velocidadInicial + " aceleración " + aceleracion + " durante un tiempo " + tiempo + " vale " + distanciaRecorrida);
		
		//fuerza gravitatoria
		float masaTierra = 5.92e24F;
		float masaLuna   = 7.349e22F;
		float distanciaTierraLuna    = 384_403.0F;
		final double constanteGravitacional = 6.674e-11;
		float fuerzaAtraccionTierraLuna = 
			(float) ( constanteGravitacional * masaTierra * masaLuna / ( distanciaTierraLuna * distanciaTierraLuna ));
		System.out.println("La fuerza de atracción de la Tierra y la Luna vale " + fuerzaAtraccionTierraLuna );
	}
}

