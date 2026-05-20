package Lab2.exercicio1;

public class SamsungFactory {
    public static CelularSamsung createCelular(String modelo){
        if(modelo.equals("20"))
            return new Galaxy20();
        else
            return new Galaxy8();
    }
}
