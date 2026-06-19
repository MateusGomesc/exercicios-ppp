package Lab4.exercicio3;

public class CinematecaFachada {
    private Amplificador amplificador;
    private Luzes luzes;
    private MaquinaDePipoca maquinaDePipoca;
    private Projetor projetor;
    private PlayerStreamming playerStreamming;
    private Telao telao;

    public CinematecaFachada(Amplificador a, Luzes l, MaquinaDePipoca m, Projetor p, PlayerStreamming ps, Telao t){
        this.amplificador = a;
        this.luzes = l;
        this.maquinaDePipoca = m;
        this.projetor = p;
        this.playerStreamming = ps;
        this.telao = t;
    }

    public static void main(){
        CinematecaFachada c = new CinematecaFachada(new Amplificador(), new Luzes(), new MaquinaDePipoca(), new Projetor(), new PlayerStreamming(), new Telao());
        c.inicioFilme();
        c.fimDeFilme();
    }

    void inicioFilme(){
        System.out.println("Preparando para assistir um filme...");
        maquinaDePipoca.liga();
        maquinaDePipoca.arrebentarPipoca();
        luzes.desliga();
        telao.abaixa();
        projetor.liga();
        amplificador.liga();
        amplificador.ajusteVolume(10);
        playerStreamming.liga();
        playerStreamming.play("Matrix");
        System.out.println();
    }

    void fimDeFilme(){
        System.out.println("Arrumando a cinemateca apos o filme...");
        playerStreamming.desliga();
        amplificador.ajusteVolume(0);
        projetor.desliga();
        telao.sobe();
        luzes.liga();
        maquinaDePipoca.desliga();
        System.out.println();
    }
}
