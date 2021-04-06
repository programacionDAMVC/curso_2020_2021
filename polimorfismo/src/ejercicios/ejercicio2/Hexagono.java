package ejercicios.ejercicio2;

public class Hexagono extends PoligonoRegular {
    public Hexagono( float longitudLado) {
        super(6, longitudLado);
    }

    @Override
    public float calcularArea() {
        return 2.60f * getLongitudLado() * getLongitudLado();
    }
    @Override
    public String toString() {
        return String.format("HEXÁGONO, %s", super.toString());
    }
}
