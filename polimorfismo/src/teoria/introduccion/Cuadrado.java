package teoria.introduccion;
//ES UN ROMBO DONDE EL ÁNGULO ADYACENTE ES 90 GRADOS
public class Cuadrado extends Rombo{

    public Cuadrado(int lado) {
        super(lado, 90);
        nombreFigura = NombreFigura.CUADRADO;
    }

    @Override
    public String toString() {
        return String.format("%S, %d", nombreFigura, lado1);
    }
}
