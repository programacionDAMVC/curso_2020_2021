package ejercicios.ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String nombrePersona;
    private String telefono;
    private LocalDate fechaNacimiento;
    private Sexo sexo;

    public Persona(String nombrePersona, String telefono, LocalDate fechaNacimiento, Sexo sexo) {
        this.nombrePersona = nombrePersona;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    //método que nos dice si el objeto Persona es mayor de edad o no
    public boolean esMayorEdad () {
        return obtenerAnnos() >= 18;
    }


    //toString
    //Francisco Lerma García, 14 años, HOMBRE y teléfono 666112233
    @Override
    public String toString() {
        return String.format("%s, %d años, %s y teléfono %s",
                nombrePersona, obtenerAnnos(), sexo, telefono);
    }

    private int obtenerAnnos() {
        //lógica para calcular los años, usar la clase Period, método between, usar el atributo fecha de nacimiento
        //usar la ficha de hoy Localdate.now() y usar un método de la clase Period que se llama getYeras()
        /*Period period = Period.between(fechaNacimiento, LocalDate.now());
        int annos = period.getYears();
        return annos;*/
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public static void main(String[] args) {
        Persona persona = new Persona("juan peragón", "123456789",
                LocalDate.of(2000, 02, 19), Sexo.HOMBRE);
        System.out.println(persona);
    }
}
