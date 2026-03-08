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
public class ConcreteSubject extends Subject{

    @Override
    public void getSubjectStatus() {
        System.out.println("ConcreteSubjectに変更が発生しました");
    }
    
}
