package ejercicios.com.iesvirgedelcarmen.matematicas.poo;

public class Rectangulo {
    private double alto;
    private double ancho;
    public Rectangulo (double alto, double ancho) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public double calcularArea () {
        return ancho * alto;
    }
    public double calcularPerimetro () {
        return ancho * 2.0 + alto * 2.0;
    }

    @Override
    public String toString() {
        return String.format("Rectángulo de ancho %.2f y alto %.2f%nÁrea %.2f y perímetro %.2f%n",
                ancho, alto, calcularArea(), calcularPerimetro() );
    }
}

