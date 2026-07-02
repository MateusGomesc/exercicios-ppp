package Lab6.exercicio1;

public class Capuccino extends Receita{
    public Capuccino(){
        super("capuccino");
    }

    @Override
    void prepararBebida() {
        System.out.println("Preparando capuccino...");
    }

    @Override
    void adicionaCondimentos() {
        System.out.println("Adicionando condimentos no capuccino...");
    }
}
