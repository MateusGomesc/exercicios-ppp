package Lab7.exercicio2;

public class Paragraph implements DocumentElement{
    public void accept(Visitor v){
        v.visit(this);
    }
}
