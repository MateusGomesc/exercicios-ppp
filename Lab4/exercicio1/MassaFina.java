package Lab4.exercicio1;

public class MassaFina implements Pizza{

    @Override
    public String getDescricao() {
        return "Pizza de massa fina";
    }

    @Override
    public double getPreco(){
        return 20;
    }
}
