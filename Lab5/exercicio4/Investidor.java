package Lab5.exercicio4;

public class Investidor implements Observer{
    private String nome;
    private double limiteMinimo;
    private double limiteMaximo;
    private AcaoBroker broker;

    public Investidor(String nome, double limiteMinimo, double limiteMaximo, AcaoBroker acaoBroker){
        this.nome = nome;
        this.limiteMaximo = limiteMaximo;
        this.limiteMinimo = limiteMinimo;
        this.broker = acaoBroker;
    }

    @Override
    public void update(Acao acao) {
        double preco = acao.getPreco();

        System.out.println("[Investidor: " + nome + "] Analisando " + acao.getCodigo() + " a R$" + preco);

        if(preco >= limiteMaximo){
            System.out.println(" -> Limite Maximo (R$" + limiteMaximo + ") atingido! Vendendo ação.");
            broker.vender(this.nome, acao.getCodigo(), preco);
        }
        else if (preco <= limiteMinimo) {
            System.out.println("  -> Limite Minimo (R$" + limiteMinimo + ") atingido! Comprando ação.");
            broker.comprar(this.nome, acao.getCodigo(), preco);
        }
    }
}
