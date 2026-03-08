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
public class Client {
    public static void main(String... args){
        //使用する側に何の工場かは指定してもらう必要があるが、
        //何の製品かは意識させたくない。
        Factory factory = new ConcreteFactory();
        Product product = factory.create();
        //上記の代わりに以下の実装でも同様の処理となる。
        //ただし、利用者側が工場が作る製品を意識する必要が出てくる。
        //Product product = new ConcreteProduct();
        
        product.use();
    }
}
