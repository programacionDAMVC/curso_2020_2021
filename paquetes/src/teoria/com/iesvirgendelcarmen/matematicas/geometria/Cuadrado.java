package teoria.com.iesvirgendelcarmen.matematicas.geometria;

public class Cuadrado {
    private double lado;
    public Cuadrado (double lado) {
        this.lado = lado;
    }
    public double calcularArea () {
        return lado * lado;
    }
    public double calcularPerimetro () {
        return lado * 4.0;
    }

    @Override
    public String toString() {
        return String.format("Cuadrado de lado %.2f%nÁrea %.2f y perímetro %.2f%n",
                lado, calcularArea(), calcularPerimetro() );
    }
}

