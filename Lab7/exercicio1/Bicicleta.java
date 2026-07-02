package Lab7.exercicio1;

public class Bicicleta implements Veiculo{
    private String cor;

    public Bicicleta(String cor){
        this.cor = cor;
    }

    public void accept(Visitor v){
        v.visit(this);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
