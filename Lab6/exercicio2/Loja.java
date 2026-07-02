package Lab6.exercicio2;

public class Loja {
    public static void main(){
        Item i1 = new Item("Monitor LG", 899.90);
        Item i2 = new Item("Mouse Logitech", 69.90);

        Pedido p1 = new Online("Criptomoeda");
        Pedido p2 = new Presencial("dinheiro");

        p1.adicionarItem(i1);
        p2.adicionarItem(i1);
        p2.adicionarItem(i2);

        p1.fecharPedido();
        p2.fecharPedido();
    }
}
