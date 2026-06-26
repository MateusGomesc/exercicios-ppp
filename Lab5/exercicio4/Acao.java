package Lab5.exercicio4;

import java.util.ArrayList;

public class Acao extends Subject {
    private String codigo;
    private double preco;
    private ArrayList<Observer> investidores;

    public Acao(String codigo, double preco){
        this.codigo = codigo;
        this.preco = preco;
        this.investidores = new ArrayList<Observer>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        System.out.println("[MERCADO] O preço da ação " + codigo + " mudou para R$" + preco);
        this.preco = preco;
        notificarInvestidores(this);
    }
}
