/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kinopp
 */
public class ConcreteMediator implements Mediator{

    private List<Colleague> colleagueList = new ArrayList();
    
    @Override
    public void addColleagues(Colleague colleague) {
        colleagueList.add(colleague);
    }

    @Override
    public void colleagueChanged() {
        int unUsedcount = 0;
        for(Colleague colleague : colleagueList){
            if (colleague.getStatus().equals("未使用")){
                unUsedcount += 1;
            }
        }
         
        String message = null;
        if(unUsedcount == 0){  //「未使用」が１つもない場合
            message = "もういっぱいです";
        } else {               //「未使用」がある場合
            message = "まだ使えます";
        }
        // Colleagueへメッセージを渡す
        for(Colleague colleague : colleagueList){
            colleague.controlColleague(message);
        }
    }
}
