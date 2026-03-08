/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kinopp
 */
public class ConcretePrototype implements Prototype{

    private String initialString = "";
    private String secondString = "";
    
    @Override
    public Prototype createClone() {
        Prototype prototype = null;
        try {
            prototype = (ConcretePrototype)clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(ConcretePrototype.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prototype;
    }
    
    public void setInitialString(String initialString){
        this.initialString = initialString;
    }
    
    public String getInitialString(){
        return initialString;
    }
    
    public void setSecondString(String secondString){
        this.secondString = secondString;
    }
    
    public String getSecondString(){
        return secondString;
    }
    
}
