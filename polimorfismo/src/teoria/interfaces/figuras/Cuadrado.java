package teoria.interfaces.figuras;

//ES UN ROMBO DONDE EL ÁNGULO ADYACENTE ES 90 GRADOS
public class Cuadrado extends Rombo {

    public Cuadrado(int lado) {
        super(lado, Math.PI / 2);
        //nombreFigura = NombreFigura.CUADRADO;
    }

    @Override
    public String toString() {
        return String.format("%S, %d", getNombreFigura(), lado1);
    }

    @Override
    public NombreFigura getNombreFigura() {
        return NombreFigura.CUADRADO;
    }
}
