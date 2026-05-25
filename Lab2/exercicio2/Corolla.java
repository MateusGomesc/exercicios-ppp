package Lab2.exercicio2;

public class Corolla implements IVehicle{
    @Override
    public void start() {
        System.out.println("Ligando Corolla");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo Corolla");
    }

    @Override
    public void stop() {
        System.out.println("Parando Corolla");
    }
}
