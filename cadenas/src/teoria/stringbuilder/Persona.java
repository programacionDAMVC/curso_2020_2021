package teoria.stringbuilder;

public class Persona { //POO

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String direccion;

    public Persona(String nombre, String apellido1, String apellido2, String dni, String direccion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /*@Override
    public String toString() {
        //NOMBRE: apellidos, nombre
        //DNI: dni
        //DIRECCION: direccion
        return "NOMBRE: " + apellido1 + " " + apellido2 + ", " + nombre + "\n" + "DNI: " + dni + "\n" +
                "DIRECCION: " + direccion;
    }*/

   /* @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NOMBRE: ");
        stringBuilder.append(apellido1);
        stringBuilder.append(' ');
        stringBuilder.append(apellido2);
        stringBuilder.append(", ");
        stringBuilder.append(nombre);
        stringBuilder.append('\n');
        stringBuilder.append("DNI: ");
        stringBuilder.append(dni);
        stringBuilder.append('\n');
        stringBuilder.append("DIRECCIÓN: ");
        stringBuilder.append(direccion);
        return stringBuilder.toString();
    }*/

    @Override
    public String toString() {
        return String.format( "NOMBRE: %s %s, %s%nDNI: %s%nDIRECCIÓN: %s",
                apellido1, apellido2, nombre, dni, direccion  );
    }
}
