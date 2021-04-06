package teoria.interfaces.figuras;

public class Elipse implements Figura {

    protected int semiejeMayor;
    protected int semiejeMenor;

    public Elipse(int semiejeMayor, int semiejeMenor) {

     //   super(NombreFigura.ELIPSE);
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
    }

    @Override
    public String toString() {
        return String.format("%S, %d, %d", getNombreFigura(), semiejeMayor, semiejeMenor);
    }

    @Override
    public double calcularArea() {
        return PI * semiejeMayor * semiejeMenor;
    }

    @Override
    public NombreFigura getNombreFigura() {
        return NombreFigura.ELIPSE ;
    }

    @Override
    public double calcularPerimetro() {
        return PI * (( 3 * (semiejeMenor + semiejeMayor) -
                Math.sqrt((3 * semiejeMenor + semiejeMayor) + (semiejeMenor + 3 * semiejeMayor) )));
    }


}
