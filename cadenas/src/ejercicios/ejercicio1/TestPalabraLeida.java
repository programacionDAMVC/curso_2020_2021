package ejercicios.ejercicio1;

import java.util.Scanner;

public class TestPalabraLeida {
    public static void main(String[] args) {

        System.out.println("Introduce una palabra");
        Scanner sc = new Scanner(System.in);
        String palabraLeida = sc.nextLine();  //hola mundo
        String[] palabras = palabraLeida.split("\\s+"); // ["hola", "mundo"]
      //  System.out.println(palabras[0]);
        PalabraLeida palabraObjeto =  new PalabraLeida(palabras[0]); // atributo valor sea "hola"
        System.out.println("Introduce otra palabra para comparar");
        palabraLeida = sc.nextLine(); //segunda línea
        palabras = palabraLeida.split("\\s+"); //["segunda", "línea"] usaremos "segunda" para comparar
        System.out.println("Introduce letra a buscar");
        String sLetra = sc.next();  // "a"
        sc.close(); //termina el Scanner
        char cLetra = sLetra.charAt(0); // 'a'
        System.out.printf("%s tiene %d letras%n", palabraObjeto.getValor(), palabraObjeto.obtenerNumeroDeLetras());
        System.out.printf("%s ¿Empieza por vocal? %b%n", palabraObjeto.getValor(), palabraObjeto.empiezaPorVocal() );
        System.out.printf("%s ¿Acaba por vocal? %b%n", palabraObjeto.getValor(), palabraObjeto.acabaEnPorVocal() );
        System.out.printf("%s tiene %d vocales%n", palabraObjeto.getValor(), palabraObjeto.obtenerNumeroDeVocales() );
        System.out.printf("%s ¿Contiene la letra %c? %b%n",
                palabraObjeto.getValor(), cLetra, palabraObjeto.contieneLetra(cLetra) );
        System.out.printf("%s ¿Es igual a %s? %b%n",
                palabraObjeto.getValor(), palabras[0], palabraObjeto.sonIguales(palabras[0]));
        System.out.printf("%s ¿Es un palíndromo? %b%n", palabraObjeto.getValor(), palabraObjeto.esPalindromo());

    }

}
