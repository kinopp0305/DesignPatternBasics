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
public abstract class Factory {
    
    public final Product create(){
        Product product = factoryMethod();
        return product;
    }
    
    // 何の製品を作るかはサブクラスに任せる
    protected abstract Product factoryMethod();

}
