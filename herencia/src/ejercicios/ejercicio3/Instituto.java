package ejercicios.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombreInstituto;
    private List<Profesor> claustro = new ArrayList<>();

    public String getNombreInstituto() {
        return nombreInstituto;
    }

    public List<Profesor> getClaustro() {
        return claustro;
    }

    public void setNombreInstituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }

    public boolean annadirProfesor (Profesor profesor) {

        return claustro.add(profesor);
    }
    public void mostrarClaustro () {
        System.out.println(nombreInstituto.toUpperCase());
        for (Profesor profesor: claustro) {
            System.out.printf("%-12s %-12s %-12s %-12s%n", profesor.getApellido1(), profesor.getApellido2(),
                            profesor.getNombrePersona(), profesor.getMateria());
        }
    }
    public boolean eliminarProfesor (String dni) {
        for (Profesor profesor: claustro ) {
            if (profesor.getDni().equalsIgnoreCase(dni))
                return claustro.remove(profesor);
        }
        return false;
    }
    public boolean ampliarContratoProfesor (String dni, int ampliacion) {
        for (Profesor profesor: claustro) {
            //si coincide del dni y es profesor interino
            if (profesor.getDni().equalsIgnoreCase(dni) && profesor instanceof ProfesorInterino) {
               int mesesContratoActual =  ((ProfesorInterino) profesor).getMesesContrato();
                System.out.printf("Contrato actual del profesor %s %s, %s es %d%n",
                        profesor.getApellido1(), profesor.getApellido2(),
                        profesor.getNombrePersona(), ((ProfesorInterino) profesor).getMesesContrato());
               int nuevoContrato = mesesContratoActual + ampliacion;
               if (nuevoContrato > 12)
                   nuevoContrato = 12;
               ((ProfesorInterino) profesor).setMesesContrato(nuevoContrato);
                System.out.printf("Contrato ampliado del profesor %s %s, %s es %d%n",
                        profesor.getApellido1(), profesor.getApellido2(),
                        profesor.getNombrePersona(), ((ProfesorInterino) profesor).getMesesContrato());
               return true;
            }
        }
        return false;
    }
    public double calcularSueldosNetos (double retencion) {
        double sueldos = 0;
        for (Profesor profesor: claustro) {
           sueldos += profesor.devolverSueldoNeto(retencion);
        }
        return sueldos;
    }

}
