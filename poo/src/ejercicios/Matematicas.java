package ejercicios;


public class Matematicas {
    //Un metodo que devuelva la raiz cuadrada de un número
    public static double calcularRaizCuadrada(double numero) {
       return Math.sqrt(Math.abs(numero));
    }
    //Un metodo que devuelva la raiz cúbica de dicho un número
    public static double calcularRaizCubica(double numero) {
        return Math.cbrt(numero);
    }
    public static long redondearAbsNumero(double numero) {
       /* if (numero < 0 )
            numero *= -1;*/
        return Math.round(Math.abs(numero));
    }
    public static long generarAleatorio (double numero){
        return Math.round(Math.random() * Math.abs(numero));
    }


}
