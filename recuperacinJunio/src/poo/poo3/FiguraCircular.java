package poo.poo3;

public class FiguraCircular implements Figura {
    protected float semiejeMayor;
    protected float semiejeMenor;
    protected String nombreFiguraGeometrica;

    public FiguraCircular(float semiejeMayor, float semiejeMenor) {
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
    }

    @Override
    public float calcularPerimetro() {
        return (float) (2 * Math.PI * Math.sqrt((semiejeMayor * semiejeMayor + Math.pow(semiejeMenor, 2)) / 2));
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * semiejeMayor * semiejeMenor);
    }

    @Override
    public String getNombreFiguraGeometrica() {
        return nombreFiguraGeometrica;
    }


}
