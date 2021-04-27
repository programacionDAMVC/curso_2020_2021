package teoria.patronSingleton;

public class ClaseInstanciaUnica {

    private static ClaseInstanciaUnica instanciaUnica;

    private ClaseInstanciaUnica() {
    }

    public static ClaseInstanciaUnica getInstance() {
        if (instanciaUnica == null)
            instanciaUnica = new ClaseInstanciaUnica();
        return instanciaUnica;
    }

}

