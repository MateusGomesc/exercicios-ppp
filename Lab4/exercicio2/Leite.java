package Lab4.exercicio2;

public class Leite extends CafeDecorator{
    public Leite(Cafe c){
        super(c);
    }

    public String getDescricao(){
        return super.cafe.getDescricao() + "leite ";
    }

    public double calculaCusto(){
        return super.cafe.calculaCusto() + 4;
    }
}
