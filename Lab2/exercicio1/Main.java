package Lab2.exercicio1;

public class Main {
    public static void main(){
        Apple a = Apple.getInstance();
        Samsung s = Samsung.getInstance();

        CelularApple i1 = a.constroiCelular("16e");
        CelularApple i2 = a.constroiCelular("");
        CelularSamsung g1 = s.constroiCelular("");
        CelularSamsung g2 = s.constroiCelular("20");
        CelularSamsung g3 = s.constroiCelular("20");

        i1.fazLigacao();
        i1.tiraFoto();
        i2.fazLigacao();
        i2.tiraFoto();
        g1.fazLigacao();
        g1.tiraFoto();
        g2.fazLigacao();
        g2.tiraFoto();
        g3.fazLigacao();
        g3.tiraFoto();
    }
}
