package ejercicios.ejercicio2;

public class FiguraCircular {

    protected double lado1;
    protected double lado2;

    public FiguraCircular(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    protected double calcularArea () {
        return Math.PI * lado1 * lado2;
    }

    //FIGURA GEOMETRICA, de x lado 1, de y de lado 2, y área tanto


    @Override
    public String toString() {
        return String.format("FIGURA GEOMÉTRICA, de %.2f lado1 y de %.2f de lado2, y área %.2f",
                lado1, lado2, calcularArea());
    }
}
