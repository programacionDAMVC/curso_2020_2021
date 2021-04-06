package ejercicios.ejercicio1;

public class Triangulo {

    //atributos
    private int a;
    private int b;
    private int c;

    //constructor: hay que tener encuenta que si no se cumple la desigualdad triangular
    //lanzamos la excepción IlegalTrianguloExcepcion

    public Triangulo(int a, int b, int c) throws IlegalTrianguloExcepcion {
        if (! esTriangulo (a, b, c))
            throw new IlegalTrianguloExcepcion();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private static  boolean esTriangulo(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
        //ejemplo 1 2 3 no es triángulo porque no se cumple 1 + 2 > 3
        //ejemplo 2 2 3 si es triángulo
        // 2 + 2 > 3    2 + 3 > 2
    }


    //getters y setters

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }


    //toString

    @Override
    public String toString() {
        return String.format("Triángulo de lados: %d, %d y %d", a, b, c);
    }
}
