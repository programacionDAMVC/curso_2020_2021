package teoria.introduccion;
//FIGURA CON CUATRO LADOS IGUALES Y UN ÁNGULO ADYACENTE
public class Rombo extends Romboide{

    public Rombo(int lado, int angulo) {
        super(lado, lado, angulo);
        nombreFigura = NombreFigura.ROMBO;
    }

    @Override
    public String toString() {
        return String.format("%S, %d, %d", nombreFigura, lado1, angulo);
    }

}
