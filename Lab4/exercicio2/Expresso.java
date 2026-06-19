package Lab4.exercicio2;

public class Expresso implements Cafe{

    @Override
    public String getDescricao() {
        return "Expresso com os adicionais: ";
    }

    @Override
    public double calculaCusto() {
        return 8;
    }
}
