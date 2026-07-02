package Lab7.exercicio2;

public class ContagemVisitor implements Visitor{
    @Override
    public void visit(Paragraph p) {
        System.out.println("Contando palavras de paragrafo");
    }

    @Override
    public void visit(Image i) {
        System.out.println("Contando palavras de imagem");
    }

    @Override
    public void visit(Table t) {
        System.out.println("Contando palavras de tabela");
    }
}
