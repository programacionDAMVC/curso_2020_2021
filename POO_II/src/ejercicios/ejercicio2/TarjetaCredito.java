package ejercicios.ejercicio2;

import java.time.LocalDate;

/**
 * <h3>Clase que crea objetos Tarjeta de crédito</h3>
 * @author Manuel
 * @version 1.0.0
 */
public class TarjetaCredito {

    private String nombreTitular;
    private String numeroTarjeta;
    private LocalDate fechaCreacion = LocalDate.now();
    //private LocalDate fechaCreacion;

    /**
     * constructor de la clase
     * @param nombreTitular el titular de la cuenta de tipo String
     * @param numeroTarjeta el número de cuenta de tipo String
     */
    public TarjetaCredito(String nombreTitular, String numeroTarjeta) {

        this.nombreTitular = nombreTitular;
        this.numeroTarjeta = numeroTarjeta;
     //   this.fechaCreacion = LocalDate.now();
    }

    /**
     * getter del atributo titular
     * @return el nombre del titular
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     * setter del atributo titular
     * @param nombreTitular
     */
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    /**
     * getter nº de tarjeta, de tipo String
     * @return el nº de tarjeta
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * setter de número de tarjeta
     * @param numeroTarjeta
     */
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    /**
     * getter de la fecha de creación
     * @return fecha de creación, objeto LocalDate
     */
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    //consideramos
    /*public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }*/

    /**
     * @return representación en String de la referencia, ejemplo
     * JUANITO PÉREZ
     * 123456
     * Fecha de validez: 02/25
     */
    @Override
    public String toString() {
        LocalDate fechaValidez = fechaCreacion.plusYears(4);
      //  fechaValidez = fechaValidez.plusMonths(9); para probar meses como 10, 11 ó 12
        int iMesValidez = fechaValidez.getMonthValue();
        String sMesValidez = iMesValidez + "";
        if (iMesValidez < 10)
            sMesValidez = "0" + sMesValidez;
        return String.format("%S%n%s%nFecha de validez: %s/%d", nombreTitular, numeroTarjeta,
                sMesValidez , fechaValidez.getYear() % 100);
    }

    /**
     * método auxiliar para saber la validez de la tarjeta
     * @param numero de la tarjeta a validar
     * @return true si y solo si el  número de tarjeta es válido de
     * acuerdo al algoritmo de Luhn
     */
    public static boolean validarNumeroTarjeta (String numero) {
        //si no tiene 16 dígitos, devuelvo false y no continuo.
        if (! numero.matches("^[0-9]{16}$"))
            return false;
        //planteo el algoritmo de Luhn
        //viene 0123 ... X
        //le doy la vuelta X ... 321 uso StringBuilder y el método reverse y lo vuelvo a String
        StringBuilder stringBuilder = new StringBuilder(numero);
        stringBuilder.reverse();
        String numeroAlReves =  stringBuilder.toString();
        int suma = 0;
        for (int i = 0; i < numeroAlReves.length(); i++) {
            if (i % 2 == 0) {// las posiciones pares
               suma += numeroAlReves.charAt(i) - 48;  //'0' tiene valor decimal 48, '1' 49, '2' 50 ....
            } else {
                int sumando = (numeroAlReves.charAt(i) - 48) * 2;
                if (sumando < 10)
                    suma += sumando;
                else
                    suma += 1 + sumando % 10;
            }
        }
        return suma % 10 == 0;
        //tips:  hacer el de abajo y comprobar aquí arriba
    }

    /**
     * método auxiliar para saber la validez de la tarjeta
     * @param numero de la tarjeta a validar
     * @return true si y solo si el  número de tarjeta es válido de
     * acuerdo al algoritmo de Luhn
     */
    public static boolean validarNumeroTarjeta1 (String numero) {
        //si no tiene 16 dígitos, devuelvo false y no continuo.
        if (!numero.matches("^[0-9]{16}$"))
            return false;
        //suponemos que llega 0123456789012345 (dieciséis dígitos)
        //le quito el de controlo 012345678901234 con substring
        //lo envío al método calcularDigitoControl y me devuelve la cifra última
        //¿Cuando es la correcta la tarjeta? si 012345678901234 + DC es igual a 0123456789012345
        String numeroSinDC = numero.substring(0, numero.length() -1);
        String digitoControl = Helper.calcularDigitoControl(numeroSinDC);
        return (numeroSinDC + digitoControl).equals(numero);
    }

    /**
     * clase interna para proveer método auxiliares
     * relacionados con la tarjeta de crédito
     */
    public static class Helper {
        private Helper() {
        }

        /**
         * método que nos averigua el digito de control de una posible tarjeta
         * @param numero15Cifras
         * @return el digito de control como tipo String
         */

        public static String calcularDigitoControl(String numero15Cifras) {
            //si no tiene 15 dígitos, devuelvo false y no continuo.
            if (! numero15Cifras.matches("^[0-9]{15}$"))
                return null;
            StringBuilder stringBuilder = new StringBuilder(numero15Cifras);
            stringBuilder.reverse();
            String numeroAlReves =  stringBuilder.toString();
            int suma = 0;
            for (int i = 0; i < numeroAlReves.length(); i++) {
                if (i % 2 != 0) {// las posiciones pares
                    suma += numeroAlReves.charAt(i) - 48;  //'0' tiene valor decimal 48, '1' 49, '2' 50 ....
                } else {
                    int sumando = (numeroAlReves.charAt(i) - 48) * 2;
                    if (sumando < 10)
                        suma += sumando;
                    else
                        suma += 1 + sumando % 10;
                }
            }
            return (10 - suma % 10) + "";
        }
    }
}
