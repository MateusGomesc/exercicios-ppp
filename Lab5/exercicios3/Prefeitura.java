package Lab5.exercicios3;

public class Prefeitura implements Observer{
    private Double umidade;

    @Override
    public void update(Double dado) {
        this.umidade = dado;
    }

    public void alerta(){
        System.out.println("Umidade relativa do ar nos dados da prefeitura: " + this.umidade);
    }
}
