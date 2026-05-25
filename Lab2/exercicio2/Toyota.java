package Lab2.exercicio2;

// Criando um singleton pra a fabrica da toyota pois so construimos a fabrica uma vez
public class Toyota implements IVehicleMaker{
    public static Toyota instance;

    private Toyota(){}

    public static Toyota getInstance(){
        if(instance == null)
            instance = new Toyota();
        return instance;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        return ToyotaFactory.createVehicle(modelo);
    }
}
