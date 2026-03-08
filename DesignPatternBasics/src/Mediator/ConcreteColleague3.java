/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

/**
 *
 * @author kinopp
 */
public class ConcreteColleague3 extends Colleague{

    @Override
    public void controlColleague(String message) {
        System.out.println("ConcreteColleague3が「" + message + "」のメッセージを受けました");
    }
    
}
