package Lab2.exercicio2;

// Criamos uma classe factory para a toyota para a criação de seus diferentes carros
public class ToyotaFactory{
    public static IVehicle createVehicle(String modelo){
        if(modelo.equals("Corolla"))
            return new Corolla();
        else
            return new Hilux();
    }
}
