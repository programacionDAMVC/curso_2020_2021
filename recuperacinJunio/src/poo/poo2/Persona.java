package poo.poo2;

import poo.poo2.excepciones.DNIException;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombreCompletoPersona;
    private String dni;
    private LocalDate fechaNacimiento;

    public Persona(String nombreCompletoPersona, String dni, LocalDate fechaNacimiento) throws DNIException {
        if (! validadDNI(dni))
            throw new DNIException();
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

    public void setDni(String dni) throws DNIException {
        if (! validadDNI(dni) )
            throw new DNIException();
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
    public static boolean validarFormatoDNI(String dniAValidarFormato) {
        String regexFormatoDNI = "^[0-9]{8}[a-zA-Z]$";
        return dniAValidarFormato.matches(regexFormatoDNI);
    }
    //segundo método que diga que la letra es correcta
    public static boolean validadDNI (String dniAValidar) {
        if ( ! validarFormatoDNI(dniAValidar)) {
            System.out.printf("%s no tiene el formato de DNI%n", dniAValidar);
            return false;
        }
        // 01234567a   longitud: 9, la letra está en la posición 8
        char cLletra = dniAValidar.toUpperCase().charAt(8);
        String sLetra = dniAValidar.substring(8);
        String sNumero = dniAValidar.substring(0,8);
     //   System.out.printf("dni: %s, letra: %s, número: %s%n", dniAValidar, sLetra, sNumero);
        String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
        int iNumero = Integer.parseInt(sNumero);
        int resto = iNumero % 23;
        char letraTabla = tabla.charAt(resto);
        return letraTabla == cLletra;
    }
    //dni válido 11111111h :
}
