package ejercicios.ejercicio2;

import java.util.Objects;

public abstract class PoligonoRegular implements Comparable<PoligonoRegular>{
    private int numeroLados;
    private float longitudLado;

    public PoligonoRegular(int numeroLados, float longitudLado) {
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public float getLongitudLado() {
        return longitudLado;
    }

    public float calcularPerimetro() {
        return numeroLados * longitudLado;
    }
    public abstract float calcularArea();
    //POLIGONO REGULAR de X lados e Y de longitud de lado
    //cuyo per´ımetro es Z

    @Override
    public String toString() {
        return String.format("POLIGONO REGULAR de %d lados, de longitud de lado %.2f, cuyo perímetro es %.2f y de área %.2f",
                numeroLados, longitudLado, calcularPerimetro(), calcularArea());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PoligonoRegular that = (PoligonoRegular) o;
        return numeroLados == that.numeroLados &&
                Float.compare(that.longitudLado, longitudLado) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroLados, longitudLado);
    }

    @Override
    public int compareTo(PoligonoRegular poligonoRegular) {
        // ejemplo area1 = 1.99 y area2 = 1.01
        // diferencia 1.99 - 1.01 = 0.98
        // el casting (int) 0.98 nos da 0
        return (int) (this.calcularArea() * 100 - poligonoRegular.calcularArea() * 100);
        // si mulitiplicamos por 100
        // area1 = 199 y area2 = 101
        // diferencia 199 - 101 = 98
        // el casting (int) 98 nos da 98
    }
}
