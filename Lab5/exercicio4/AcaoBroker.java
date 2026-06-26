package Lab5.exercicio4;

public class AcaoBroker {
    private String nomeCorretora;

    public AcaoBroker(String nomeCorretora){
        this.nomeCorretora = nomeCorretora;
    }

    public void comprar(String investidor, String codigoAcao, double preco){
        System.out.println("[" + nomeCorretora + "] Executando compra para " + investidor);
    }

    public void vender(String investidor, String codigoAcao, double preco){
        System.out.println("[" + nomeCorretora + "] Executando venda para " + investidor);
    }
}
