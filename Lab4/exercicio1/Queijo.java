package Lab4.exercicio1;

public class Queijo extends PizzaDecorator{
    public Queijo(Pizza p){
        super(p);
    }

    public String getDescricao(){
        String msg = super.pizza.getDescricao();
        return msg + " com queijo";
    }

    public double getPreco(){
        return 15 + super.pizza.getPreco();
    }
}
