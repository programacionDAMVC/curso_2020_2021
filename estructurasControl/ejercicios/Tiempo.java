/*
 *Ejercicio 5, java Tiempo 10 10 10 
 * hora válida
 * java Tiempo 10 10 89
 * hora no válida * 
 */


public class Tiempo {
	
	public static void main (String[] args) {
		
		if ( args.length < 3 ) {
			System.out.println("Faltan datos");
			return;
		}
		String sHora = args[0];
		String sMinutos = args[1];
		String sSegundos =  args[2];
		
		//mas adelante comprobaremos que sHora, sMinutos y sSegundos son "formateables" a números
		int iHora = Integer.parseInt(sHora);
		int iMinutos = Integer.parseInt(sMinutos);
		int iSegundos = Integer.parseInt(sSegundos);
		
		boolean horaValida = iHora <= 23 && iHora >= 0;
		boolean minutosValidos = iMinutos <= 59 && iMinutos >= 0;
		boolean segudosValidos = iSegundos <= 59 && iSegundos >= 0;
		
		if (horaValida && minutosValidos && segudosValidos)
			System.out.println("Hora válida");
		else
			System.out.println("Hora no válida");


		
	}
}

