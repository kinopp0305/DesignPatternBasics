/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author kinopp
 */
public class Client {
    public static void main(String... args){
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        
        concreteAggregate.appendContent(new Content("１番目のコンテント"));
        concreteAggregate.appendContent(new Content("２番目のコンテント"));
        concreteAggregate.appendContent(new Content("３番目のコンテント"));

        Iterator iterator = concreteAggregate.iterator();
        while(iterator.hasNext()){
            Content content = (Content)iterator.next();
            System.out.println(content.getName());
        }
    }
}
