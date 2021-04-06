public class TestUnidades {
	
	public static void main (String[] args) {
		double libras = 1.2;
		double pies = 6.6;
		double yardas = 100;
		long millas = 12;
		float acres = 12.3f;
		long onzas = 5;
		int galonesAmericanos = 14;
		
		double kilogramosDeLibras = UnidadesLibreria.convertirLibrasAKilogramo(libras);
		float metrosDePies = UnidadesLibreria.convertirPiesAMetros(pies);
		int metrosDeMillas = UnidadesLibreria.convertirMillasAMetro(millas);
		
		System.out.println(libras + " libras son " + kilogramosDeLibras + " kg");
		System.out.printf("%.2f libras son %.2f kg%n", libras, kilogramosDeLibras);
		System.out.println(pies + " pies son " + metrosDePies + " m");
		UnidadesLibreria.convertirYardasAMetros(yardas); //el método es void, no devuelve nada, no tengo que recibirlo en una variable
		System.out.println(millas + " millas son " + metrosDeMillas + " m");
		System.out.println(acres + " acres son " + UnidadesLibreria.convertirAcresAHectareas(acres) + " hectáreas");
		System.out.println(onzas + " onzas son " + UnidadesLibreria.convertirOnzasAMililitros(onzas) + " ml");
		System.out.println(galonesAmericanos + " galones americanos son " + 
			UnidadesLibreria.convertirGalonesAmericanosALitros(galonesAmericanos) + " l");
	}
}

