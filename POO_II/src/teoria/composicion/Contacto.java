package teoria.composicion;

public class Contacto {

    private String nombreContacto;
    private String numeroTelefono;

    public Contacto(String nombreContacto, String numeroTelefono) {
        this.nombreContacto = nombreContacto;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return String.format("NOMBRE: %s, TELÉFONO: %s", nombreContacto, numeroTelefono);
    }

    public static boolean validarNumeroTelefono (String numero) {
        return numero.matches("^[6-9][0-9]{8}$");
    }

    public static void main(String[] args) {
        System.out.println(validarNumeroTelefono("808722410"));
    }
}
