package Lab3.exercicio1;

public class PatoDomestico implements Pato{
    @Override
    public void grasnar(){
        System.out.println("Pato domestico está grasnando");
    }

    @Override
    public void voar(){
        System.out.println("Pato domestico está voando");
    }
}
