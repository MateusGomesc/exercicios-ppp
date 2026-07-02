package Lab7.exercicio1;

public interface Visitor {
    void visit(Carro c);
    void visit(Bicicleta b);
    void visit(Onibus o);
}
