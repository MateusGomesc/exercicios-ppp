package Lab4.exercicio1;

public class Tomate extends PizzaDecorator{
    public Tomate(Pizza p){
        super(p);
    }

    public String getDescricao(){
        String msg = super.pizza.getDescricao();
        return msg + " com tomate";
    }

    public double getPreco(){
        return 10 + super.pizza.getPreco();
    }
}
