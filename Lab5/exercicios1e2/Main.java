package Lab5.exercicios1e2;

public class Main {
    public static void main(){
        Carrinho c = new Carrinho(new PixPagamento(), new SedexFrete());
        c.adicionaItem(new Item("Monitor", 600.97));
        c.adicionaItem(new Item("Mouse", 100.00));
        c.realizaPagamento();
    }
}
