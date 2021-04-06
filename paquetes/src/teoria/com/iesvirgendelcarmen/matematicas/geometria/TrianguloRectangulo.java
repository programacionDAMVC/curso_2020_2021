package teoria.com.iesvirgendelcarmen.matematicas.geometria;

public class TrianguloRectangulo {
    private double cateto1;
    private double cateto2;

    public TrianguloRectangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }
    //métodos calcular hipotenusa, área y perímetro
    public double calcularHipotenusa () {
        return Math.hypot(cateto1, cateto2);
    }
    public double calcularArea () {
        return cateto1 * cateto2 / 2.0;
    }
    public double calcularPerimetro () {
        return cateto1 + cateto2 + calcularHipotenusa ();
    }

    @Override
    public String toString() {
        //  return "Triángulo rectángulo de cateto1 " + cateto1 + ", cateto2 " + cateto2 + " e hipotenusa " + calcularHipotenusa() +
        //          "\nÁrea " + calcularArea() + ", perímetro " + calcularPerimetro() ;
        return String.format("Triángulo rectángulo de cateto1 %.2f, cateto2 %.2f e hipotenusa %.2f%nÁrea %.2f y perímetro %.2f%n",
                cateto1, cateto2, calcularHipotenusa(), calcularArea(), calcularPerimetro() );
    }
}
