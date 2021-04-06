

public class TipoNumeros1 {
	
	public static void main (String[] args) {
		int numeroEntero    = 12;
		long numeroLong     = 152L;
		float numeroFloat   = 23.3f;
		double numeroDouble = 22e4;
		
		//int sumaInt  = numeroFloat + numeroLong;
		//long sumaLong   = numeroFloat + numeroLong;
		float sumarFloat  = numeroFloat + numeroLong;  //no aconsejable
		System.out.println("sumarFloat: " + sumarFloat);
		double sumarDouble = numeroFloat + numeroLong;
		System.out.println("sumarDouble: " + sumarDouble);

	}
}

