import java.util.Scanner;
/**
 * Clase ejemplo de examen
 * @author Manuel Molino
 * @version 1.0.0
 */
public class Examen {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cadena = sc.nextLine();
		System.out.println("Introduce el número de veces a repetir");
		int veces = sc.nextInt();	
		sc.close();
		mostrarCadenaRepetida(cadena, veces);
		boolean multiplo5 = esMultiploDeCinco(veces);
		System.out.printf("%d ¿es múltiplo de 5? %b%n", veces, multiplo5);
			
	}
	/**Método que repite una cadena las veces que nos diga
	 * @param cadena String a repetir
	 * @param veces int que representa el nº de veces a repetir
	 */
	public static void mostrarCadenaRepetida(String cadena, int veces) {
		int contador = 0;
		while (contador < veces) {
			System.out.printf("%s%n", cadena);
			contador++;
		}
	}
	/**Método que nos dice si un número es múltiplo o no de cinco
	 * @param veces int que representa el nº a analizar
	 * @return verdadero si es múltiplo de 5, falso sino lo es
	 */
	public static boolean esMultiploDeCinco(int veces) {
		return veces % 5 == 0;
	}
}

