package Lab3.exercicio2;

public class Main {
    static void main(){
        Calculadora bin = new CalcBinWrapper(new CalcBin());
        Calculadora dec = new CalcDecWarpper(new CalcDec());

        System.out.println(bin.somar(11111, 100000));
        System.out.println(bin.subtrair(11111, 100000));
        System.out.println(dec.somar(1,2));
        System.out.println(dec.subtrair(1,2));
        System.out.println(dec.multiplicar(1,2));
    }
}
