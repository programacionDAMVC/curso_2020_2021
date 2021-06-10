package poo.poo3;

public class Cuadrado extends FiguraRegular {

    public Cuadrado( float longitudLado) {
        super(4, longitudLado);
        nombreFiguraGeometrica = "Cuadrado";
    }

    @Override
    public float calcularArea() {
        return (float) Math.pow(longitudLado, 2);
    }
}
