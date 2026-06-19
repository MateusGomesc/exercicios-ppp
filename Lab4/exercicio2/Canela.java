package Lab4.exercicio2;

public class Canela extends CafeDecorator{
    public Canela(Cafe c){
        super(c);
    }

    public String getDescricao(){
        return super.cafe.getDescricao() + "canela";
    }

    public double calculaCusto(){
        return super.cafe.calculaCusto() + 2;
    }
}
