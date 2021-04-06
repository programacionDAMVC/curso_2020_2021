package teoria.excepciones_propias;

public class NoTrianguloRectanguloException extends Exception {
    @Override
    public String getMessage() {
        return "No triángulo rectángulo";
    }
}
