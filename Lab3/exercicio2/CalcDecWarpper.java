package Lab3.exercicio2;

public class CalcDecWarpper implements Calculadora{
    private CalcDec calculadora;

    public CalcDecWarpper(CalcDec calculadora){
        this.calculadora = calculadora;
    }

    @Override
    public int somar(int a, int b) {
        return this.calculadora.soma(a,b);
    }

    @Override
    public int subtrair(int a, int b) {
        return this.calculadora.sub(a,b);
    }

    @Override
    public int multiplicar(int a, int b) {
        return this.calculadora.mult(a,b);
    }
}
