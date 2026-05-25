package Lab2.exercicio2;

public class Hilux implements IVehicle{
    @Override
    public void start() {
        System.out.println("Ligando hilux");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo hilux");
    }

    @Override
    public void stop() {
        System.out.println("Parando hilux");
    }
}
