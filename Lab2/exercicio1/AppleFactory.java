package Lab2.exercicio1;

public class AppleFactory {
    public static CelularApple createCelular(String modelo){
        if(modelo.equals("16e"))
            return new Iphone16e();
        else
            return new Iphone15();
    }
}
