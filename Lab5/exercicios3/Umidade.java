package Lab5.exercicios3;

public class Umidade extends Subject{
    private Double umidade;


    public Double getUmidade() {
        return umidade;
    }

    public void setUmidade(Double umidade) {
        this.umidade = umidade;
        notifyObserver(umidade);
    }
}
