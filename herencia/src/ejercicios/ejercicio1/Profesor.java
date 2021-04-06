package ejercicios.ejercicio1;

import java.time.LocalDate;

public class Profesor extends Persona {
    private SituacionLaboral situacionLaboral;
    private double sueldoAnual;

    public Profesor(String nombrePersona, String telefono, LocalDate fechaNacimiento, Sexo sexo,
                    SituacionLaboral situacionLaboral, double sueldoAnual) {
        super(nombrePersona, telefono, fechaNacimiento, sexo);
        this.situacionLaboral = situacionLaboral;
        this.sueldoAnual = sueldoAnual;
    }

    public SituacionLaboral getSituacionLaboral() {
        return situacionLaboral;
    }

    public void setSituacionLaboral(SituacionLaboral situacionLaboral) {
        this.situacionLaboral = situacionLaboral;
    }

    public double getSueldoAnual() {
        return sueldoAnual;
    }

    public void setSueldoAnual(double sueldoAnual) {
        this.sueldoAnual = sueldoAnual;
    }

    public double obtenerSueldoMensual () {
        return sueldoAnual / 12.0;
    }
    //: PROFESOR INTERINO, Francisco Lerma García, 14 años, HOMBRE y teléfono 666112233, con sueldo mensual de 1800 €
    @Override
    public String toString() {
        return String.format("PROFESOR %s, %s, con sueldo mensual %.2f €",
                situacionLaboral, super.toString(), obtenerSueldoMensual());
    }

    public static void main(String[] args) {
        Profesor profesor = new Profesor("Agustín Cañerio", "123456789",
                LocalDate.of(1990, 9, 25), Sexo.HOMBRE,
                SituacionLaboral.FIJO, 25_000);
        System.out.println(profesor);
    }
}
