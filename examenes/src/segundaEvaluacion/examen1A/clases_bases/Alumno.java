package segundaEvaluacion.examen1A.clases_bases;

public class Alumno {

    private String nombreAlumno;
    private String apellidosAlumno;
    private int edad;

    public Alumno(String nombreAlumno, String apellidosAlumno, int edad) {
        this.nombreAlumno = nombreAlumno;
        this.apellidosAlumno = apellidosAlumno;
        this.edad = edad;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public void setApellidosAlumno(String apellidosAlumno) {
        this.apellidosAlumno = apellidosAlumno;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esMayorEdad () {
        return edad >= 18;
    }

    @Override
    public String toString() {
        //APELLIDOS: apellidos alumno, NOMBRE: nombre alumno, MAYOR DE EDAD:
        //(TRUE o FALSE)
        return String.format("APELLIDOS: %s, NOMBRE: %s, MAYOR DE EDAD: %B" ,
                apellidosAlumno, nombreAlumno, esMayorEdad());
    }
    public static boolean validarEdad (int edad) {
        return edad >= 16 && edad <= 40;
    }
}
