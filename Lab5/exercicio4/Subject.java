package Lab5.exercicio4;

import Lab5.exercicios3.Observer;

import java.util.ArrayList;

public class Subject {
    private ArrayList<Investidor> observers;

    public Subject(){
        this.observers = new ArrayList<Investidor>();
    }

    void registrarInvestidor(Investidor investidor){
        this.observers.add(investidor);
    }

    void removeInvestidor(Observer investidor){
        this.observers.remove(investidor);
    }

    void notificarInvestidores(Acao acao){
        for(Investidor o : observers){
            o.update(acao);
        }
    }
}
