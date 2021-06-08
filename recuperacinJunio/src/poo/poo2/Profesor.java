package poo.poo2;

import poo.poo2.excepciones.DNIException;

import java.time.LocalDate;
import java.time.Period;

public class Profesor extends Persona{
    private LocalDate fechaIncorporacion;

    public Profesor(String nombreCompletoPersona, String dni,
                    LocalDate fechaNacimiento, LocalDate fechaIncorporacion) throws DNIException {
        super(nombreCompletoPersona, dni, fechaNacimiento);
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Profesor(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    @Override
    public String toString() {
        return String.format("%S,%d/%d/%d", super.toString(), fechaIncorporacion.getDayOfMonth(),
                fechaIncorporacion.getMonthValue(), fechaIncorporacion.getYear());
    }

    public int calcularAnnosTrabajados() {
        return Period.between(fechaIncorporacion, LocalDate.now()).getYears();
    }
}
