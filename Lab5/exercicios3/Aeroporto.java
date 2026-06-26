package Lab5.exercicios3;

public class Aeroporto implements Observer{
    private Double vento;

    @Override
    public void update(Double dado) {
        this.vento = dado;
    }

    void alerta(){
        System.out.println("Velocidade do vento nos dados do aeroporto: " + this.vento);
    }
}
