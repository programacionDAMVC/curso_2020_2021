public class TipoNumeros {
	
	public static void main (String[] args) {
		
		int numeroEntero    = 12;
		long numeroLong     = 152L;
		float numeroFloat   = 23.3F;
		double numeroDouble = 22e4;
		
		//int sumaInt = numeroEntero + numeroLong;	
		long sumarLong = numeroEntero + numeroLong;
		System.out.println("recogiendo en un long " + sumarLong);
		float sumarFloat = numeroEntero + numeroLong; //no recomendable
		System.out.println("recogiendo en un float " + sumarFloat);
		double sumarDouble = numeroEntero + numeroLong;
		System.out.println("recogiendo en un double " + sumarDouble);
		
	}
}

