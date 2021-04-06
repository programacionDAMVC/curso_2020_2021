package teoria.listas;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean esMayorEdad () {
        Period period = Period.between(fechaNacimiento, LocalDate.now());
        return period.getYears() >= 18;
    }

    @Override
    public String toString() {
        return String.format("NOMBRE: %S, fecha de nacimiento %d/%d/%d",
                nombre, fechaNacimiento.getDayOfMonth(), fechaNacimiento.getMonthValue(),
                fechaNacimiento.getYear());
    }
}
