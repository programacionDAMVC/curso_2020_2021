package teoria.abstractas.figuras;

//FIGURA CON CUATRO LADOS IGUALES Y UN ÁNGULO ADYACENTE
public class Rombo extends Romboide {

    public Rombo(int lado, double angulo) {
        super(lado, lado, angulo);
        nombreFigura = NombreFigura.ROMBO;
    }

    @Override
    public String toString() {
        return String.format("%S, %d, %.2f", nombreFigura, lado1, angulo);
    }

}
