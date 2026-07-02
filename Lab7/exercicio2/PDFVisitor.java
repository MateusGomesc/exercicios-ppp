package Lab7.exercicio2;

public class PDFVisitor implements Visitor{
    @Override
    public void visit(Paragraph p) {
        System.out.println("Convertendo paragrafo para pdf");
    }

    @Override
    public void visit(Image i) {
        System.out.println("Convertendo imagem para pdf");
    }

    @Override
    public void visit(Table t) {
        System.out.println("Convertendo tabela para pdf");
    }
}
