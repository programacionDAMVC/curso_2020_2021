package teoria.test_accesibilidad;

import teoria.introduccion.accesibilidad.Accesibilidad;

public class Hija extends Accesibilidad {
    public int devolverValorHeredado () {
        return y;
    }

    @Override
    protected void metodoPrueba() {
        super.metodoPrueba();
    }
}
