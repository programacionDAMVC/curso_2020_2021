package ejercicios.ejercicio3;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor{
    private int mesesContrato;

    public ProfesorInterino(String dni, String nombrePersona, String apellido1, String apellido2, LocalDate fechaNacimiento,
                            double sueldoMensual, Materia materia, int mesesContrato) {
        super(dni, nombrePersona, apellido1, apellido2, fechaNacimiento, sueldoMensual, materia);
        this.mesesContrato = mesesContrato;
    }

    public int getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    @Override
    public String toString() {
        return String.format("%s, %d", super.toString(), mesesContrato);
    }
}
