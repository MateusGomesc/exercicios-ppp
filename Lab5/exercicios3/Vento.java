package Lab5.exercicios3;

public class Vento extends Subject{
    private Double velocidade;

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
        notifyObserver(velocidade);
    }
}
