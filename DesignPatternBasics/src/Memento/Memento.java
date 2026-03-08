/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import java.util.Date;

/**
 *
 * @author kinopp
 */
public class Memento {
    private String state;
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        System.out.println("Mementoに" + state + "が設定されました");
        this.state = state;
    }
}
