package com.iesvirgendelcarmen.dni;

public class UtilidadesDNI {

    //método que se le pasa como parámetro un dni sin letra, ochos números
    //validar que son ocho números, ni mas, ni menos y nada de letras
    public static boolean validadNumeroDNI (String dni) {
        //si no tiene 8 caracteres devolvemos false
        if (dni.length() != 8)
            return false;
        //recorremos la cadena, usamos Character.isDigit
        //si encontramos un caracter que no sea dígito, devolvemos false en ese momento
        //devolvemos true
        for (int i = 0; i < dni.length(); i++) {
            if (! Character.isDigit(dni.charAt(i)) )
                return false;
        }
        return  true;  //cambiamos al final
       // return dni.matches("^[0-9]{8}$]"); como lo haremos con regex mas adelante
    }

    //método que se le pasa un dni válido (8 dígitos) y devuelve la letra
    public static char devolverLetraDNI (String sDNI) {
        //aseguro el método
        if (! validadNumeroDNI(sDNI))
            return ' ';
        //convertir sDNI a entero iDNI
        int iDNI = Integer.parseInt(sDNI);
        //calcular el resto de dividir iDNI entre 23
        int resto = iDNI % 23;
        String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
        //seleccionamos el caracter en función del índice de cadena
        return cadena.charAt(resto); //cambiamos al final
    }

//    public static void main(String[] args) {
////        System.out.println(validadNumeroDNI("1234567"));
////        System.out.println(validadNumeroDNI("12345678"));
////        System.out.println(validadNumeroDNI("123456789"));
////        System.out.println(validadNumeroDNI("1234a678"));
//        System.out.println(devolverLetraDNI("12345678"));
//        System.out.println(devolverLetraDNI("111111111"));
//
//
//    }
}
