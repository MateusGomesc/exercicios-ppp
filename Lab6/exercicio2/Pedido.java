package Lab6.exercicio2;

import java.util.ArrayList;

abstract public class Pedido {
    protected final String metodoPagamento;
    private ArrayList<Item> itens;

    public Pedido(String metodoPagamento){
        this.metodoPagamento = metodoPagamento;
        this.itens = new ArrayList<Item>();
    }

    abstract boolean processarPagamento();
    abstract void decidirEntrega();

    public void adicionarItem(Item i){
        itens.add(i);
    }

    public void notaFiscal(){
        double sum = 0;
        System.out.println("NOTA FISCAL ----------------------------");
        for(Item i : itens){
            System.out.println(i.getNome() + ": R$" + i.getValor());
            sum += i.getValor();
        }
        System.out.println("----------------------------------------");
        System.out.println("Valor total: R$" + sum);
    }

    public void fecharPedido(){
        this.notaFiscal();
        if(!this.processarPagamento()){
            System.out.println("Erro ao realizar pagamento...");
            return;
        }
        this.decidirEntrega();
    }
}
