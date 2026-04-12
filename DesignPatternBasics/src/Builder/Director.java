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
public class Director {
    private Builder builder;
    
    public Director(Builder builder) {   
    	this.builder = builder;
    }
    
    public Object constract(){
        builder.buiderPart1("X");
        builder.buiderPart2("Y");
        builder.buiderPart3("Z");
        return builder.getResult();
    }
}
