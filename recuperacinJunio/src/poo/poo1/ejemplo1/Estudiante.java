package poo.poo1.ejemplo1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Estudiante {

    //atributos
    private String nombreEstudiante;
    private String apellidosEstudiante;
    private LocalDate fechaNacimiento;
    private Curso cursoMatriculado;
    private Modulo[] moduloMatriculados;
    //constructor

    public Estudiante(String nombreEstudiante, String apellidosEstudiante, LocalDate fechaNacimiento,
                      Curso cursoMatriculado, Modulo[] moduloMatriculados) {
        this.nombreEstudiante = nombreEstudiante;
        this.apellidosEstudiante = apellidosEstudiante;
        this.fechaNacimiento = fechaNacimiento;
        this.cursoMatriculado = cursoMatriculado;
        this.moduloMatriculados = moduloMatriculados;
    }
    //constructor pro defecto
    public Estudiante () {}

    //getters y setters

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidosEstudiante() {
        return apellidosEstudiante;
    }

    public void setApellidosEstudiante(String apellidosEstudiante) {
        this.apellidosEstudiante = apellidosEstudiante;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Curso getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(Curso cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public Modulo[] getModuloMatriculados() {
        return moduloMatriculados;
    }

    public void setModuloMatriculados(Modulo[] moduloMatriculados) {
        this.moduloMatriculados = moduloMatriculados;
    }

    //toString


    @Override
    public String toString() {
        return String.format("%s,%s,%d/%d/%d,%s,%s", apellidosEstudiante, nombreEstudiante, fechaNacimiento.getDayOfMonth(),
                fechaNacimiento.getMonthValue(), fechaNacimiento.getYear(), cursoMatriculado,
                Arrays.toString(moduloMatriculados));
    }

    //método que me diga si el objeto es mayor o menor de edad:
    public boolean esMayorEdad() {
        //creamos un objeto Period
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        int annosTranscurridos = periodo.getYears();
        return annosTranscurridos >= 18;
    }


}
