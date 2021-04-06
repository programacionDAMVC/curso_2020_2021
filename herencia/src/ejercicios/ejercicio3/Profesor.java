package ejercicios.ejercicio3;

import java.time.LocalDate;

public class Profesor extends Persona{

    enum Materia {
        SISTEMAS_INFORMATICOS, ENTORNOS_DE_DESARROLLO, LENGUAJES_DE_MARCAS,
        PROGRAMACION, EMPRESAS, BASE_DE_DATOS
    }

    private double sueldoMensual;
    private Materia materia;

    public Profesor(String dni, String nombrePersona, String apellido1, String apellido2, LocalDate fechaNacimiento,
                    double sueldoMensual, Materia materia) {
        super(dni, nombrePersona, apellido1, apellido2, fechaNacimiento);
        this.sueldoMensual = sueldoMensual;
        this.materia = materia;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return String.format("%s, %.2f, %s", super.toString(), sueldoMensual, materia);
    }

    public double devolverSueldoNeto (double retencion) {
        return sueldoMensual - retencion * sueldoMensual / 100.0;
    }


}
