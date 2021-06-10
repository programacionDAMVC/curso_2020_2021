package poo.poo3;
//clase padre donde figura regular puede ser un triángulo equilatero
//cuadrado, pentágono, hexágono ....
public abstract class FiguraRegular implements Figura {

    protected int numeroLados;
    protected float longitudLado;
    protected String nombreFiguraGeometrica;

    public FiguraRegular(int numeroLados, float longitudLado) {
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }

    @Override
    public float calcularPerimetro() {
        return numeroLados * longitudLado;
    }

    @Override
    public abstract float calcularArea();

    @Override
    public String getNombreFiguraGeometrica() {
        return nombreFiguraGeometrica;
    }
}


