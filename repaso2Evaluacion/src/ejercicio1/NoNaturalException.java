package ejercicio1;

public class NoNaturalException extends Exception {
    @Override
    public String getMessage() {
        return "No es un número natural";
    }
}
