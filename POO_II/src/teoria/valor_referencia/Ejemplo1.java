package teoria.valor_referencia;
//paso de parámetro de tipo primitivo
public class Ejemplo1 {
    public static int variableGlobal = 2;
    public static void main(String[] args) {
        System.out.printf("Valor de la variable antes de llamar al método %d%n", variableGlobal);
        doblar(variableGlobal);
        System.out.printf("Valor de la variable despueś de llamar al método %d%n", variableGlobal);
    }
    public static void doblar (int variable) {
        System.out.printf("Valor de la variable en el método antes de computar %d%n", variable);
        variable *=2;
        System.out.printf("Valor de la variable en el método después de computar %d%n", variable);
    }
}
