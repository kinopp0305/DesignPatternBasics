/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author kinopp
 */
public class ConcreteProduct implements Product{

    @Override
    public void use() {
        System.out.println("ConcreteProductを使用します");
    }
    
}
