package poo.test;

import poo.poo1.Curso;
import poo.poo1.Estudiante;
import poo.poo1.Modulo;

import java.time.LocalDate;

public class TestEstudiante {
    public static void main(String[] args) {
        String nombreEstudiante = "alberto";
        String apellidosEstudiante = "moreno padilla";
        LocalDate fechaNac = LocalDate.of(2010, 10, 31);
        Curso cursoMat = Curso.SEGUNDO_CURSO_DAM;
        Modulo[] moduloMatriculados = new Modulo[] {Modulo.BD, Modulo.FOL, Modulo.PR};
        //creamos un objeto Estudiante
        Estudiante estudiante1 = new Estudiante(nombreEstudiante, apellidosEstudiante, fechaNac, cursoMat, moduloMatriculados);
        //sout(objeto estudiante)
        System.out.println(estudiante1);
        System.out.printf("¿Es mayor de edad? %b%n", estudiante1.esMayorEdad());
        //nuevo estudiante usando el constructor por defecto
        //usando setters inicializamos atributos
        System.out.println();  //del nuevo estudiante
        //preguntamos si es mayor o menor de edad
    }
}
