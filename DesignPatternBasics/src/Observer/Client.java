/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author kinopp
 */
public class Client {
    public static void main(String... aegs){
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.notifyObservers();
    }
}
