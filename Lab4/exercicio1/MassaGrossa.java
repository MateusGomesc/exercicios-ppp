package Lab4.exercicio1;

public class MassaGrossa implements Pizza{

    @Override
    public String getDescricao() {
        return "Pizza com massa fina";
    }

    @Override
    public double getPreco(){
        return 30;
    }
}
