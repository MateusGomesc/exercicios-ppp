package Lab3.exercicio1;

public class PatoWrapper implements Ave{
    private Pato pato;

    PatoWrapper(Pato pato){
        this.pato = pato;
    }

    @Override
    public void voar() {
        pato.voar();
    }

    @Override
    public void emitirSom() {
        pato.grasnar();
    }
}
