package ejercicios.ejercicio1;

/**
 * clase que representa objetos de tipo trabajador
 * @author ....
 * @version ....
 */
public class Oficial extends Trabajador{
    private static final double PAGA_DIARIA = 100;
    private Grado clase;

    /**
     * constructor
     * @param nombre  .........
     * @param apellidos  ............
     * @param clase ........
     */
    public Oficial(String nombre, String apellidos, Grado clase) {
        super(nombre, apellidos);
        this.clase = clase;
    }

    /**
     *
     * @return la clase .....
     */
    public Grado getClase() {
        return clase;
    }

    /**
     *
     * @param diasTrabajados  ....
     * @return  .......
     */
    @Override
    public double obtenerSueldoMensual(int diasTrabajados) {
        return PAGA_DIARIA * diasTrabajados;
    }
}
