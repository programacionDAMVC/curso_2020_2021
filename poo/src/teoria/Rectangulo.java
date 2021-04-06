package teoria;

public class Rectangulo {

    private int alto = 1;
    private int ancho = 2;

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getArea() {
        return alto * ancho;
    }
}
