package Lab3.exercicio2;

public class CalcBinWrapper implements Calculadora{
    private CalcBin calculadora;

    public CalcBinWrapper(CalcBin calculadora){
        this.calculadora = calculadora;
    }

    @Override
    public int somar(int a, int b) {
        return Integer.parseInt(calculadora.somar(String.format("%d", a), String.format("%d", b)));
    }

    @Override
    public int subtrair(int a, int b) {
        return Integer.parseInt(calculadora.subtrair(String.format("%d", a), String.format("%d", b)));
    }

    @Override
    public int multiplicar(int a, int b) {
        return 0;
    }
}
