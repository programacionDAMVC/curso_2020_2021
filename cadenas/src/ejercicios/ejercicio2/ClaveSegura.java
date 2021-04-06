package ejercicios.ejercicio2;

import java.util.Random;

public class ClaveSegura {
    private String claveSegura;

    public ClaveSegura(String claveSegura) {
        this.claveSegura = claveSegura;
    }

    public ClaveSegura() {
    }

    public String getClaveSegura() {
        return claveSegura;
    }

    public void setClaveSegura(String claveSegura) {
        this.claveSegura = claveSegura;
    }

    //método que se llame esClaveSegura
    public static boolean esClaveSegura(String claveATestear) { // 6yY)pppppp
        boolean tieneAlmenos8Caracteres    = claveATestear.length() >= 8; //y}¡H6jaQ true tamaño 8
        boolean tieneAlmenosLetraMinuscula = claveATestear.matches(".*[a-zñáéíóúü]+.*"); //y}¡H6jaQ false
        boolean tieneAlmenosLetraMayuscula = claveATestear.matches(".*[A-ZÁÉÍÓÚÜÑ]+.*"); //y}¡H6jaQ false
        boolean tieneAlmenosNumero         = claveATestear.matches(".*[0-9]+.*"); //y}¡H6jaQ false
   //     boolean tieneAlmenosNoAlfaNumerico = claveATestear.matches(".*[\\W_]+.*"); //y}¡H6jaQ false
        boolean tieneAlmenosNoAlfaNumerico = claveATestear.matches(".*[^a-zñáéíóúüA-ZÁÉÍÓÚÜÑ0-9]+.*"); //y}¡H6jaQ false
        return tieneAlmenos8Caracteres && tieneAlmenosLetraMayuscula && tieneAlmenosLetraMinuscula
                && tieneAlmenosNoAlfaNumerico && tieneAlmenosNumero;
    }

    public static String getPosibleClave() {
        //fuente de caracteres
        final String  FUENTE_CARACTERES = "abcdefghijklmnñopqrstuvwxyzABCDEFEGHIJKLMNÑ" +
                "OPQRSTUVWXYZ¿?()=@.:,;!¡&{}012456789";
        //Generará un número aleatorio entre 8 y 12 (exclusivo), que determinará el tamaño de la clave.
        int tamannoClave1 = 8 + (int) (Math.random() * 4); //una forma de hacerlo
        int tammnnoClave2 = 8 + new Random().nextInt(4); //otra forma de hacerlo
        System.out.printf("Tamaño de la clave: %d%n", tamannoClave1);
        //generamos tantos número aleatorios como valor tiene el tamaño de clave
        //guardamos posiciones en un StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < tamannoClave1; i++) {
            int posicionElegida = new Random().nextInt(FUENTE_CARACTERES.length());
            /*System.out.printf("Posición elegida %d, caracter que corresponde %c%n",
                    posicionElegida, FUENTE_CARACTERES.charAt(posicionElegida));*/
            stringBuilder.append(FUENTE_CARACTERES.charAt(posicionElegida));
        }
        String posibleClave = stringBuilder.toString();
        System.out.printf("Posible clave segura: %s%n", posibleClave );
        return posibleClave;
    }

    public static void main(String[] args) {
        String claveSegura = "111591aÁ,";
        System.out.println(esClaveSegura(claveSegura));
    }
}
