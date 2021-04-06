package teoria.interfaces.figuras;

public class Circulo extends Elipse {
    public Circulo(int radio) {
        super(radio, radio);
      //  nombreFigura = NombreFigura.CIRCULO;
    }

    @Override
    public NombreFigura getNombreFigura() {
        return NombreFigura.CIRCULO;
    }

    @Override
    public String toString() {
        return String.format("%S, %d", getNombreFigura(), semiejeMayor);
    }
}
