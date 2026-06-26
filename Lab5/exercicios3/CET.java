package Lab5.exercicios3;

public class CET {
    public static void main(){
        Umidade u = new Umidade();
        Vento v = new Vento();
        Prefeitura p = new Prefeitura();
        Aeroporto a = new Aeroporto();
        u.registerObserver(p);
        v.registerObserver(a);
        u.setUmidade(0.98);
        v.setVelocidade(11.07);
        p.alerta();
        a.alerta();
    }
}
