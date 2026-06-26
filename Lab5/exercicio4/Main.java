package Lab5.exercicio4;

public class Main {
    public static void main(){
        AcaoBroker b3 = new AcaoBroker("B3");

        Acao mp = new Acao("Mercado pago", 30);

        Investidor i = new Investidor("Mateus", 25, 35, b3);

        mp.registrarInvestidor(i);

        mp.setPreco(31.05);
        mp.setPreco(24.05);
    }
}
