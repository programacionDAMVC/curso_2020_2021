package teoria.abstractas.ejemplo1;

public abstract class C  extends A{
    protected void decirAlgo() {
        System.out.println("lo que sea");
    }

    @Override
    protected abstract void despedirse();
}
