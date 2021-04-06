package ejercicios.ejercicio2;

public class NoBinarioException extends Exception{
    @Override
    public String getMessage() {
        return "no es un valor en binario";
    }
}
