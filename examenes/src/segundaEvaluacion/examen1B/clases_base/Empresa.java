package segundaEvaluacion.examen1B.clases_base;

public class Empresa {
    private String nombreEmpresa;
    private String cif;
    private String localidad;

    public Empresa(String nombreEmpresa, String cif, String localidad) {
        this.nombreEmpresa = nombreEmpresa;
        this.cif = cif;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", cif, nombreEmpresa, localidad);
    }
}
