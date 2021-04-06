package ejercicios.ejercicio1;

/**
 * .....
 * @author .....
 * @version .....
 */
public class Tecnico extends Trabajador{
    private static final double PAGA_DIARIA = 200;
    private Titulacion titulacion;

    /**
     * ................
     * @param nombre .....
     * @param apellidos .......
     * @param titulacion .......
     */
    public Tecnico(String nombre, String apellidos, Titulacion titulacion) {
        super(nombre, apellidos);
        this.titulacion = titulacion;
    }

    /**
     * ......
     * @return ............
     */
    public Titulacion getTitulacion() {
        return titulacion;
    }

    /**
     * ........
     * @param diasTrabajados ....
     * @return .............
     */
    @Override
    public double obtenerSueldoMensual(int diasTrabajados) {
        return PAGA_DIARIA * diasTrabajados;
    }
}
