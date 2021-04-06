package ejercicios;

import java.util.Scanner;

public class TestLibro {
    //no olvidar main, tecleamos main y el IDE sugiere dicho método
    public static void main(String[] args) {
        //creo un objeto o instancia de la clase Libro usando el constructor y la palabra new
        //voy a leer por Scanner los datos para crear un objeto Libro, NO lo pedía el ejercicio pero
        //repasamos Scanner
        Scanner sc = new Scanner(System.in);
        //indicamos al usuario que introduzca titulo, autor e isbn
        //sout me expande a System.out.println
        System.out.println("Introduce el título del libro:");
        String titulo = sc.nextLine(); //uso nextLine para poder leer mas de una palabra, ej El Quijote
        System.out.println("Introduce autor:");
        String autor = sc.nextLine(); //nextLine por el motivo anterior
        System.out.println("Introduce ISBN:");
        String isbn = sc.nextLine(); //podía usar next pero ya da igual, mejor nextLine
        //cierro el Scanner, no lo uso mas
        sc.close();
        //creamos ya el objeto
        Libro libro = new Libro(titulo, autor, isbn);  //el orden es importante, debe coincidir con los
        //parametros del constructor
        //Vamos a sacar los datos a consola como si fuera los campos de un fichero csv (campos separados por comas)
        //El Quijote, Miguel de Cervantes, 01234567891   por ejemplo, pudiera ser de otra forma
        //usamos souf como atajo de teclado para System.out.printf
        System.out.printf("%s, %s, %s%n", libro.getTitulo(), libro.getAutor(), libro.getIsbn());
        //no puedo obtener directamente los atributos, son privados, debo usar los getters
        //corremos el programa
    }
}
