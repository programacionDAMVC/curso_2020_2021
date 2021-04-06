package teoria.com.iesvirgendelcarmen.modificadores;

import teoria.com.iesvirgendelcarmen.modificadores.amistoso.Amistosa;

public class Test2 extends Amistosa{
    public Test2(String variable) {
        super(variable);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2("hi");
        Amistosa amistosa = new Amistosa("hola");
       /*amistosa.setVariable("hello");  //accesibilidad package
       amistosa.variable = "bye-bye";  accesibilidad privada
       System.out.println(amistosa.getVariable()); //accesibilidad package   */
        //NO SE VEN PORQUE SU ACCESIBILIDAD NO ES PÚBLICA
        //ES A NIVEL DE PACKAGE
        test2.saludar();
    }
}
