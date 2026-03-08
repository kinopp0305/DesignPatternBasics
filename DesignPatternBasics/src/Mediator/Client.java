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
public class Client {
    public static void main(String... args){
        
        Colleague colleague11 = new ConcreteColleague1();
        Colleague colleague12 = new ConcreteColleague1();
        Colleague colleague21 = new ConcreteColleague2();
        Colleague colleague31 = new ConcreteColleague3();
        
        // 1回目の判定（１つだけ未使用あり）
        Mediator mediator1 = new ConcreteMediator();

        colleague11.setStatus("未使用");
        colleague12.setStatus("使用済");
        colleague21.setStatus("使用済");
        colleague31.setStatus("使用済");
        
        mediator1.addColleagues(colleague11);
        mediator1.addColleagues(colleague12);
        mediator1.addColleagues(colleague21);
        mediator1.addColleagues(colleague31);
        
        mediator1.colleagueChanged();
        
        // 2回目の判定（未使用なし）
        Mediator mediator2 = new ConcreteMediator();
        
        colleague11.setStatus("使用済");
        colleague12.setStatus("使用済");
        colleague21.setStatus("使用済");
        colleague31.setStatus("使用済");
        
        mediator2.addColleagues(colleague11);
        mediator2.addColleagues(colleague12);
        mediator2.addColleagues(colleague21);
        mediator2.addColleagues(colleague31);
        
        mediator2.colleagueChanged();
    }
}