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
public class ConcreteBuilder01 implements Builder{

    @Override
    public void buiderPart1() {
        System.out.println("01のbuilderPart1です");
    }

    @Override
    public void buiderPart2() {
        System.out.println("01のbuilderPart2です");
    }

    @Override
    public void buiderPart3() {
        System.out.println("01のbuilderPart3です");
    }
    
}
