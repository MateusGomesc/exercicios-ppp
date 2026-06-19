package Lab4.exercicio1;

public class Ovo extends PizzaDecorator{
    public Ovo(Pizza p){
        super(p);
    }

    public String getDescricao(){
        String msg = super.pizza.getDescricao();
        return msg + " com ovo";
    }

    public double getPreco(){
        return 5 + super.pizza.getPreco();
    }
}
