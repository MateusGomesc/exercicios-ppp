package Lab7.exercicio1;

public class Main {
    public static void main(){
        Carro c = new Carro("Chevrolet", "Classic", "prata");
        Bicicleta b = new Bicicleta("vermelha");
        Onibus o = new Onibus(25, 2011);

        Visitor pv = new PrintVisitor();
        Visitor mv = new MessageVisitor();

        c.accept(pv);
        b.accept(pv);
        o.accept(pv);

        c.accept(mv);
        b.accept(mv);
        o.accept(mv);
    }
}
