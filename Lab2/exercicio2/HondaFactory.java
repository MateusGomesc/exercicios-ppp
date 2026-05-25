package Lab2.exercicio2;

// Criamos uma classe factory para a honda para a criação de seus diferentes carros
public class HondaFactory {
    public static IVehicle createVehicle(String modelo){
        if(modelo.equals("Civic"))
            return new Civic();
        else
            return new City();
    }
}
