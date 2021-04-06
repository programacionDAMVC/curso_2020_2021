public class Ejercicio11 {
	
	public static void main (String[] args) {
		//Declara una variable de tipo float denominada millasRecorridadas.
		float fMillasRecorridadas;
		//Posteriormente inicialı́zala a 100
		fMillasRecorridadas = 100;
		//Declara una constante de tipo float denominada MILLAS_POR_KILOMETRO con el valor 1.609
		final float fMILLAS_POR_KILOMETRO = 1.609F;
		//Declara una variable de tipo double denominada kilometrosRealizados y asigna el valor de multiplicar los dos valores anteriores.
		double dKilometrosRealizados = fMillasRecorridadas * fMILLAS_POR_KILOMETRO;
		//Muestra por pantalla los valores anteriores.
		String cadenaSalida = "Usando float, kilomentros realizados: " + dKilometrosRealizados;
		System.out.println(cadenaSalida);
		
		/*Repite el ejercicio, pero ahora cambia el tipo de la variable millasRecorrida-
		das y la constante MILLAS POR KILOMETRO a tipo double, y la la variable
		kilometrosRealizados a tipo float*/
		
		double dMillasRecorridadas = 100;
		final double dMILLAS_POR_KILOMETRO = 1.609;
		dKilometrosRealizados = dMillasRecorridadas * dMILLAS_POR_KILOMETRO;
		cadenaSalida = "Usando doubles, Kilomentros realizados: " + dKilometrosRealizados;
		System.out.println(cadenaSalida);
		
		float fKilometrosRealizados = (float) (dMillasRecorridadas * dMILLAS_POR_KILOMETRO);
		cadenaSalida = "Usando float en el resultado, Kilomentros realizados: " + fKilometrosRealizados;
		System.out.println(cadenaSalida);
	}
}

