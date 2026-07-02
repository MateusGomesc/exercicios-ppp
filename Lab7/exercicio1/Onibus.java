package Lab7.exercicio1;

public class Onibus implements Veiculo{
    private int lugares;
    private int ano;

    public Onibus(int lugares, int ano){
        this.lugares = lugares;
        this.ano = ano;
    }

    public void accept(Visitor v){
        v.visit(this);
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
