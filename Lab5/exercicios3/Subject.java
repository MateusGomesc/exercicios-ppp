package Lab5.exercicios3;

import java.util.ArrayList;

abstract public class Subject {
    private ArrayList<Observer> observers;

    public Subject(){
        this.observers = new ArrayList<Observer>();
    }

    void registerObserver(Observer observer){
        this.observers.add(observer);
    }
    void removeObserver(Observer observer){
        this.observers.remove(observer);
    }
    void notifyObserver(Double dado){
        for(Observer observer : observers){
            observer.update(dado);
        }
    }
}
