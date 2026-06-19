package Lab4.exercicio4;

public class CarroFachada {
    private Motor motor;
    private Cinto cinto;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public CarroFachada(Motor m, Cinto c, Porta p, Farol f, Radio r){
        this.motor = m;
        this.cinto = c;
        this.porta = p;
        this.farol = f;
        this.radio = r;
    }

    public static void main(){
        CarroFachada c = new CarroFachada(new Motor(), new Cinto(), new Porta(), new Farol(), new Radio());
        c.dirigir();
        c.desligar();
    }

    void dirigir(){
        System.out.println("Vamos dirigir o carro...");
        motor.ligar();
        porta.travar();
        cinto.travar();
        farol.ascender();
        radio.ligar();
        radio.sintonizar(98.9F);
        System.out.println();
    }

    void desligar(){
        System.out.println("Vamos desligar o carro...");
        motor.desligar();
        porta.destravar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
        System.out.println();
    }
}
