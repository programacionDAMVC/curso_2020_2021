package ejercicios.ejercicio3;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor{
    private LocalDate fechaIncorporacion;

    public ProfesorTitular(String dni, String nombrePersona, String apellido1, String apellido2, LocalDate fechaNacimiento,
                           double sueldoMensual, Materia materia, LocalDate fechaIncorporacion) {
        super(dni, nombrePersona, apellido1, apellido2, fechaNacimiento, sueldoMensual, materia);
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", super.toString(), fechaIncorporacion);
    }

    @Override
    public double devolverSueldoNeto(double retencion) {

        return super.devolverSueldoNeto(retencion) + 100.0 * Auxiliar.calcularTrienios(fechaIncorporacion);
    }
}
