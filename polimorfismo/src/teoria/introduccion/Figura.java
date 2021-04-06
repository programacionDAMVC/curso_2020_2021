package teoria.introduccion;

public class Figura {

    protected NombreFigura nombreFigura;

    public Figura(NombreFigura nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    @Override
    public String toString() {
        return String.format("%S", nombreFigura);
    }

}
