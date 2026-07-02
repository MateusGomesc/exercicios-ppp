package Lab6.exercicio1;

public class Cha extends Receita{
    public Cha(){
        super("cha");
    }

    @Override
    void prepararBebida() {
        System.out.println("Preparando o cha...");
    }

    @Override
    void adicionaCondimentos() {
        System.out.println("Adicionando condimentos no cha...");
    }
}
