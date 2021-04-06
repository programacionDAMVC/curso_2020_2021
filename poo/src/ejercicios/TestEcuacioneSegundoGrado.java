package ejercicios;

import java.util.Scanner;

public class TestEcuacioneSegundoGrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los coeficientes de la ecuación de segundo grado");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();
        EcuacionSegundoGrado ecuacionSegundoGrado = new EcuacionSegundoGrado(a, b, c);
      /* if (! ecuacionSegundoGrado.esResoluble()){
            System.out.println("No se puede resolver la ecuación");
            return;
        }*/
        double solucion1 =  ecuacionSegundoGrado.calcularPrimeraSolucion();
        double solucion2 =  ecuacionSegundoGrado.calcularSegundaSolucion();
        if (Double.isNaN(solucion1) || Double.isNaN(solucion2)
                || Double.isInfinite(solucion1) || Double.isInfinite(solucion2)) {
            System.out.println("No se puede resolver la ecuación");
            return;
        }
        System.out.printf("Solución 1: %.2f%n", solucion1 );
        System.out.printf("Solución 2: %.2f%n", solucion2);

    }
}
