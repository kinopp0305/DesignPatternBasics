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
public class ConcreteFactory extends Factory{

    // ConcreteFactoryはConcreteProductを生成することをここに実装
    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }
    
}
