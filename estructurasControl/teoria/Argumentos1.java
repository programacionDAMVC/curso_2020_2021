/*
 leer los argumentos de entrada
 */


public class Argumentos1 {
	
	public static void main (String[] args) {
		//número de argumentos 
		System.out.println("Nº de argumentos: " + args.length);
		if (args.length < 2 ) {
			System.out.println("Faltan argumentos");
			System.exit(1); //termina el programa
			//return sale del método que lo contiene, en este caso main, entoces acaba el programa
			//break no vale, error compilación, solo para salir de bucles
		}
		System.out.println("Argumento 0 " + args[0]);
		System.out.println("Argumento 1 " + args[1]);
		

	}
}

