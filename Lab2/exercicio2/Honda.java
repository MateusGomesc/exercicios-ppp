package Lab2.exercicio2;

// Criando um singleton pra a fabrica da honda pois so construimos a fabrica uma vez
public class Honda implements IVehicleMaker{
    public static Honda instance;

    private Honda(){}

    public static Honda getInstance(){
        if(instance == null)
            instance = new Honda();
        return instance;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        return HondaFactory.createVehicle(modelo);
    }
}
