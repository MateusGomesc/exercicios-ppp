package Lab5.exercicios1e2;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Item> items;
    private PagamentoStrategy pagamentoStrategy;
    private FreteStrategy freteStrategy;

    public Carrinho(PagamentoStrategy pagamentoStrategy, FreteStrategy freteStrategy){
        this.items = new ArrayList<Item>();
        this.pagamentoStrategy = pagamentoStrategy;
        this.freteStrategy = freteStrategy;
    }

    public void adicionaItem(Item i){
        items.add(i);
    }

    public void removeItem(String nome){
        Item i = null;
        for(Item item : items){
            if(item.getNome().equals(nome)){
                i = item;
                break;
            }
        }
        if(i == null){
            items.remove(i);
        }
    }

    public Double calculaTotal(){
        Double soma = 0.00;
        for(Item item : items){
            soma += item.getValor();
        }
        return soma;
    }

    public Double calculaFrete(){
        return this.freteStrategy.frete();
    }

    public void realizaPagamento(){
        pagamentoStrategy.pagamento(calculaTotal() + calculaFrete());
    }
}
