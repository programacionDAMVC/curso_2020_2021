public class ComputaArea {
	public static void main(String[] args) {
		//almacenamos un valor del radio
		//declarar las variables
		double radio, numeroPI, area;
		//inicilizamos la variables
		radio = 444.4;
		numeroPI = 3.1416;
	//	double radio = 1.1; ya está declarado
		area = numeroPI * radio * radio;
		System.out.println("El área vale  " + area); //+ NO suma, concatena(junta) cadenas
	}
}
