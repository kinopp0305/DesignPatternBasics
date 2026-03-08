/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kinopp
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();
    
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    
    public void notifyObservers(){
        getSubjectStatus();
        for(Observer observer : observers){
            observer.update();
        }
    }
    
    public abstract void getSubjectStatus();
}
