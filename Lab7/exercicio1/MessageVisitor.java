package Lab7.exercicio1;

public class MessageVisitor implements Visitor{
    @Override
    public void visit(Carro c) {
        System.out.println("Favor atualizar os dados do IPVA");
    }

    @Override
    public void visit(Bicicleta b) {
        System.out.println("Comemore no parque no dia do ciclismo");
    }

    @Override
    public void visit(Onibus o) {
        System.out.println("Atenção para atualização das licenças");
    }
}
