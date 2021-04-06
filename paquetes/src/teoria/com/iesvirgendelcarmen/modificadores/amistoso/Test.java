package teoria.com.iesvirgendelcarmen.modificadores.amistoso;

public class Test {
    public static void main(String[] args) {
        Amistosa amistosa = new Amistosa("hola"); //accesibilidad pública
        amistosa.setVariable("hello"); //accesibilidad package (lo puedo ver porque estoy en el mismo package)
       // amistosa.variable = "bye-bye"; accesibilidad privada
        System.out.println(amistosa.getVariable()); //accesibilidad package (lo puedo ver porque estoy en el mismo package)
        amistosa.saludar();  //aunque sea protected se ve desde el paquete
    }
}
