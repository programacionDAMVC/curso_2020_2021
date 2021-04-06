package teoria.introduccion.automoviles;

public class Vehiculo {

    private int numeroRuedas;
    private String fabricante;
    private String modelo;

    public Vehiculo(int numeroRuedas, String fabricante, String modelo) {
        this.numeroRuedas = numeroRuedas;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public int getNumeroRuedas() {
        return this.numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String toString() {
        return String.format("Vehde %d ruedas, fabricante %s, modelo %s", new Object[] { Integer.valueOf(this.numeroRuedas), this.fabricante, this.modelo });
    }
}
