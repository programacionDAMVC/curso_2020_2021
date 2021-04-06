package teoria.VinstanciaVclase;

public class Circulo {

    private float radio;
    public static int numeroCirculos = 0;

    public Circulo(float radio) {
        this.radio = radio;
        numeroCirculos++;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return String.format("Círculo de rádio %.2f", radio);
    }
}
