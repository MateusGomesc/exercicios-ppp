package Lab4.exercicio2;

public class Decaf implements Cafe{
    @Override
    public String getDescricao() {
        return "Descafeinado com os adicionais: ";
    }

    @Override
    public double calculaCusto() {
        return 7;
    }
}
