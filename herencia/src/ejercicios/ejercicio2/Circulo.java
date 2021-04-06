package ejercicios.ejercicio2;

public class Circulo extends FiguraCircular {
    public static int numeroCirculos = 0;
    public Circulo(double radio) {
        super(radio, radio);
        numeroCirculos++;
    }

    public double calcularPerimetro() {
        return 2.0 * Math.PI * lado1;
    }
    //CÍRCULO, de radio tanto, de área tanto y perímetro tanto.
    @Override
    public String toString() {
        return String.format("CIRCULO, de radio %.2f, de área %.2f y perímetro %.2f",
                lado2, calcularArea(), calcularPerimetro());
    }
}
