package Lab6.exercicio2;

public class Presencial extends Pedido{

    public Presencial(String metodoPagamento){
        super(metodoPagamento);
    }

    @Override
    boolean processarPagamento() {
        System.out.println("Realizando pagamento via " + this.metodoPagamento);
        return true;
    }

    @Override
    void decidirEntrega() {
        System.out.println("Não há entrega, pedido já retirado na loja.");
    }
}
