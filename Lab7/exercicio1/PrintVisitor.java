package Lab7.exercicio1;

public class PrintVisitor implements Visitor{
    @Override
    public void visit(Carro c) {
        System.out.println(c.getMarca() + " " + c.getModelo() + " " + c.getCor());
    }

    @Override
    public void visit(Bicicleta b) {
        System.out.println("Bicicleta " + b.getCor());
    }

    @Override
    public void visit(Onibus o) {
        System.out.println("Onibus " + o.getAno() + " com " + o.getLugares() + " lugares");
    }
}
