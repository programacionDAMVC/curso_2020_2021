package teoria.abstractas.figuras;

//ES UN ROMBO DONDE EL ÁNGULO ADYACENTE ES 90 GRADOS
public class Cuadrado extends Rombo {

    public Cuadrado(int lado) {
        super(lado, Math.PI / 2);
        nombreFigura = NombreFigura.CUADRADO;
    }

    @Override
    public String toString() {
        return String.format("%S, %d", nombreFigura, lado1);
    }
}
