package teoria.com.iesvirgendelcarmen.test;

import teoria.com.iesvirgendelcarmen.matematicas.geometria.Cuadrado;
import teoria.com.iesvirgendelcarmen.matematicas.geometria.Rectangulo;
import teoria.com.iesvirgendelcarmen.matematicas.geometria.TrianguloRectangulo;

public class Test1 {
    public static void main(String... args) {

        TrianguloRectangulo t = new TrianguloRectangulo(1, 2);
        Cuadrado c            = new Cuadrado(2.2);
        Rectangulo r          = new Rectangulo(2.1, 1.1);

        System.out.println(t);
        System.out.println(c);
        System.out.println(r);

    }
}

