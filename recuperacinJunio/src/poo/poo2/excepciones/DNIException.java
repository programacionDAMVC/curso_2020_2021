package poo.poo2.excepciones;

public class DNIException extends Exception {
    @Override
    public String getMessage() {
        return "DNI no válido";
    }
}
