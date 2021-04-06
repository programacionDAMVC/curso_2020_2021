package teoria.abstractas.figuras;

public abstract class Figura {

    protected NombreFigura nombreFigura;

    public Figura(NombreFigura nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

   /* @Override
    public String toString() {
        return String.format("%S", nombreFigura);
    }*/

    protected abstract double calcularPerimetro();

    protected abstract double calcularArea();

}
