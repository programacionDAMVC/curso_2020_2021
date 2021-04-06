package teoria.test;

import teoria.excepciones_propias.NoTrianguloRectanguloException;
import teoria.excepciones_propias.TrianguloRectangulo;

public class TestTrianguloRectangulo {
    public static void main(String[] args) {
        try {
            TrianguloRectangulo t1 = new TrianguloRectangulo(33,4,5);
            System.out.println(t1);
        } catch (NoTrianguloRectanguloException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("El programa continúa");

    }
}
