package poo.poo3;
//clase padre donde figura regular puede ser un triángulo equilatero
//cuadrado, pentágono, hexágono ....
public abstract class FiguraRegular {

    protected int numeroLados;
    protected float longitudLado;
    protected String nombreFiguraGeométrica;

    public FiguraRegular(int numeroLados, float longitudLado) {
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }
    public float calcularPerimetro () {
        return numeroLados * longitudLado;
    }

    public abstract float calcularArea();



    @Override
    public String toString() {
        return String.format("Figura geométrica %S, de perímetro %.2f y área %.2f",
                nombreFiguraGeométrica, calcularPerimetro(), calcularArea());
    }
}
