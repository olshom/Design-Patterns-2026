package model;

import view.Observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Observable {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer o){
        observers.add(o);
    }
    public void deleteObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObservers(){
        for (Observer o:observers){
            o.update();
        }
    }
}
