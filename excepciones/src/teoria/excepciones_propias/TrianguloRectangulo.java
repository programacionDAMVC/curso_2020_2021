package teoria.excepciones_propias;

import teoria.test.TestTrianguloRectangulo;

public class TrianguloRectangulo {
    private double cateto1;
    private double cateto2;
    private double hipotenusa;

    public TrianguloRectangulo(double cateto1, double cateto2, double hipotenusa) throws NoTrianguloRectanguloException {
        if (esTrianguloRectangulo (cateto1, cateto2, hipotenusa)) {
            this.cateto1 = cateto1;
            this.cateto2 = cateto2;
            this.hipotenusa = hipotenusa;
        } else {
            throw new NoTrianguloRectanguloException();
        }
    }

    private static boolean esTrianguloRectangulo(double cateto1, double cateto2, double hipotenusa) {
        return hipotenusa == Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    @Override
    public String toString() {
        return String.format("%.2f;%.2f;%.2f", cateto1, cateto2, hipotenusa);
    }
}
