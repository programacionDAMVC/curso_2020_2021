/**
 * Clase con métodos para resolver sistemas de dos ecuaciones 
 * de dos incógnitas, X e Y
 * @author Manuel Molino
 * @version 1.0.0
 */
public class Ecuacion {
	
	/**
	 * Método que nos dices si el sistema de ecuaciones se puede resolver o no
	 * @param a coeficiente que acompaña a X en la primera ecuación
	 * @param b coeficiente que acompaña a Y en la primera ecuación
	 * @param c coeficiente que acompaña a X en la segunda ecuación
	 * @param d coeficiente que acompaña a Y en la segunda ecuación
	 * @return true si la ecuación se puede resolver, false si no tiene una única solución
	 */
	public static boolean esResoluble (int a, int b, int c, int d) {
		//código
	/*	boolean resultado = a * d - b * c != 0;
		return resultado;*/
		return  a * d - b * c != 0;
	}
	
	/**
	 * Método que nos resuelve el valor de X
	 * @param a coeficiente que acompaña a X en la primera ecuación
	 * @param b coeficiente que acompaña a Y en la primera ecuación
	 * @param c coeficiente que acompaña a X en la segunda ecuación
	 * @param d coeficiente que acompaña a Y en la segunda ecuación
	 * @param e coeficiente independiente de la primera ecuación
	 * @param f coeficiente independiente de la segunda ecuación
	 * @return un valor double con el resultado de la X
	 */
	public static double resolverX (int a, int b, int c, int d, int e, int f) {
		//código
		/*double resultado = 1.0 * (e * d - b * f) / (a * d - b * c );
		return resultado;*/
		return 1.0 * (e * d - b * f) / (a * d - b * c );
	}
	
	/**
	 * Método que nos resuelve el valor de Y
	 * @param a coeficiente que acompaña a X en la primera ecuación
	 * @param b coeficiente que acompaña a Y en la primera ecuación
	 * @param c coeficiente que acompaña a X en la segunda ecuación
	 * @param d coeficiente que acompaña a Y en la segunda ecuación
	 * @param e coeficiente independiente de la primera ecuación
	 * @param f coeficiente independiente de la segunda ecuación
	 * @return un valor double con el resultado de la Y
	 */
	public static double resolverY (int a, int b, int c, int d, int e, int f) {
		//código
		/*double resultado = 1.0 * (a * f - e * c) / (a * d - b * c );
		return resultado;*/
		return  1.0 * (a * f - e * c) / (a * d - b * c );
	}
	
	
}

