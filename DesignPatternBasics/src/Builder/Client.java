/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author kinopp
 */
public class Client {
    public static void main(String... args) throws Exception{
        Director director01 = new Director("ConcreteBuilder01");
        director01.constract();
        
        Director director02 = new Director("ConcreteBuilder02");
        director02.constract();
    }
}
