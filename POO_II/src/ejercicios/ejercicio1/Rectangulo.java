package ejercicios.ejercicio1;

public class Rectangulo {
    //clases POJO
    private double alto = 1 ;
    private double ancho = 1;
    private static int numeroRectangulos = 0;

    public Rectangulo() {
        numeroRectangulos++;
    }

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
        numeroRectangulos++;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularPerimetro () {
        return ancho * 2.0 + alto * 2.0;
    }

    public double calcularArea () {
        return ancho * alto;
    }

    public static int getNumeroRectangulos() {
        return numeroRectangulos;
    }

    @Override
    public String toString() {
        return String.format("Rectángulo de alto %.2f, ancho %.2f, perímetro %.2f y área %.2f",
                alto, ancho, calcularPerimetro(), calcularArea());
    }

    public static class RectanguloAuxiliar {
        public static int obtenerNumeroRectangulos () {
            return numeroRectangulos;
        }
        //a partir de aqui crearíamos métodos, estáticos, que serían de utilidad para esta clase
    }
}
