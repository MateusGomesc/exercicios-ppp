package Lab7.exercicio2;

public class HTMLVisitor implements Visitor{
    @Override
    public void visit(Paragraph p) {
        System.out.println("Convertendo paragrafo para html");
    }

    @Override
    public void visit(Image i) {
        System.out.println("Convertendo imagem para html");
    }

    @Override
    public void visit(Table t) {
        System.out.println("Convertendo tabela para html");
    }
}
