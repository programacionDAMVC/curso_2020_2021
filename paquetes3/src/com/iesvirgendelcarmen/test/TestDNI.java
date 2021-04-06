package com.iesvirgendelcarmen.test;

import com.iesvirgendelcarmen.dni.UtilidadesDNI;

import static com.iesvirgendelcarmen.dni.UtilidadesDNI.devolverLetraDNI;
import static com.iesvirgendelcarmen.dni.UtilidadesDNI.validadNumeroDNI;

public class TestDNI {
       public static void main(String[] args) {

        System.out.println(validadNumeroDNI("1234567"));
        System.out.println(validadNumeroDNI("12345678"));
        System.out.println(validadNumeroDNI("123456789"));
        System.out.println(validadNumeroDNI("1234a678"));

        String dni1 = "12345678";
        String dni2 = "111111111";
        if (validadNumeroDNI(dni1))
            System.out.println(UtilidadesDNI.devolverLetraDNI(dni1));
        else
            System.out.println("DNI NO VÁLIDO");

        if (validadNumeroDNI(dni2))
            System.out.println(devolverLetraDNI(dni2));
        else
            System.out.println("DNI NO VÁLIDO");
    }
}
