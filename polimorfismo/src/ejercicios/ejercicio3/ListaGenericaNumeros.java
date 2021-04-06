package ejercicios.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class ListaGenericaNumeros <Number> implements Estadisticas {
    List<Number> listaNumeros;

    public ListaGenericaNumeros(List<Number> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public ListaGenericaNumeros() {
    }


    public void setListaNumeros(List<Number> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    @Override
    public int obtenerNumeroValores() {
        return listaNumeros.size();
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
