package ejercicios;

public class Palabra {

    private String contenido;

    public Palabra(String contenido) {
        this.contenido = contenido;
    }
    //Un metodo que devuelva la palabra con todas la lestras en mayúscula
    public String getContenidoMayuscula () {
        return contenido.toUpperCase();
    }
    //Un metodo que devuelva la palabra con todas la lestras en minúscula
    public String getContenidoMinuscula () {
        return contenido.toLowerCase();
    }
    //Un metodo que devuelva el numero de letras que tiene dicha palabra.
    public int obtenerNumeroLetras(){
        return contenido.length();
    }
    //Un metodo que reemplace las letras de la palabra
    public String reemplazarLetras(char viejo, char nuevo) {
        return contenido.replace(viejo, nuevo);
    }
    //Un metodo que devuelva la primera letra de la palabra
    public char obtenerPrimeraLetra() {
        if (contenido.length() == 0)
            return ' ';
        return contenido.charAt(0);
    }
    //Un metodo que devuelva la ultima letra de la palabra en mayuscula
    public char obtenerUltimaLetraMayuscula() {
        if (contenido.length() == 0)
            return ' ';
        return contenido.toUpperCase().charAt(contenido.length() - 1);  //h(0)o(1)l(2)a(3) hola.length() = 4
    }

}
