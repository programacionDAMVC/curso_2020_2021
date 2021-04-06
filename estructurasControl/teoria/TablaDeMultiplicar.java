/*
 Tablas de  multiplicar del 1 al 10: SALIDA 
 * Tabla de multiplicar del 1
 * 1 x 1 = 1
 * 1 x 2 = 2
 * .......
 * 1 x 10 = 10
 * Tabla de multiplicar del 2
 * 2 x 1 = 2
 * 2 x 2 = 4
 * .......
 * 2 x 10 = 20
 * ......................
 * Tabla de multiplicar del 10
 * 10 x 1 = 10
 * 10 x 2 = 20
 * .......
 * 10 x 10 = 100
 */


public class TablaDeMultiplicar {
	
	public static void main (String[] args) {
		for (int i = 1 ; i < 11 ; i++ ) {
			System.out.print("Tabla de multiplicar del " + i + "\n");
			for (int j = 1; j < 11; j++) {
				System.out.printf("%d x %d = %d%n", i, j ,i * j);
			}
		}
		
	}
}

