public class Unidades {
	//constantes
	static final double LIBRAS_A_KILOGRAMO = 0.453592;
	static final double PIES_A_METROS      = 0.3048;
	static final double YARDA_A_METROS     = 0.9144;
	static final double MILLAS_A_METROS    = 1609.34;
	static final double ACRES_A_HECTAREAS  = 0.404686;
	static final double ONZAS_A_MILILITROS = 29.5735;
	static final double GALONES_AMERICANOS_A_LITROS   = 3.78541; 
	
	public static void main (String[] args) {
		
		double libras = 1.2;
		double pies = 6.6;
		double yardas = 100;
		long millas = 12;
		float acres = 12.3f;
		long onzas = 5;
		int galonesAmericanos = 14;
		
		double kilogramosDeLibras = convertirLibrasAKilogramo(libras);
		float metrosDePies = convertirPiesAMetros(pies);
		int metrosDeMillas = convertirMillasAMetro(millas);
		
		System.out.println(libras + " libras son " + kilogramosDeLibras + " kg");
		System.out.println(pies + " pies son " + metrosDePies + " m");
		convertirYardasAMetros(yardas); //el método es void, no devuelve nada, no tengo que recibirlo en una variable
		System.out.println(millas + " millas son " + metrosDeMillas + " m");
		System.out.println(acres + " acres son " + convertirAcresAHectareas(acres) + " hectáreas");
		System.out.println(onzas + " onzas son " + convertirOnzasAMililitros(onzas) + " ml");
		System.out.println(galonesAmericanos + " galones americanos son " + 
			convertirGalonesAmericanosALitros(galonesAmericanos) + " l");
	}
	
	//De libras a kilogramos.
	public static double convertirLibrasAKilogramo (double libras) {
		double kilogramos = libras * LIBRAS_A_KILOGRAMO;
		return kilogramos;
		//kilogramos++; no se alcanza, ERROR compilación
	}
	
	//De pies a metros.
	public static float convertirPiesAMetros (double pies) {
		return (float) (pies * PIES_A_METROS);
	}
	
	//De yardas a metros
	public static void 	convertirYardasAMetros (double yardas) {
		System.out.println(yardas + " yardas son " + (yardas * YARDA_A_METROS) + " m");
	}
	//De millas a metros
	public static int convertirMillasAMetro (double millas) {
		return (int) (millas * MILLAS_A_METROS);
	}
	//De acres a hectareas.
	public static long convertirAcresAHectareas (double acres) {
		return (long) acres * (long) ACRES_A_HECTAREAS; //otra posibilidad de casting, esta es peor doble casting
	}
	
	//De onzas a mililitros.
	public static float convertirOnzasAMililitros( long onzas ) {
		return onzas * (float) ONZAS_A_MILILITROS;
	}
	
	//De galones a litros.
	public static long convertirGalonesAmericanosALitros ( int litros ) {
		return litros * (long) GALONES_AMERICANOS_A_LITROS;
	}
	
		
}

