package teoria;

public class Circulo {
    //atributo
    private float radio;
    //constructor
    public Circulo (float radio) {   //new teoria.Circulo(4.5)
        this.radio = radio;
    }

    //getter
    public float getRadio () {
        return radio;
    }
    //setter
    public void setRadio (float radio) {
        this.radio = radio;
    }
    //calcular el perímetro
    public float getLongitud () {
        return (float) (2 * 3.14 * radio);
    }
    //calcular área
    public float getArea () {
        return 3.14f * radio * radio;
    }

}
