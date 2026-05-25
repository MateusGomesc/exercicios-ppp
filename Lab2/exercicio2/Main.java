package Lab2.exercicio2;

public class Main {
    public static void main(){
        // Criando as fabricas
        IVehicleMaker honda = Honda.getInstance();
        IVehicleMaker toyota = Toyota.getInstance();

        // Instanciando dois civics diferentes mas feitos na mesma fabrica
        IVehicle civic1 = honda.makeVehicle("Civic");
        IVehicle civic2 = honda.makeVehicle("Civic");

        civic1.drive();
        civic2.drive();

        IVehicle hilux1 = toyota.makeVehicle("");
        IVehicle hilux2 = toyota.makeVehicle("");

        hilux1.start();
        hilux2.start();
    }
}
