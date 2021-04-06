package teoria.interfaces.figuras;

//FIGURA CON CUATRO LADOS IGUALES Y UN ÁNGULO ADYACENTE
public class Rombo extends Romboide {

    public Rombo(int lado, double angulo) {
        super(lado, lado, angulo);
      //  nombreFigura = NombreFigura.ROMBO;
    }

    @Override
    public String toString() {
        return String.format("%S, %d, %.2f", getNombreFigura(), lado1, angulo);
    }

    @Override
    public NombreFigura getNombreFigura() {
        return NombreFigura.ROMBO;
    }
}
