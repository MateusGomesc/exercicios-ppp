package Lab7.exercicio2;

public class Main {
    public static void main(){
        DocumentElement paragrafo = new Paragraph();
        DocumentElement image = new Image();
        DocumentElement table = new Table();

        Visitor htmlVisitor = new HTMLVisitor();
        Visitor pdfVisitor = new PDFVisitor();
        Visitor contagemVisitor = new ContagemVisitor();

        paragrafo.accept(htmlVisitor);
        image.accept(htmlVisitor);
        table.accept(htmlVisitor);

        paragrafo.accept(pdfVisitor);
        image.accept(pdfVisitor);
        table.accept(pdfVisitor);

        paragrafo.accept(contagemVisitor);
        image.accept(contagemVisitor);
        table.accept(contagemVisitor);
    }
}
