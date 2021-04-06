package teoria.clases_parametrizadas;

import java.util.ArrayList;
import java.util.List;

public class ClaseParametrizada <T> {

    private List<T> lista = new ArrayList<>();

    public void insertarElemento (T t){
        lista.add(t);
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }
}
