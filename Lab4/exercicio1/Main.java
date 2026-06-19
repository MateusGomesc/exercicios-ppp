package Lab4.exercicio1;

public class Main {
    public static void main(){
        Pizza marguerita = new Tomate(new Queijo(new MassaFina()));
        System.out.println(marguerita.getDescricao() + " custando " + marguerita.getPreco());
        Pizza portuguesa = new Tomate(new Ovo(new Queijo(new MassaGrossa())));
        System.out.println(portuguesa.getDescricao() + "  custando " + portuguesa.getPreco());
    }
}
