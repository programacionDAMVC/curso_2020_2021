package segundaEvaluacion.examen1A.clases_bases;

public class Profesor {

    private String nombreProfesor;
    private String apellidosProfesor;
    private boolean practico;
    private String codigoDocencia;

    public Profesor(String nombreProfesor, String apellidosProfesor, boolean practico, String codigoDocencia) {
        this.nombreProfesor = nombreProfesor;
        this.apellidosProfesor = apellidosProfesor;
        this.practico = practico;
        this.codigoDocencia = codigoDocencia;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public String getApellidosProfesor() {
        return apellidosProfesor;
    }

    public boolean isPractico() {
        return practico;
    }

    public String getCodigoDocencia() {
        return codigoDocencia;
    }

    @Override
    public String toString() {
        return String.format("APELLIDOS: %s, NOMBRE: %s, PRÁCTICO: %b",
                apellidosProfesor, nombreProfesor, practico);
    }

    public static boolean validarCodigoDocencia (String codigoDocencia) {
        return codigoDocencia.matches("^[A-Ca-c]-?[0-9]{3,4}$");
    }

    /*public static void main(String[] args) {
        System.out.println(validarCodigoDocencia("a12113"));
    }*/
}
