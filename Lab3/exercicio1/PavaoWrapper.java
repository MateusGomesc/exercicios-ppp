package Lab3.exercicio1;

public class PavaoWrapper implements Ave{
    private Pavao pavao;

    PavaoWrapper(Pavao pavao){
        this.pavao = pavao;
    }

    @Override
    public void voar() {

    }

    @Override
    public void emitirSom() {
        pavao.cantar();
    }
}
