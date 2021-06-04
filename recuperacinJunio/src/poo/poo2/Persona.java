package poo.poo2;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombreCompletoPersona;
    private String dni;
    private LocalDate fechaNacimiento;

    public Persona(String nombreCompletoPersona, String dni, LocalDate fechaNacimiento) {
        this.nombreCompletoPersona = nombreCompletoPersona;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {
    }

    public String getNombreCompletoPersona() {
        return nombreCompletoPersona;
    }

    public void setNombreCompletoPersona(String nombreCompletoPersona) {
        this.nombreCompletoPersona = nombreCompletoPersona;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean esMayorEdad(){
       /* Period period = Period.between(fechaNacimiento, LocalDate.now());
        return period.getYears() >= 18;*/
       return Period.between(fechaNacimiento, LocalDate.now()).getYears() >= 18;
    }

    @Override
    public String toString() {
        return String.format("%S,%s,%d/%d/%d", nombreCompletoPersona, dni,
                fechaNacimiento.getDayOfMonth(), fechaNacimiento.getMonthValue(), fechaNacimiento.getYear());
    }

    //método valide dni
    //primer método que diga que tiene 8 caracteres y 1 una letra
    //segundo método que diga que la letra es correcta
    //dni válido 11111111h :
}
