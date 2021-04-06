package teoria.introduccion.automoviles;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String fabricante, String modelo, int cilindrada) {
        super(2, fabricante, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String toString() {
        return String.format("%s, MOTOCICLETA  cilindrada %d", new Object[] { super.toString(),
                Integer.valueOf(this.cilindrada) });
    }
}
