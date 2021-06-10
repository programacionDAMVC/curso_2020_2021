package poo.poo3;

public class TrianguloEquilatero extends FiguraRegular {
    public TrianguloEquilatero( float longitudLado) {
        super(3, longitudLado);
        nombreFiguraGeometrica = "Triángulo equilatero";
    }

    @Override
    public float calcularArea() {
        return (float) (longitudLado * longitudLado * Math.sqrt(3) / 4);
    }
}
