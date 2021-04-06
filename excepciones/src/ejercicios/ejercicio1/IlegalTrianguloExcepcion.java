package ejercicios.ejercicio1;

public class IlegalTrianguloExcepcion extends Exception {
    @Override
    public String getMessage() {
        return "Triángulo incorrecto";
    }
}
