/*
 *  pasamos dos número y operadores + - / *
 *  java CalculadoraBasica 12 / 6 nos debe devolver 2
 *  java CalculadoraBasica 12 + 6 nos debe devolver 18
 *  java CalculadoraBasica 12 - 6 nos debe devolver 6
 *  java CalculadoraBasica 12 x 6 nos debe devolver 72
 */


public class CalculadoraBasica {
	
	public static void main (String[] args) {
		
		//comprobamos que entran tres argumentos, sino salimos con código (1)
        System.out.println("Nº argumentos: " + args.length);
		if ( args.length < 3 ) {
			System.out.println("Faltan datos");
			System.exit(1);
		}
		String sNumero1 = args[0];
		String operador = args[1]; // + - x /
		String sNumero2 = args[2];
		
		//comprobar que el segundo argumento es + ó -  x ó /, sino salimos con código (2)
		//IMPORTANTE == solo vale para comparar tipos primitivos: int, double, boolean, char, 
		//las cadenas son String, son objetos NO SON TIPOS PRIMITIVOS, no se usa ==, se usa equals
		
		if ( !operador.equals("+") && !operador.equals("-") &&
			 !operador.equals("x") && !operador.equals("/") ) { // NOT equal operador y "+"
			System.out.printf("Operador %s no válido%n", operador);
			System.exit(2);
		}
		
		
		//AQUÍ SE COMPROBARÍA QUE sNumero1 y sNumero2 son dígitos, sino System.exit(3)
		//se suele hacer con expresiones regulares [0-9]+ \d+
		//suponemos que lo hemos hecho
		int iNumero1 = Integer.parseInt(sNumero1);
		int iNumero2 = Integer.parseInt(sNumero2);

		int resultado = 0;
		switch (operador) {
			case "+":
				resultado = iNumero1 + iNumero2;
				break;
			case "-":
				resultado = iNumero1 - iNumero2;
				break;
			case "x":
				resultado = iNumero1 * iNumero2;
				break;
			case "/":
				resultado = iNumero1 / iNumero2;
				break;
			default :
				System.out.println("Operación no válida");
				return;
		}
		System.out.printf("%d %s %d = %d%n",iNumero1, operador, iNumero2, resultado);
	}
}

