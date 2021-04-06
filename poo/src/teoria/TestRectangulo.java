package teoria;

import java.util.Scanner;

public class TestRectangulo {
    public static void main(String[] args) {
        //objeto teoria.Rectangulo con lado y alto por defecto
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.printf("teoria.Rectangulo de alto %d, ancho %d y área %d%n",
                rectangulo1.getAlto(), rectangulo1.getAncho(), rectangulo1.getArea());

        //para cambiar valores usamos los setter
        //pedimos por Scanner los valores
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor del alto, número entero");
        int alto = sc.nextInt();
        System.out.println("Introduce el valor del ancho, número entero");
        int ancho = sc.nextInt();
        sc.close();
        Rectangulo rectangulo2 = new Rectangulo();
        rectangulo2.setAlto(alto);
        rectangulo2.setAncho(ancho);
        System.out.printf("teoria.Rectangulo de alto %d, ancho %d y área %d%n",
                rectangulo2.getAlto(), rectangulo2.getAncho(), rectangulo2.getArea());
    }
}
