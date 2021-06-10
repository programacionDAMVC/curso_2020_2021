package poo.poo3;

public interface Figura {

    float calcularPerimetro ();
    float calcularArea();
    String getNombreFiguraGeometrica();

    default String obtenerInformacionFigura () {
        return String.format("Figura geométrica %S, de perímetro %.2f y área %.2f",
                getNombreFiguraGeometrica(), calcularPerimetro(), calcularArea());
    }
}
