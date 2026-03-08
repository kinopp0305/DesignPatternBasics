/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author kinopp
 */
public class Facade {
    
    // インスタンスの生成は不要
    private Facade(){
    }
    // 外部との窓口になるメソッド
    public static void facadeMethod(){
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        ClassC classC = new ClassC();
        
        classA.methodA();
        classB.methodB();
        classC.methodC();
    }
}
