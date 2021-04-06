package ejercicios.ejercicio3;

import java.util.List;

public class ListaReales implements Estadisticas{

    private List<Double> datos;

    public ListaReales(List<Double> datos) {
        this.datos = datos;
    }

    public List<Double> getDatos() {
        return datos;
    }

    @Override
    public int obtenerNumeroValores() {
        return 0;
    }

    @Override
    public double obtenerValorMinimo() {
        return 0;
    }

    @Override
    public double obtenerValorMaximo() {
        return 0;
    }

    @Override
    public double calcularSuma() {
        return 0;
    }

    @Override
    public double calcularValorMedio() {
        return 0;
    }

    @Override
    public double calcularDesviacionTipica() {
        return 0;
    }
}
