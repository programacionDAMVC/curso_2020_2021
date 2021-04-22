package ejercicio1;

import java.util.Objects;

public class NumeroNatural implements Comparable<NumeroNatural>{

    private int valor;  //sus valores van desde 1 en adelante

    public NumeroNatural(int valor) throws NoNaturalException {
        //si cumple la condición de nº natural creo el objeto
      //  this.valor = valor;
        //sino lanzo la execpeción
        //lo hacemos al revés, si no cumple la condición lanzo la excepción
        //sino continúa el programa
        if( valor <= 0 )
            throw new NoNaturalException();
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroNatural that = (NumeroNatural) o;
        return valor == that.valor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    @Override
    public int compareTo(NumeroNatural numeroNatural) {
        return  numeroNatural.valor - valor ;
    }

    @Override
    public String toString() {
        return String.format("%d", valor);
    }
}
