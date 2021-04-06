package teoria.com.iesvirgendelcarmen.modificadores;


import teoria.com.iesvirgendelcarmen.modificadores.amistoso.Amistosa;

public class Test1 {
    public static void main(String[] args) {
       Amistosa amistosa = new Amistosa("hola");
       /*amistosa.setVariable("hello");  //accesibilidad package
       amistosa.variable = "bye-bye";  accesibilidad privada
       System.out.println(amistosa.getVariable()); //accesibilidad package   */
       //NO SE VEN PORQUE SU ACCESIBILIDAD NO ES PÚBLICA
        //ES A NIVEL DE PACKAGE
       // amistosa.saludar(); lo podría mediante herencia
    }
}
