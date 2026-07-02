package Lab6.exercicio2;

public class Online extends Pedido{

    public Online(String metodoPagamento){
        super(metodoPagamento);
    }

    @Override
    boolean processarPagamento() {
        if(metodoPagamento.equals("dinheiro")) return false;
        System.out.println("Realizando pagamento via " + metodoPagamento);
        return true;
    }

    @Override
    void decidirEntrega() {
        System.out.println("Entrega enviada para o endereço solicitado...");
    }
}
