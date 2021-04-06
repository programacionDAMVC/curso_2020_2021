package ejercicios.ejercicio2;

public class TrianguloEquilatero extends PoligonoRegular{
    public TrianguloEquilatero( float longitudLado) {
        super(3, longitudLado);
    }

    @Override
    public float calcularArea() {
        return (float) (Math.sqrt(3) * Math.pow(getLongitudLado(), 2) / 4);
    }

    @Override
    public String toString() {
        return String.format("TRIÁNGULO, %s", super.toString());
    }
}
