package teoria.caracteres;

public class Utilidades {
    //clave es segura si tiene al menos 8 caracteres, minúscula, mayúscula, número, no alfanumérico
    public static boolean esClaveSegura(String clave) {
        return contieneAlMenos8caracteres(clave) && contieneMinuscula(clave) && contieneMayuscula(clave)
                && contieneNumero(clave) && contieneNoAlfaNumerico(clave);
    }

   private static boolean contieneNoAlfaNumerico(String clave) {
       for (int i = 0; i < clave.length(); i++) {
           if (!Character.isLetterOrDigit(clave.charAt(i))) //no letra o dígito
               return true;
       }
       return false;
    }

    private static boolean contieneNumero(String clave) {
        for (int i = 0; i < clave.length(); i++) {
            if (Character.isDigit(clave.charAt(i)))
                return true;
        }
        return false;
    }

    private static boolean contieneMayuscula(String clave) {
        for (int i = 0; i < clave.length(); i++) {
            if (Character.isUpperCase(clave.charAt(i)))
                return true;
        }
        return false;
    }

    private static boolean contieneMinuscula(String clave) {
        boolean minuscula = false;
        for (int i = 0; i < clave.length(); i++) {
            if(Character.isLowerCase(clave.charAt(i))) {
                minuscula = true;
                break;
            }
        }
        return minuscula;
    }

    private static boolean contieneAlMenos8caracteres(String clave) {
        return clave.length() >= 8;
    }

    public static void main(String[] args) {
        String clave = "è{12Aaa1111";
        System.out.printf("La clave %s ¿tiene 8 caracteres? %b%n", clave, contieneAlMenos8caracteres(clave));
        System.out.printf("La clave %s ¿tiene minúscula? %b%n", clave, contieneMinuscula(clave));
        System.out.printf("La clave %s ¿tiene mayúscula? %b%n", clave, contieneMayuscula(clave));
        System.out.printf("La clave %s ¿tiene dígito? %b%n", clave, contieneNumero(clave));
        System.out.printf("La clave %s ¿no tiene dígito ni letra? %b%n", clave, contieneNoAlfaNumerico(clave));
        System.out.printf("La clave %s ¿es segura? %B%n", clave, esClaveSegura(clave));
    }
}
