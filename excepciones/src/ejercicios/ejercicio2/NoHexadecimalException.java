package ejercicios.ejercicio2;

public class NoHexadecimalException extends Exception {
    @Override
    public String getMessage() {
        return "formato hexadecimal erróneo";
    }
}
