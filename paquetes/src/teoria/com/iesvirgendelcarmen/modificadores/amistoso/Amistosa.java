package teoria.com.iesvirgendelcarmen.modificadores.amistoso;

public class Amistosa {
    //acceso privado
    private  String variable;

    //acceso público
    public Amistosa(String variable) {
        this.variable = variable;
    }

    //acceso amistoso

    String getVariable() {
        return variable;
    }

    void setVariable(String variable) {
        this.variable = variable;
    }

    //acceso mediante herencia
    protected void saludar() {
        System.out.println("hola mundo");
    }
}
