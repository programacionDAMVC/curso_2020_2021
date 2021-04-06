package teoria.interfaces.figuras;

public class TrapecioIsosceles extends Cuadrilatero {

    public TrapecioIsosceles(int lado1, int lado2, int lado3) {
        super(lado1, lado2, lado3, lado3);
       // nombreFigura = NombreFigura.TRAPECIO_ISOSCELES;
    }

    @Override
    public double calcularArea() {
        return ((lado1 + lado2) / 2.0) * Math.sqrt(Math.pow(lado4, 2) - Math.pow((lado1 - lado2) / 2.0, 2));
    }

    @Override
    public String toString() {
        return String.format("%S, %d, %d, %d", getNombreFigura(), lado1, lado2, lado3);
    }

    @Override
    public NombreFigura getNombreFigura() {
        return NombreFigura.TRAPECIO_ISOSCELES;
    }
}
