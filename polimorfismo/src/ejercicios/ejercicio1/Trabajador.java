package ejercicios.ejercicio1;

public abstract class Trabajador {
    private String nombre;
    private String apellidos;

    public Trabajador(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public String obtenerNombreCompleto() {
        return String.format("%S, %S", apellidos, nombre);
    }

    public abstract double obtenerSueldoMensual(int diasTrabajados);
}
