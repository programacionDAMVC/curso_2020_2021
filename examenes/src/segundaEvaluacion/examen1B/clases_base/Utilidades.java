package segundaEvaluacion.examen1B.clases_base;

/**
 * clase utiliddes
 * @author manuel
 * @version 1.0.0
 */
public class Utilidades {
    /**
     * validación
     * @param cif a validar
     * @return true si solo si el cif tiene una letra y siete dígitos
     */
    public static boolean validarCIF (String cif) {
        return cif.matches("[A-Za-z][0-9]{7}");
    }

    /**
     * validación código
     * @param codigo a validar
     * @return true si solo si el código tiene siete 0 y 1 y parida correcta
     */
    public static boolean validarCodigo(String codigo) {
        return validarFormato(codigo) && validarParidad(codigo);
    }

    private static boolean validarParidad(String codigo) { //101010 0  100001 1
        String paridad = codigo.substring(codigo.length() - 1); // 0 1
        String subcodigo = codigo.substring(0, codigo.length() - 1); //101010 100001
        int contadorUnos = 0;
        for (int i = 0; i < subcodigo.length(); i++) {
            if (subcodigo.charAt(i) == '1')
                contadorUnos++;
        }
        int modulo = contadorUnos % 2;  //101010 modulo da 1 y la paridad 0
                                        //100001 modulo da 0 y la paridad 1
        return ! (modulo + "").equals(paridad);
    }

    private static boolean validarFormato(String codigo) {
        return codigo.matches("[01]{7}");
    }

   /* public static void main(String[] args) {
       // System.out.println(validarCIF("Zz1234567"));
      //  System.out.println(validarFormato("0101010"));
       // System.out.println(validarParidad("0101211"));
        System.out.println(validarCodigo("0101111"));
    }*/
}
