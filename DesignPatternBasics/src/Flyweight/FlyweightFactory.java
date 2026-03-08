/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kinopp
 */
public class FlyweightFactory {
    private Map pool = new HashMap();
    
    private static FlyweightFactory singleton = new FlyweightFactory();
    
    private FlyweightFactory(){
    }
    
    public static FlyweightFactory getInstance(){
        return singleton;
    }
    
    public synchronized Flyweight getFlyweight(String key){
        Flyweight flyweight = (Flyweight)pool.get(key);
        if (flyweight == null){
            flyweight = new Flyweight();
            pool.put(key, flyweight);
            System.out.println("インスタンスを生成しました：" + key);
        }
        return flyweight;
    }    
}
