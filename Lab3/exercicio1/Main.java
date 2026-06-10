package Lab3.exercicio1;

public class Main {
    public static void main(){
        Ave v1 = new PatoWrapper(new PatoDomestico());
        Ave v2 = new PavaoWrapper(new PavaoAzul());

        v1.emitirSom();
        v2.emitirSom();

        v1.voar();
        v2.voar();
    }
}
