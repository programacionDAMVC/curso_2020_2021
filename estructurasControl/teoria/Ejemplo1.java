public class Ejemplo1 {
	
	public static void main (String[] args) {
		
		int numero1 = 3;
		int numero2 = numero1 * 2;
		boolean esParNumero1 = numero1 % 2 == 0;
		boolean esParNumero2 = numero2 % 2 == 0;
		boolean esImparNumero1 = numero1 % 2 != 0;
		boolean esImparNumero2 = numero2 % 2 != 0;

		System.out.println("¿Es par " + numero1 + "? " + esParNumero1);
		System.out.println("¿Es par " + numero2 + "? " + esParNumero2);
		System.out.println("¿Es impar " + numero1 + "? " + esImparNumero1);
		System.out.println("¿Es impar " + numero2 + "? " + esImparNumero2);

	}
}

