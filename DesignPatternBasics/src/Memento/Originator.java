/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

/**
 *
 * @author kinopp
 */
public class Originator {
    
    private String state;
    
    public Memento createMemento(){
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }
    
    public void restoreMemento(Memento memento){
        this.state = memento.getState();
        System.out.println("Originatorに" + state + "が再設定されました");
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("Originatorに" + state + "が設定されました");
    }
    
}
