package Lab2.exercicio1;

public class Apple implements FabricanteCelular {
    private Apple(){}

    private static Apple instance;

    public static Apple getInstance(){
        if(instance == null)
            instance = new Apple();
        return instance;
    }

    @Override
    public CelularApple constroiCelular(String modelo) {
        return AppleFactory.createCelular(modelo);
    }
}
