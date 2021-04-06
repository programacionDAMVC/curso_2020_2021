package ejercicios.ejercicio2;

public class Cuadrado extends PoligonoRegular {
    public Cuadrado(float longitudLado) {
        super(4, longitudLado);
    }

    @Override
    public float calcularArea() {
        return getLongitudLado() * getLongitudLado();
    }
    @Override
    public String toString() {
        return String.format("CUADRADO, %s", super.toString());
    }
}
