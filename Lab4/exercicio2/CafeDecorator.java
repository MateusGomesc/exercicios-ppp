package Lab4.exercicio2;

public class CafeDecorator implements Cafe{
    protected Cafe cafe;

    public CafeDecorator(Cafe cafe){
        this.cafe = cafe;
    }

    @Override
    public String getDescricao() {
        return this.cafe.getDescricao();
    }

    @Override
    public double calculaCusto() {
        return this.cafe.calculaCusto();
    }
}
