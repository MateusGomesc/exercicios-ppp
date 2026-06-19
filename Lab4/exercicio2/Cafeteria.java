package Lab4.exercicio2;

public class Cafeteria {
    public static void main(){
        Cafe expresso = new Leite(new Chocolate(new Expresso()));
        Cafe descafeinado = new Canela(new Leite(new Chocolate(new Decaf())));
        System.out.println(expresso.getDescricao() + " custando " + expresso.calculaCusto());
        System.out.println(descafeinado.getDescricao() + " custando " + descafeinado.calculaCusto());
    }
}
