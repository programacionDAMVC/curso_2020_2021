package ejercicios;

public class Coche {

    private float cantidadCombustible = 5;
    private float consumo = 7;

    public void echarCombustible(float combustible){
        cantidadCombustible += combustible;
    }

    public float getCantidadCombustible() {
        return cantidadCombustible;
    }

    public float calcularKmARecorrer() {
        return cantidadCombustible * 100 / consumo;
    }

}
