package teoria;

public class Circulo1 {

    private float radio;

    public Circulo1(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getLongitud (){
        return (float) (2 * Math.PI * radio);
    }

    public float getArea() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }
}
