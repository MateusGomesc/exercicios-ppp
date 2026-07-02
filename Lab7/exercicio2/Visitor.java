package Lab7.exercicio2;

public interface Visitor {
    void visit(Paragraph p);
    void visit(Image i);
    void visit(Table t);
}
