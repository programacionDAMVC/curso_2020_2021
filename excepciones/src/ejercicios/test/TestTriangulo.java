package ejercicios.test;

import ejercicios.ejercicio1.IlegalTrianguloExcepcion;
import ejercicios.ejercicio1.Triangulo;

public class TestTriangulo {
    public static void main(String[] args) {
        //creamos un Triangulo correto y otro incorrecto
        try {
            Triangulo t = new Triangulo(1 , 2, 1);
            t = new Triangulo(2,2,3); // este no se crea
            System.out.println(t);
        } catch (IlegalTrianguloExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}
