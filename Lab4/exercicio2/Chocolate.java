package Lab4.exercicio2;

public class Chocolate extends CafeDecorator{
    public Chocolate(Cafe c){
        super(c);
    }

    public String getDescricao(){
        return super.cafe.getDescricao() + "chocolate ";
    }

    public double calculaCusto(){
        return super.cafe.calculaCusto() + 5;
    }
}
