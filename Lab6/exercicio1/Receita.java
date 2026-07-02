package Lab6.exercicio1;

abstract public class Receita {
    private final String nome;

    public Receita(String nome){
        this.nome = nome;
    }

    abstract void prepararBebida();
    abstract void adicionaCondimentos();

    public void aquecerAgua(){
        System.out.println("Aquecendo a agua...");
    }

    public void colocarNaXicara(){
        System.out.println("Colocando " + this.nome + " na xicara...");
    }

    public void fazerBebida(){
        this.aquecerAgua();
        this.prepararBebida();
        this.colocarNaXicara();
        this.adicionaCondimentos();
    }
}
