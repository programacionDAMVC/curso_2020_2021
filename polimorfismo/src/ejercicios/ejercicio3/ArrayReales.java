package ejercicios.ejercicio3;

public class ArrayReales implements Estadisticas{

    private double[] datos;

    public ArrayReales(double[] datos) {
        this.datos = datos;
    }

    public double[] getDatos() {
        return datos;
    }

    @Override
    public int obtenerNumeroValores() {
        return datos.length;
    }

    @Override
    public double obtenerValorMinimo() {
        double valorMinimo = Double.MAX_VALUE;
        for (double dato: datos) {
            if (dato < valorMinimo)
                valorMinimo = dato;
        }
        return valorMinimo;
    }

    @Override
    public double obtenerValorMaximo() {
        double valorMaximo = Double.MIN_VALUE;
        for (double dato: datos) {
            if (dato > valorMaximo)
                valorMaximo = dato;
        }
        return valorMaximo;    }

    @Override
    public double calcularSuma() {
        double suma = 0;
        for (double dato: datos) {
            suma += dato;
        }
        return suma;
    }

    @Override
    public double calcularValorMedio() {
        return calcularSuma() / obtenerNumeroValores();
    }

    @Override
    public double calcularDesviacionTipica() {
        double valorMedio = calcularValorMedio(); //solamente llamamos  una vez al método calcularValorMedio
        double suma = 0;
        for (double dato: datos) {
            suma += Math.pow(dato - valorMedio, 2);
        }
        return Math.sqrt(suma / (obtenerNumeroValores() - 1));
    }


}
