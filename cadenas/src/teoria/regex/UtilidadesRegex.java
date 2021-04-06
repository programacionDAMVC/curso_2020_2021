package teoria.regex;

import java.time.LocalDate;

public class UtilidadesRegex {
    //validar número naturales del 0 en adelante
    public static boolean esNumeroNatural(String sNumeroValidar) {
        return sNumeroValidar.matches("[0-9]+");
    }
    //validar números enteros negativos:  ...., -25, -24, ...., -2, -1,
    public static boolean esNumeroNegativo(String sNumeroEnteroNegativo) {
       // return sNumeroEnteroNegativo.matches("-[0-9]+");
        return sNumeroEnteroNegativo.matches("-[1-9][0-9]*");
    }
    //validar números enteros ..., -25, -24, ...., -2, -1, 0, 1, 2 ...., 56, ....
    public static boolean esNumeroEntero(String sNumeroEntero) {
       // return esNumeroNatural(sNumeroEntero) || esNumeroNegativo(sNumeroEntero);
        return sNumeroEntero.matches("[0-9]+|-[1-9][0-9]*");
    }
    //validar nº reales: 23.2333, -23.2333, 0.256, -0.256, 26, 0, -26,   .266, -.266, 3., .??
    //Los número reales abarcan a los números enteros, es decir un entero es un número real también
    public static boolean esNumeroRealSinNotacionCientifica(String sNumeroReal) {
        return sNumeroReal.matches("-?[0-9]+\\.[0-9]+|[0-9]+|-[1-9][0-9]*");
    }
    //validar notación científica: 2e10, -2.2e-25, -2e2, 2.3e-5
    public static boolean esNotacionCientifica(String sNumero) {
        //notación científica: numeroReal e numeroEntero
        return sNumero.matches("(-?[0-9]+\\.[0-9]+|[0-9]+|-[1-9][0-9]*)e([0-9]+|-[1-9][0-9]*)");
    }
    public static boolean esNumeroReal (String sNumero) {
        return esNumeroRealSinNotacionCientifica(sNumero) || esNotacionCientifica(sNumero);
    }
    //validar dni: 12345678letra 12345678-letra

    public static boolean validarFormatoDNI (String dni) { //12345678l 12345678-l
      //  return dni.matches("[0-9]{8}-?[a-zA-Z]");
        return dni.toLowerCase().matches("[0-9]{8}-?[a-z]");
    }
    //fechas:  dd/mm/yyyy dd-mm-yyyy dd mm yyyy
    public static boolean validarFormatoFecha1(String fecha) {
        return fecha.matches("[0-9]{2}[/ -][0-9]{2}[/ -][0-9]{4}");
    }
    //fechas: d/m/yyyy dd/m/yyyy d/mm/yyyy dd/mm/yyyy tb - y espacio en blanco y años desde 0 en adelante
    public static boolean validarFormatoFecha2(String fecha) {
        return fecha.matches("[0-9]{1,2}[/ -][0-9]{1,2}[/ -][0-9]{1,4}");
    }
    //controlamos los días que van desde 1, 2, ..., 9, 10, 11, ..., 19, 20, ..., 29, 30, 31, 01, 02, 03, ..09
    //controlamos los meses que van desde 1, 2, 3, ...., 10, 11, 12, 01, 02, ..., 09
    public static boolean validarFormatoFecha3(String fecha) {
        String regexDias  = "([1-9]|[12][0-9]|3[01]|0[1-9])";
        String regexMeses = "([1-9]|1[0-2]|0[1-9])";
        return fecha.matches( regexDias + "[/ -]" + regexMeses + "[/ -][0-9]{1,4}");
    }
    //controlamos los meses con 30, 28 y 31
    //31 día para enero (1), marzo(3), mayo(5), julio(7), agosto(8), octubre(10), diciembre(12)
    //30 días abril(4), junio(6), septiembre(9), noviembre(11)
    //29 y 28 días febrero(2)
    public static boolean validarFormatoFecha4(String fecha) {
        String meses31 = "([1-9]|[12][0-9]|3[01]|0[1-9])[/ -](0?[13578]|1[02])[/ -][0-9]{1,4}";
        String meses30 = "([1-9]|[12][0-9]|30|0[1-9])[/ -](0?[469]|11)[/ -][0-9]{1,4}";
        String febreroBisiesto = "([1-9]|[12][0-9]|0[1-9])[/ -](0?2)[/ -][0-9]{1,4}";
        String febreroNoBisiesto = "([1-9]|1[0-9]|2[0-8]|0[1-9])[/ -](0?2)[/ -][0-9]{1,4}";
        String febrero = esBisiesto(fecha) ? febreroBisiesto : febreroNoBisiesto;
        String regex   = meses31 + "|" + meses30 + "|" + febrero;
        return  fecha.matches(regex);
    }

    private static boolean esBisiesto(String fecha) {
        String[] tokens = fecha.split("[/ -]");   //ejemplo 12-12-2000  ["12", "12", "2000"]
        if (fecha.matches("[0-9]{1,2}[/ -][0-9]{1,2}[/ -][0-9]{1,4}") &&
                tokens[1].matches("0?2")) {
            int iAnno = Integer.parseInt(tokens[2]);
            if (iAnno < 1583) //cuando se aceptó el calendario Gregoriano, aparecen años bisiestos a partir de 1583
                return false;
            //averiguamos si es fin de siglo: 1600, 1700, ..., 2000, 2100, .....
            if ( iAnno % 100 == 0 ) //fin de siglo
                return iAnno / 100 % 4 == 0; //bisiesto si las dos primeras sean divisibles por 4: 2000, 2400
            return  Integer.parseInt(tokens[2]) % 4 == 0;  //comprobación de resto de años
        }
        return false;
    }

    //MÉTODO PÚBLICO QUE NOS DEVUELVA UN LOCALDATE DADA LA FECHA PARSEADA
    //dia/mes/año dia-mes-año dia mes año
    public static LocalDate crearFecha1 (String fecha) {  //devolver LocalDate.of(año, mes, día)  parámetros son int
        if (!validarFormatoFecha4(fecha))
            return null;
        String[] tokens = fecha.split("[/ -]");  //ej dia/mes/año
        int iDia  = Integer.parseInt(tokens[0]);
        int iMes  = Integer.parseInt(tokens[1]);
        int iAnno = Integer.parseInt(tokens[2]);
        return LocalDate.of(iAnno, iMes, iDia);
    }
    public static LocalDate crearFecha2 (String fecha) {  //devolver LocalDate.of(año, mes, día)  parámetros son int
        if (!validarFormatoFecha4(fecha))
            return null;
        String[] tokens = fecha.split("[/ -]");  //ej dia/mes/año
        StringBuilder stringBuilder = new StringBuilder();
        int digitosAnno = tokens[2].length();
        for (int i = digitosAnno; i < 4; i++) {
            stringBuilder.append('0');
        }
        stringBuilder.append(tokens[2]);  //año
        stringBuilder.append('-');
        if (tokens[1].length() == 1)
            stringBuilder.append('0');
        stringBuilder.append(tokens[1]); //mes
        stringBuilder.append('-');
        if (tokens[0].length() == 1)
            stringBuilder.append('0');
        stringBuilder.append(tokens[0]); //día
        return LocalDate.parse(stringBuilder.toString());  //año-mes-día
    }


}
