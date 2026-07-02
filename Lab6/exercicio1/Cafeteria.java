package Lab6.exercicio1;

public class Cafeteria {
    public static void main(){
        Cafe cafe = new Cafe();
        Capuccino capuccino = new Capuccino();
        Cha cha = new Cha();

        cafe.fazerBebida();
        capuccino.fazerBebida();
        cha.fazerBebida();
    }
}
