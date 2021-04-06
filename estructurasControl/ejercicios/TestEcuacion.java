/*
 * clase para testear la clase Ecuacion
 * 
 */
import java.util.Scanner;

public class TestEcuacion {
	
	public static void main (String[] args) {
		//usando la clase Scanner solicitamos los valores de a, b, c, d, e, f
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los valores de la ecuación a resolver, a, b, c, d, e, f");
		int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
		int d = sc.nextInt(); int e = sc.nextInt(); int f = sc.nextInt();
		sc.close();
		
		//comprobamos si se puede resolver si o no, y lo indicamos en consola
		//si no podemos resolver el programa termina
		boolean resoluble = Ecuacion.esResoluble(a, b, c, d);
		if (! resoluble) {
			System.out.println("Sistema de ecuaciones no resoluble");
			return;
		}
		System.out.println("Sistema de ecuaciones resoluble");
		double x = Ecuacion.resolverX(a, b, c, d, e, f);
		double y = Ecuacion.resolverY(a, b, c, d, e, f);
		//si se puede resolver mostrar los datos de x y usando printf
		System.out.printf("Valor de X %.2f y valor de Y %.2f%n", x, y);
		
		
	}
}

