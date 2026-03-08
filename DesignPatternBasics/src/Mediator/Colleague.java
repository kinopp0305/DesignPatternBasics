/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

/**
 *
 * @author kinopp
 */
public abstract class Colleague {
    private Mediator mediator;
    private String status;
    
    public String getStatus(){
        return this.status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }
    protected abstract void controlColleague(String message);
}
