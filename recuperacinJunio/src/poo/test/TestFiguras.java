package poo.test;

import poo.poo3.*;

import java.util.ArrayList;
import java.util.List;

public class TestFiguras {
    public static void main(String[] args) {
        List<Figura> listaFiguras = new ArrayList<>();
        FiguraRegular trianguloEq1 = new TrianguloEquilatero(2.2f);
        listaFiguras.add(trianguloEq1);
        FiguraRegular cuadrado1 = new Cuadrado(2.2f);
        listaFiguras.add(cuadrado1);
        FiguraCircular elipse1 = new Elipse(2.2f, 3.1f);
        listaFiguras.add(elipse1);
        FiguraCircular circulo1 = new Circulo(2.6f);
        listaFiguras.add(circulo1);
        for (Figura figura : listaFiguras) {
            System.out.println(figura.obtenerInformacionFigura());
        }
    }
}
