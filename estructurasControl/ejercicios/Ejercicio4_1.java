/*
 * Usando clase Scanner
 */
import java.util.Scanner;

public class Ejercicio4_1{
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//pedimos un número de una cifra a cinco cifras exclusive este último valor
	/*	System.out.println("Introduce un número entre 1 a 9999");
		int numero = sc.nextInt();
		System.out.println(numero);
		while ( numero < 1 || numero > 9_999) {// no ha sido correcto el nº introducido, lo solicito hasta que sea correcto
			System.out.println("Introduce un número entre 1 a 9999");
			numero = sc.nextInt(); //hasta que sea correcto
		}
		System.out.println(numero);*/
		//con un bucle do while
		int numero = -1;
		do {
			System.out.println("Introduce un número entre 1 a 9999");
			numero = sc.nextInt();
		} while ( numero < 1 || numero > 9_999 );
                sc.close();
		
		//AVERIGUAMOS EL NÚMERO DE CIFRAS
		int numeroCifras = 0;
		if (numero / 1_000 != 0)
			numeroCifras = 4;
		else if (numero / 100 != 0)
			numeroCifras = 3;
		else if (numero / 10 != 0)
			numeroCifras = 2;
		else
			numeroCifras = 1;
			
		System.out.printf("%d de %d cifras%n", numero, numeroCifras);
		
		//cuatro cifras 3875
		//int cifra1 = numero / 1000 % 10 3875 / 1000 = 3 % 10 = 3
		//int cifra2 = (numero / 100) % 10
		//int cifra3 = (numero / 10) % 10
		//int cifra4 = (numero / 1) % 10
		
		//tres cifras
		//int cifra1 = (numero / 100) % 10 ;
		//int cifra2  = (numero / 10) % 10; 
		//int cifra3  = (numero / 1) % 10; 
		
		//dos cifras
		//int cifra1 = (numero / 10) % 10
		//int cifra2 = (numero / 1) % 10
		
		//una cifra
		//int cifra1 = (numero / 1) % 10
		
		int contador = 1;
		for (int i = (int) Math.pow(10, numeroCifras - 1) ; i >= 1; i /= 10){
			int cifra = (numero / i) % 10;
			System.out.printf("Cifra %d: %d%n", contador, cifra);
			contador++;
		}
		
	}
}

