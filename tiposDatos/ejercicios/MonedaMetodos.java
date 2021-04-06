
public class MonedaMetodos {
	
	static final double UN_EURO_A_DOLAR = 1.18; 
	static final double UN_DOLAR_A_EURO = 0.85; 
		
	public static void main (String[] args) {
		
		convertirEurosADolares(12.25);
		convertirEurosADolares(100);
		convertirEurosADolares(71.2);
		double cantidadDolares  = 200.25;
		double valorEnEuros = convertirDolaresAEuros(cantidadDolares);
		System.out.println(cantidadDolares + "$ son " + valorEnEuros + '€');
		
	}
	public static double convertirDolaresAEuros (double cantidadDolares) {
		double valorEnEuros = cantidadDolares * UN_DOLAR_A_EURO;
		return  valorEnEuros;
	}
	
	public static void convertirEurosADolares (double cantidadEuros) {
		double valorEnDolares = cantidadEuros * UN_EURO_A_DOLAR;
		System.out.println(cantidadEuros + "€ son " + valorEnDolares + '\u0024');
	}
	
	//f(x) => x^2  pasamos un valor de x y devuelve un valor de x^2, ejem paso 3 y devuelve 9
	//pasamos una cantidad de dolares y nos devuelve la cantidad de euros que corresponden
	
	
	
}

