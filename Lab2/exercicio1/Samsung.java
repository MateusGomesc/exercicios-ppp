package Lab2.exercicio1;

public class Samsung implements FabricanteCelular{
    private Samsung(){};

    private static Samsung instance;

    public static Samsung getInstance(){
        if(instance == null)
            instance = new Samsung();
        return instance;
    }

    @Override
    public CelularSamsung constroiCelular(String modelo) {
        return SamsungFactory.createCelular(modelo);
    }
}
