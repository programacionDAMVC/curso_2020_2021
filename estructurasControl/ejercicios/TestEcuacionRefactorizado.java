/*
 * TestEcuacionRefactorizado.java
 * 
 * Copyright 2020 manuel <manuel@manuel-HP-Compaq-Elite-8300-SFF>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;

public class TestEcuacionRefactorizado {
	
	public static void main (String[] args) {
		//usando la clase Scanner solicitamos los valores de a, b, c, d, e, f
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los valores de la ecuación a resolver, a, b, c, d, e, f");
		int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
		int d = sc.nextInt(); int e = sc.nextInt(); int f = sc.nextInt();
		sc.close();
		
		//comprobamos si se puede resolver si o no, y lo indicamos en consola
		//si no podemos resolver el programa termina
		
		if (! Ecuacion.esResoluble(a, b, c, d)) {
			System.out.println("Sistema de ecuaciones no resoluble");
			return;
		}
		System.out.println("Sistema de ecuaciones resoluble");
		//si se puede resolver mostrar los datos de x y usando printf
		System.out.printf("Valor de X %.2f y valor de Y %.2f%n",
		 Ecuacion.resolverX(a, b, c, d, e, f),Ecuacion.resolverY(a, b, c, d, e, f));
		
		
	}
}

