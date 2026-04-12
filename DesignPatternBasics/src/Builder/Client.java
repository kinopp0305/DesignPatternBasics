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
        Director director01 = new Director(new ConcreteBuilder01());
        System.out.println(director01.constract());
        
        Director director02 = new Director(new ConcreteBuilder02());
        System.out.println(director02.constract());
    }
}
