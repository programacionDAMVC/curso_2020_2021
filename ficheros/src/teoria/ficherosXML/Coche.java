package teoria.ficherosXML;
//clase POJO
public class Coche {
    private String marca;
    private String modelo;
    private double cilindrada;

    public Coche() {}

    public Coche(String marca, String modelo, double cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%.1f", marca, modelo, cilindrada);
    }
}
