package teoria;

public class Constructores {
    private String atributo;

    public Constructores(String atributo) {
        this.atributo = atributo;
    }

    public Constructores() {

    }

    public Constructores(String atributo, boolean mayuscula) {
        if (mayuscula) {
            this.atributo = atributo.toUpperCase();
        } else {
            this.atributo = atributo.toLowerCase();
        }
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }
}
