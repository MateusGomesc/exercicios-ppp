package Lab6.exercicio1;

public class Cafe extends Receita{
    public Cafe(){
        super("cafe");
    }

    @Override
    void prepararBebida() {
        System.out.println("Preparando cafe...");
    }

    @Override
    void adicionaCondimentos() {
        System.out.println("Adicionando condimentos no cafe...");
    }
}
