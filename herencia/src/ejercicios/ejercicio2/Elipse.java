package ejercicios.ejercicio2;

public class Elipse extends FiguraCircular {
    public static int numeroElipses = 0;
    public Elipse(double lado1, double lado2) {
        super(lado1, lado2);
        numeroElipses++;
    }

    public double calcularPerimetro() {
        return Math.PI * (lado1 + lado2);
    }

    //toString de la clase padre y que añada ELIPSE de longitud tanto

    @Override
    public String toString() {
        return String.format("%s, ELIPSE de perímetro %.2f", super.toString(), calcularPerimetro() );
    }
}
