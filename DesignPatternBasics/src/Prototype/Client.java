/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author kinopp
 */
public class Client {
    public static void main(String... args){
        // プロトタイプ作成
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setInitialString("初期値設定しました");
        System.out.println("--- 雛形作成 ---");
        System.out.println(concretePrototype.getInitialString());
        System.out.println(concretePrototype.getSecondString());

        System.out.println("--- 雛形をコピーし「１」を追加 ---");
        ConcretePrototype prototype1 = (ConcretePrototype)concretePrototype.createClone();
        prototype1.setSecondString("１");
        System.out.println(prototype1.getInitialString());
        System.out.println(prototype1.getSecondString());
        
        System.out.println("--- 雛形をコピーし「２」を追加 ---");
        ConcretePrototype prototype2 = (ConcretePrototype)concretePrototype.createClone();
        prototype2.setSecondString("２");
        System.out.println(prototype2.getInitialString());
        System.out.println(prototype2.getSecondString());
    }
}
