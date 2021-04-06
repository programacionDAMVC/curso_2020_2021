package ejercicios.ejercicio1;

import java.time.LocalDate;

public class Estudiante extends Persona {
    private Estudios estudios;

    public Estudiante(String nombrePersona, String telefono, LocalDate fechaNacimiento, Sexo sexo,
                      Estudios estudios) {
        super(nombrePersona, telefono, fechaNacimiento, sexo);
        this.estudios = estudios;
    }

    public Estudios getEstudios() {
        return estudios;
    }

    public void setEstudios(Estudios estudios) {
        this.estudios = estudios;
    }
    //: ESTUDIANTE de BACHILLERATO, Francisco Lerma García, 14 años, HOMBRE y teléfono 666112233


    @Override
    public String toString() {
        return String.format("ESTUDIANTE de %s, %s", estudios, super.toString());
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("luisa perales", "123456789",
                LocalDate.of(2010, 11,11), Sexo.MUJER, Estudios.FP);
        System.out.println(estudiante);
        //no lo pide el ejercicio, pero es un ejemplo del alcance de los métodos con la referencia estudiante:
        System.out.printf("%s, estudia %s ¿Es mayor de edad? %b",
                estudiante.getNombrePersona(), estudiante.getEstudios(), estudiante.esMayorEdad());
    }
}
