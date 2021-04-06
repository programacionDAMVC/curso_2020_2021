package ejercicios;
/*
a · x^2 + b · x + c = 0
Soluciones: (-b +- sqrt(b^2 - 4 · a · c) / (2 · a)
Resoluble si a es distinto de cero y si la raíz positiva b^2 >= 4 · a · c
 */
public class EcuacionSegundoGrado {
    //atributos
    private double a;
    private double b;
    private double c;

    //constructor
    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //método que nos dice si tiene o no solución
    public boolean esResoluble() {
        return a != 0 && b * b >= 4 * a * c;
    }
    //método que nos devolver las  soluciones
    public double calcularPrimeraSolucion () {
        return (-b  +  Math.sqrt(b * b - 4 * a * c)) / (2.0 * a);
    }
    public double calcularSegundaSolucion () {
        return (-b  - Math.sqrt(b * b - 4 * a * c)) / (2.0 * a);
    }
}
