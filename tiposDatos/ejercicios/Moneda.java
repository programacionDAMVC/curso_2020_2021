
public class Moneda {
	
	static final double UN_EURO_A_DOLAR = 1.18; 
	static final double UN_DOLAR_A_EURO = 0.85; 
	
	public static void main (String[] args) {
		//DE EUROS A DOLARES
		double cantidadEuros  = 12.25;
		double valorEnDolares = cantidadEuros * UN_EURO_A_DOLAR;
		System.out.println(cantidadEuros + "€ son " + valorEnDolares + '\u0024');
		
		cantidadEuros = 100;
		valorEnDolares = cantidadEuros * UN_EURO_A_DOLAR;
		System.out.println(cantidadEuros + "€ son " + valorEnDolares + '\u0024');
		
		cantidadEuros = 71.2;
		valorEnDolares = cantidadEuros * UN_EURO_A_DOLAR;
		System.out.println(cantidadEuros + "€ son " + valorEnDolares + '\u0024');
		
		//DE DOLARES A EUROS
		double cantidadDolares  = 12.25;
		double valorEnEuross = cantidadDolares * UN_DOLAR_A_EURO ;
		System.out.println(cantidadDolares + "$ son " + valorEnEuross + '€');
 	}
}

