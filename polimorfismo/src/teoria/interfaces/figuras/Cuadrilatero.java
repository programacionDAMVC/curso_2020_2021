package teoria.interfaces.figuras;

import java.util.List;

//FIGURA CON CUATRO LADOS
public abstract class Cuadrilatero implements Figura {

    protected int lado1;
    protected int lado2;
    protected int lado3;
    protected int lado4;

    public Cuadrilatero(int lado1, int lado2, int lado3, int lado4) {
     //   super(NombreFigura.CUADRILATERO);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    /*@Override
    public String toString() {
        return String.format("%S, %d, %d, %d, %d", nombreFigura, lado1,
                lado2, lado3, lado4);
    }
*/
    @Override
    public double calcularPerimetro () {
        return lado1 + lado2 + lado3 + lado4;
    }

    //puede aparecer el método de abajo como abstract
    //hace que sea mas legible los métodos que puede acceder esta clase
    /*@Override
    public abstract double calcularArea();*/

    public  NombreFigura getNombreFigura() {
        return NombreFigura.CUADRILATERO;
    }


}
