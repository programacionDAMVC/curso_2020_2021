package teoria.introduccion;

public class Rectangulo extends Romboide{
    public Rectangulo(int lado1, int lado2) {
        super(lado1, lado2, 90);
        nombreFigura = NombreFigura.RECTANGULO;
    }

    @Override
    public String toString() {
        return String.format("%S, %d, %d", nombreFigura, lado1, lado2);
    }
}
