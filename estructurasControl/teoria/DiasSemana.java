/*
  * Dado un día de la semana y n días conocer que día de la semana es
  * Martes, n = 10, 10 % 7 es 3, Martes (0), Miercoles (1), Jueves (2), VIERNES (3)
  * Domingo = 0, Lunes = 1, Martes = 2, ....., Sábado = 6
  * 
 */


public class DiasSemana {
	
	public static void main (String[] args) {
		String sDiaInicial = "Martes";
		int nDias      = 33;
		int desplazamiento = nDias % 7;
		int iDiaInicial = 0;  //¿Hace falta declararla?
		switch ( sDiaInicial ) {
			case "Domingo":
				iDiaInicial = 0;
				break;
			case "Lunes":
				iDiaInicial = 1;
				break;
			case "Martes":
				iDiaInicial = 2;
				break;
			case "Miércoles":
				iDiaInicial = 3;
				break;
			case "Jueves":
				iDiaInicial = 4;
				break;
			case "Viernes":
				iDiaInicial = 5;
				break;
			case "Sábado":
				iDiaInicial = 6;
				break;
			default:
				System.out.println("Opción no contemplada");
				return;
	
		}
	//	System.out.println(iDiaInicial);
		
		int iDiaFinal = iDiaInicial + desplazamiento ;
		if (iDiaFinal >= 7) {
			iDiaFinal -= 7;
		}
	//	System.out.println(iDiaFinal);

		//System.out.println(iDiaFinal);
		String sDiaFinal = "";
 		//switch que dado iDiaFinal (0-6), nos diga Lunes, Martes, Miércoles ....
		switch ( iDiaFinal ) {
			case 0:
				sDiaFinal = "Domingo";
				break;
			case 1:
				sDiaFinal = "Lunes";
				break;
			case 2:
				sDiaFinal = "Martes";
				break;
			case 3:
				sDiaFinal = "Miércoles";
				break;
			case 4:
				sDiaFinal = "Jueves";
				break;
			case 5:
				sDiaFinal = "Viernes";
				break;
			case 6:
				sDiaFinal = "Sábado";
				break;
			default:
				System.out.println("Opción no contemplada");
				return;
		}
		System.out.printf("Hoy es %s dentro de %d días es %s%n", sDiaInicial, nDias, sDiaFinal);

		
	}
}

