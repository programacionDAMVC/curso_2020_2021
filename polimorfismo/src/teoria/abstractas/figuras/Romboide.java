package teoria.abstractas.figuras;

//CUADRILATERO CON DOS LADOS IGUALES (A = C, y B = D) Y ÁNGULO ADYACENTE
public class Romboide extends Cuadrilatero {

    protected double angulo;

    public Romboide(int lado1, int lado2, double angulo) {
        super(lado1, lado2, lado1, lado2);
        this.angulo = angulo;
        nombreFigura = NombreFigura.ROMBOIDE;
    }

    @Override
    public String toString() {
        return String.format("%S, %d, %d, %.2f", nombreFigura, lado1, lado2, angulo);
    }
    @Override
    protected double calcularArea () {
        return lado1 * lado2 * Math.sin(angulo);
    }
}
