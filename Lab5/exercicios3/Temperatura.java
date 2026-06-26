package Lab5.exercicios3;

import java.util.ArrayList;

public class Temperatura extends Subject{
    private double temp;


    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
        notifyObserver(temp);
    }
}
