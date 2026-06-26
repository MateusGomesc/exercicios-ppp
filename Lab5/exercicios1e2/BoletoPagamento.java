package Lab5.exercicios1e2;

public class BoletoPagamento extends PagamentoStrategy{
    @Override
    void pagamento(Double valor) {
        System.out.println("Pagando " + valor + " via Boleto...");
    }
}
