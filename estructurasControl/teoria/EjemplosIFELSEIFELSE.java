
public class EjemplosIFELSEIFELSE {
	
	public static void main (String[] args) {
		
		int numero = 3_000;
		
		if ( numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0) {
			System.out.println(numero + " nº par y divisible por tres y por cinco");
		} else if ( numero % 2 == 0 && numero % 3 == 0 ) {
			System.out.println(numero + " nº par y divisible por tres");
		} else if ( numero % 2 == 0 ) {
			System.out.println(numero + " nº par");
		} else if ( numero % 3 == 0 && numero % 5 == 0 ) {
			System.out.println(numero + " nº impar divisible por tres y por cinco");
		} else if ( numero % 3 == 0 ) {
			System.out.println(numero + " nº impar divisible por tres");
		} else if ( numero % 5 == 0 ) {
			System.out.println(numero + " nº impar divisible por cinco");
		} else {
			System.out.println(numero + " nº es impar y no divisible por tres ni por cinco");
		}
		
		System.out.println("Fin de programa");

	}
}

