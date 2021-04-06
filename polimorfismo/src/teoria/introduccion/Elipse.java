package teoria.introduccion;

public class Elipse extends Figura {

    protected int semiejeMayor;
    protected int semiejeMenor;

    public Elipse(int semiejeMayor, int semiejeMenor) {

        super(NombreFigura.ELIPSE);
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
    }

    @Override
    public String toString() {
        return String.format("%S, %d, %d", nombreFigura, semiejeMayor, semiejeMenor);
    }
    protected double calcularArea() {
        return Math.PI * semiejeMayor * semiejeMenor;
    }
    protected double calcularPerimetro() {
        return Math.PI * (( 3 * (semiejeMenor + semiejeMayor) -
                Math.sqrt((3 * semiejeMenor + semiejeMayor) + (semiejeMenor + 3 * semiejeMayor) )));
    }
}
